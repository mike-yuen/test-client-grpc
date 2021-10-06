import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid;
import com.texaspoker.moment.UserServiceGrpc;
import io.grpc.ChannelLogger;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Client {

    private final ManagedChannel channel;
    private final UserServiceGrpc.UserServiceBlockingStub blockingStub;

    protected Map<String, ?> getRetryingServiceConfig() {
        InputStreamReader config = new InputStreamReader(
                Client.class.getResourceAsStream("retrying-policy.json"), StandardCharsets.UTF_8
        );
        return new Gson().fromJson(new JsonReader(config), Map.class);
    }

    public Client(String host, int port) {
        ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext();
        Map<String, ?> serviceConfig = getRetryingServiceConfig();

        channelBuilder.defaultServiceConfig(serviceConfig).enableRetry();

        this.channel = channelBuilder.build();
        this.blockingStub = UserServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public UserBaseInfoNet getUserBaseInfo() throws StatusRuntimeException {
        UserBaseInfoUuid request = UserBaseInfoUuid.newBuilder().setUuid(342210L).build();
        UserBaseInfoNet response = blockingStub.getUserBaseInfo(request);
        return response;
    }

    public static void main(String[] args) throws Exception {
        Client client = new Client("localhost", 9133);
        try {
            System.out.println("result: " + client.getUserBaseInfo());
        } finally {
            client.shutdown();
        }
    }
}