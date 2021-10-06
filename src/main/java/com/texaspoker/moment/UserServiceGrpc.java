package com.texaspoker.moment;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.9.1)",
        comments = "Source: server_proto/TexasPokerUserService.proto")
public final class UserServiceGrpc {

    private UserServiceGrpc() {}

    public static final String SERVICE_NAME = "texaspoker.UserService";

    // Static method descriptors that strictly reflect the proto.
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserBaseInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet> METHOD_GET_USER_BASE_INFO = getGetUserBaseInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet> getGetUserBaseInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet> getGetUserBaseInfoMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet> getGetUserBaseInfoMethod;
        if ((getGetUserBaseInfoMethod = UserServiceGrpc.getGetUserBaseInfoMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserBaseInfoMethod = UserServiceGrpc.getGetUserBaseInfoMethod) == null) {
                    UserServiceGrpc.getGetUserBaseInfoMethod = getGetUserBaseInfoMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserBaseInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserBaseInfo"))
                                    .build();
                }
            }
        }
        return getGetUserBaseInfoMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserBaseInfoByShowIDMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse> METHOD_GET_USER_BASE_INFO_BY_SHOW_ID = getGetUserBaseInfoByShowIDMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse> getGetUserBaseInfoByShowIDMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse> getGetUserBaseInfoByShowIDMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest, com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse> getGetUserBaseInfoByShowIDMethod;
        if ((getGetUserBaseInfoByShowIDMethod = UserServiceGrpc.getGetUserBaseInfoByShowIDMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserBaseInfoByShowIDMethod = UserServiceGrpc.getGetUserBaseInfoByShowIDMethod) == null) {
                    UserServiceGrpc.getGetUserBaseInfoByShowIDMethod = getGetUserBaseInfoByShowIDMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest, com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserBaseInfoByShowID"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserBaseInfoByShowID"))
                                    .build();
                }
            }
        }
        return getGetUserBaseInfoByShowIDMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddNewUserBaseInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse> METHOD_ADD_NEW_USER_BASE_INFO = getAddNewUserBaseInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse> getAddNewUserBaseInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse> getAddNewUserBaseInfoMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest, com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse> getAddNewUserBaseInfoMethod;
        if ((getAddNewUserBaseInfoMethod = UserServiceGrpc.getAddNewUserBaseInfoMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddNewUserBaseInfoMethod = UserServiceGrpc.getAddNewUserBaseInfoMethod) == null) {
                    UserServiceGrpc.getAddNewUserBaseInfoMethod = getAddNewUserBaseInfoMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest, com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addNewUserBaseInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addNewUserBaseInfo"))
                                    .build();
                }
            }
        }
        return getAddNewUserBaseInfoMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddUserPopularityMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest,
            com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse> METHOD_ADD_USER_POPULARITY = getAddUserPopularityMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest,
            com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse> getAddUserPopularityMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest,
            com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse> getAddUserPopularityMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest, com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse> getAddUserPopularityMethod;
        if ((getAddUserPopularityMethod = UserServiceGrpc.getAddUserPopularityMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddUserPopularityMethod = UserServiceGrpc.getAddUserPopularityMethod) == null) {
                    UserServiceGrpc.getAddUserPopularityMethod = getAddUserPopularityMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest, com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addUserPopularity"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUserPopularity"))
                                    .build();
                }
            }
        }
        return getAddUserPopularityMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddUserCoinMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest,
            com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse> METHOD_ADD_USER_COIN = getAddUserCoinMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest,
            com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse> getAddUserCoinMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest,
            com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse> getAddUserCoinMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest, com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse> getAddUserCoinMethod;
        if ((getAddUserCoinMethod = UserServiceGrpc.getAddUserCoinMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddUserCoinMethod = UserServiceGrpc.getAddUserCoinMethod) == null) {
                    UserServiceGrpc.getAddUserCoinMethod = getAddUserCoinMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest, com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addUserCoin"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUserCoin"))
                                    .build();
                }
            }
        }
        return getAddUserCoinMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddUserPopularityTypeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse> METHOD_ADD_USER_POPULARITY_TYPE = getAddUserPopularityTypeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse> getAddUserPopularityTypeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse> getAddUserPopularityTypeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest, com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse> getAddUserPopularityTypeMethod;
        if ((getAddUserPopularityTypeMethod = UserServiceGrpc.getAddUserPopularityTypeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddUserPopularityTypeMethod = UserServiceGrpc.getAddUserPopularityTypeMethod) == null) {
                    UserServiceGrpc.getAddUserPopularityTypeMethod = getAddUserPopularityTypeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest, com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addUserPopularityType"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUserPopularityType"))
                                    .build();
                }
            }
        }
        return getAddUserPopularityTypeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddUserCoinTypeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse> METHOD_ADD_USER_COIN_TYPE = getAddUserCoinTypeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse> getAddUserCoinTypeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse> getAddUserCoinTypeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest, com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse> getAddUserCoinTypeMethod;
        if ((getAddUserCoinTypeMethod = UserServiceGrpc.getAddUserCoinTypeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddUserCoinTypeMethod = UserServiceGrpc.getAddUserCoinTypeMethod) == null) {
                    UserServiceGrpc.getAddUserCoinTypeMethod = getAddUserCoinTypeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest, com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addUserCoinType"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUserCoinType"))
                                    .build();
                }
            }
        }
        return getAddUserCoinTypeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserTypeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse> METHOD_SET_USER_TYPE = getSetUserTypeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse> getSetUserTypeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse> getSetUserTypeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse> getSetUserTypeMethod;
        if ((getSetUserTypeMethod = UserServiceGrpc.getSetUserTypeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserTypeMethod = UserServiceGrpc.getSetUserTypeMethod) == null) {
                    UserServiceGrpc.getSetUserTypeMethod = getSetUserTypeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserType"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserType"))
                                    .build();
                }
            }
        }
        return getSetUserTypeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserBaseInfoAlbumeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse> METHOD_SET_USER_BASE_INFO_ALBUME = getSetUserBaseInfoAlbumeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse> getSetUserBaseInfoAlbumeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse> getSetUserBaseInfoAlbumeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse> getSetUserBaseInfoAlbumeMethod;
        if ((getSetUserBaseInfoAlbumeMethod = UserServiceGrpc.getSetUserBaseInfoAlbumeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserBaseInfoAlbumeMethod = UserServiceGrpc.getSetUserBaseInfoAlbumeMethod) == null) {
                    UserServiceGrpc.getSetUserBaseInfoAlbumeMethod = getSetUserBaseInfoAlbumeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserBaseInfoAlbume"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserBaseInfoAlbume"))
                                    .build();
                }
            }
        }
        return getSetUserBaseInfoAlbumeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserBaseInfoCoverMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse> METHOD_SET_USER_BASE_INFO_COVER = getSetUserBaseInfoCoverMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse> getSetUserBaseInfoCoverMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse> getSetUserBaseInfoCoverMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse> getSetUserBaseInfoCoverMethod;
        if ((getSetUserBaseInfoCoverMethod = UserServiceGrpc.getSetUserBaseInfoCoverMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserBaseInfoCoverMethod = UserServiceGrpc.getSetUserBaseInfoCoverMethod) == null) {
                    UserServiceGrpc.getSetUserBaseInfoCoverMethod = getSetUserBaseInfoCoverMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserBaseInfoCover"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserBaseInfoCover"))
                                    .build();
                }
            }
        }
        return getSetUserBaseInfoCoverMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserBaseInfoVIPMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse> METHOD_SET_USER_BASE_INFO_VIP = getSetUserBaseInfoVIPMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse> getSetUserBaseInfoVIPMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse> getSetUserBaseInfoVIPMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse> getSetUserBaseInfoVIPMethod;
        if ((getSetUserBaseInfoVIPMethod = UserServiceGrpc.getSetUserBaseInfoVIPMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserBaseInfoVIPMethod = UserServiceGrpc.getSetUserBaseInfoVIPMethod) == null) {
                    UserServiceGrpc.getSetUserBaseInfoVIPMethod = getSetUserBaseInfoVIPMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserBaseInfoVIP"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserBaseInfoVIP"))
                                    .build();
                }
            }
        }
        return getSetUserBaseInfoVIPMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserBaseInfoLoginTimeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse> METHOD_SET_USER_BASE_INFO_LOGIN_TIME = getSetUserBaseInfoLoginTimeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse> getSetUserBaseInfoLoginTimeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse> getSetUserBaseInfoLoginTimeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse> getSetUserBaseInfoLoginTimeMethod;
        if ((getSetUserBaseInfoLoginTimeMethod = UserServiceGrpc.getSetUserBaseInfoLoginTimeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserBaseInfoLoginTimeMethod = UserServiceGrpc.getSetUserBaseInfoLoginTimeMethod) == null) {
                    UserServiceGrpc.getSetUserBaseInfoLoginTimeMethod = getSetUserBaseInfoLoginTimeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserBaseInfoLoginTime"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserBaseInfoLoginTime"))
                                    .build();
                }
            }
        }
        return getSetUserBaseInfoLoginTimeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserBaseInfoSettingMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse> METHOD_SET_USER_BASE_INFO_SETTING = getSetUserBaseInfoSettingMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse> getSetUserBaseInfoSettingMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse> getSetUserBaseInfoSettingMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest, com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse> getSetUserBaseInfoSettingMethod;
        if ((getSetUserBaseInfoSettingMethod = UserServiceGrpc.getSetUserBaseInfoSettingMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserBaseInfoSettingMethod = UserServiceGrpc.getSetUserBaseInfoSettingMethod) == null) {
                    UserServiceGrpc.getSetUserBaseInfoSettingMethod = getSetUserBaseInfoSettingMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest, com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserBaseInfoSetting"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserBaseInfoSetting"))
                                    .build();
                }
            }
        }
        return getSetUserBaseInfoSettingMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserBaseInfoLocalSettingMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse> METHOD_SET_USER_BASE_INFO_LOCAL_SETTING = getSetUserBaseInfoLocalSettingMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse> getSetUserBaseInfoLocalSettingMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse> getSetUserBaseInfoLocalSettingMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest, com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse> getSetUserBaseInfoLocalSettingMethod;
        if ((getSetUserBaseInfoLocalSettingMethod = UserServiceGrpc.getSetUserBaseInfoLocalSettingMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserBaseInfoLocalSettingMethod = UserServiceGrpc.getSetUserBaseInfoLocalSettingMethod) == null) {
                    UserServiceGrpc.getSetUserBaseInfoLocalSettingMethod = getSetUserBaseInfoLocalSettingMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest, com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserBaseInfoLocalSetting"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserBaseInfoLocalSetting"))
                                    .build();
                }
            }
        }
        return getSetUserBaseInfoLocalSettingMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserBaseInfoAppTypeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse> METHOD_SET_USER_BASE_INFO_APP_TYPE = getSetUserBaseInfoAppTypeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse> getSetUserBaseInfoAppTypeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse> getSetUserBaseInfoAppTypeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse> getSetUserBaseInfoAppTypeMethod;
        if ((getSetUserBaseInfoAppTypeMethod = UserServiceGrpc.getSetUserBaseInfoAppTypeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserBaseInfoAppTypeMethod = UserServiceGrpc.getSetUserBaseInfoAppTypeMethod) == null) {
                    UserServiceGrpc.getSetUserBaseInfoAppTypeMethod = getSetUserBaseInfoAppTypeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserBaseInfoAppType"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserBaseInfoAppType"))
                                    .build();
                }
            }
        }
        return getSetUserBaseInfoAppTypeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserBaseInfoCurrentVersionMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse> METHOD_SET_USER_BASE_INFO_CURRENT_VERSION = getSetUserBaseInfoCurrentVersionMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse> getSetUserBaseInfoCurrentVersionMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse> getSetUserBaseInfoCurrentVersionMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse> getSetUserBaseInfoCurrentVersionMethod;
        if ((getSetUserBaseInfoCurrentVersionMethod = UserServiceGrpc.getSetUserBaseInfoCurrentVersionMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserBaseInfoCurrentVersionMethod = UserServiceGrpc.getSetUserBaseInfoCurrentVersionMethod) == null) {
                    UserServiceGrpc.getSetUserBaseInfoCurrentVersionMethod = getSetUserBaseInfoCurrentVersionMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest, com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserBaseInfoCurrentVersion"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserBaseInfoCurrentVersion"))
                                    .build();
                }
            }
        }
        return getSetUserBaseInfoCurrentVersionMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getUploadUserCoverMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse> METHOD_UPLOAD_USER_COVER = getUploadUserCoverMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse> getUploadUserCoverMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse> getUploadUserCoverMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest, com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse> getUploadUserCoverMethod;
        if ((getUploadUserCoverMethod = UserServiceGrpc.getUploadUserCoverMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getUploadUserCoverMethod = UserServiceGrpc.getUploadUserCoverMethod) == null) {
                    UserServiceGrpc.getUploadUserCoverMethod = getUploadUserCoverMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest, com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "UploadUserCover"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UploadUserCover"))
                                    .build();
                }
            }
        }
        return getUploadUserCoverMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getDeleteUserCoverMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse> METHOD_DELETE_USER_COVER = getDeleteUserCoverMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse> getDeleteUserCoverMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest,
            com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse> getDeleteUserCoverMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest, com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse> getDeleteUserCoverMethod;
        if ((getDeleteUserCoverMethod = UserServiceGrpc.getDeleteUserCoverMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getDeleteUserCoverMethod = UserServiceGrpc.getDeleteUserCoverMethod) == null) {
                    UserServiceGrpc.getDeleteUserCoverMethod = getDeleteUserCoverMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest, com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "DeleteUserCover"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUserCover"))
                                    .build();
                }
            }
        }
        return getDeleteUserCoverMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserRegisterPWDMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp> METHOD_SET_USER_REGISTER_PWD = getSetUserRegisterPWDMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp> getSetUserRegisterPWDMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp> getSetUserRegisterPWDMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq, com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp> getSetUserRegisterPWDMethod;
        if ((getSetUserRegisterPWDMethod = UserServiceGrpc.getSetUserRegisterPWDMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserRegisterPWDMethod = UserServiceGrpc.getSetUserRegisterPWDMethod) == null) {
                    UserServiceGrpc.getSetUserRegisterPWDMethod = getSetUserRegisterPWDMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq, com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserRegisterPWD"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserRegisterPWD"))
                                    .build();
                }
            }
        }
        return getSetUserRegisterPWDMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserRegisterPWDMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp> METHOD_GET_USER_REGISTER_PWD = getGetUserRegisterPWDMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp> getGetUserRegisterPWDMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp> getGetUserRegisterPWDMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq, com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp> getGetUserRegisterPWDMethod;
        if ((getGetUserRegisterPWDMethod = UserServiceGrpc.getGetUserRegisterPWDMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserRegisterPWDMethod = UserServiceGrpc.getGetUserRegisterPWDMethod) == null) {
                    UserServiceGrpc.getGetUserRegisterPWDMethod = getGetUserRegisterPWDMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq, com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserRegisterPWD"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserRegisterPWD"))
                                    .build();
                }
            }
        }
        return getGetUserRegisterPWDMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserRegisterDataMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp> METHOD_SET_USER_REGISTER_DATA = getSetUserRegisterDataMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp> getSetUserRegisterDataMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp> getSetUserRegisterDataMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq, com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp> getSetUserRegisterDataMethod;
        if ((getSetUserRegisterDataMethod = UserServiceGrpc.getSetUserRegisterDataMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserRegisterDataMethod = UserServiceGrpc.getSetUserRegisterDataMethod) == null) {
                    UserServiceGrpc.getSetUserRegisterDataMethod = getSetUserRegisterDataMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq, com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserRegisterData"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserRegisterData"))
                                    .build();
                }
            }
        }
        return getSetUserRegisterDataMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserRegisterDataMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp> METHOD_GET_USER_REGISTER_DATA = getGetUserRegisterDataMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp> getGetUserRegisterDataMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp> getGetUserRegisterDataMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq, com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp> getGetUserRegisterDataMethod;
        if ((getGetUserRegisterDataMethod = UserServiceGrpc.getGetUserRegisterDataMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserRegisterDataMethod = UserServiceGrpc.getGetUserRegisterDataMethod) == null) {
                    UserServiceGrpc.getGetUserRegisterDataMethod = getGetUserRegisterDataMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq, com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserRegisterData"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserRegisterData"))
                                    .build();
                }
            }
        }
        return getGetUserRegisterDataMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserRegisterVerifyCodeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp> METHOD_SET_USER_REGISTER_VERIFY_CODE = getSetUserRegisterVerifyCodeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp> getSetUserRegisterVerifyCodeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq,
            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp> getSetUserRegisterVerifyCodeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq, com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp> getSetUserRegisterVerifyCodeMethod;
        if ((getSetUserRegisterVerifyCodeMethod = UserServiceGrpc.getSetUserRegisterVerifyCodeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserRegisterVerifyCodeMethod = UserServiceGrpc.getSetUserRegisterVerifyCodeMethod) == null) {
                    UserServiceGrpc.getSetUserRegisterVerifyCodeMethod = getSetUserRegisterVerifyCodeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq, com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserRegisterVerifyCode"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserRegisterVerifyCode"))
                                    .build();
                }
            }
        }
        return getSetUserRegisterVerifyCodeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserRegisterVerifyCodeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp> METHOD_GET_USER_REGISTER_VERIFY_CODE = getGetUserRegisterVerifyCodeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp> getGetUserRegisterVerifyCodeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq,
            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp> getGetUserRegisterVerifyCodeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq, com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp> getGetUserRegisterVerifyCodeMethod;
        if ((getGetUserRegisterVerifyCodeMethod = UserServiceGrpc.getGetUserRegisterVerifyCodeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserRegisterVerifyCodeMethod = UserServiceGrpc.getGetUserRegisterVerifyCodeMethod) == null) {
                    UserServiceGrpc.getGetUserRegisterVerifyCodeMethod = getGetUserRegisterVerifyCodeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq, com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserRegisterVerifyCode"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserRegisterVerifyCode"))
                                    .build();
                }
            }
        }
        return getGetUserRegisterVerifyCodeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetNewUuidMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> METHOD_GET_NEW_UUID = getGetNewUuidMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getGetNewUuidMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getGetNewUuidMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid, com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getGetNewUuidMethod;
        if ((getGetNewUuidMethod = UserServiceGrpc.getGetNewUuidMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetNewUuidMethod = UserServiceGrpc.getGetNewUuidMethod) == null) {
                    UserServiceGrpc.getGetNewUuidMethod = getGetNewUuidMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid, com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getNewUuid"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getNewUuid"))
                                    .build();
                }
            }
        }
        return getGetNewUuidMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddUserCreateGameRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse> METHOD_ADD_USER_CREATE_GAME_ROOMS = getAddUserCreateGameRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse> getAddUserCreateGameRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse> getAddUserCreateGameRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest, com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse> getAddUserCreateGameRoomsMethod;
        if ((getAddUserCreateGameRoomsMethod = UserServiceGrpc.getAddUserCreateGameRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddUserCreateGameRoomsMethod = UserServiceGrpc.getAddUserCreateGameRoomsMethod) == null) {
                    UserServiceGrpc.getAddUserCreateGameRoomsMethod = getAddUserCreateGameRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest, com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addUserCreateGameRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUserCreateGameRooms"))
                                    .build();
                }
            }
        }
        return getAddUserCreateGameRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserCreateGameRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse> METHOD_REMOVE_USER_CREATE_GAME_ROOMS = getRemoveUserCreateGameRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse> getRemoveUserCreateGameRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse> getRemoveUserCreateGameRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse> getRemoveUserCreateGameRoomsMethod;
        if ((getRemoveUserCreateGameRoomsMethod = UserServiceGrpc.getRemoveUserCreateGameRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserCreateGameRoomsMethod = UserServiceGrpc.getRemoveUserCreateGameRoomsMethod) == null) {
                    UserServiceGrpc.getRemoveUserCreateGameRoomsMethod = getRemoveUserCreateGameRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserCreateGameRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserCreateGameRooms"))
                                    .build();
                }
            }
        }
        return getRemoveUserCreateGameRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserCreateGameRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse> METHOD_GET_USER_CREATE_GAME_ROOMS = getGetUserCreateGameRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse> getGetUserCreateGameRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse> getGetUserCreateGameRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest, com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse> getGetUserCreateGameRoomsMethod;
        if ((getGetUserCreateGameRoomsMethod = UserServiceGrpc.getGetUserCreateGameRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserCreateGameRoomsMethod = UserServiceGrpc.getGetUserCreateGameRoomsMethod) == null) {
                    UserServiceGrpc.getGetUserCreateGameRoomsMethod = getGetUserCreateGameRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest, com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserCreateGameRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserCreateGameRooms"))
                                    .build();
                }
            }
        }
        return getGetUserCreateGameRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddUserClubsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserClubRequest,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> METHOD_ADD_USER_CLUBS = getAddUserClubsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserClubRequest,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getAddUserClubsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserClubRequest,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getAddUserClubsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserClubRequest, com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getAddUserClubsMethod;
        if ((getAddUserClubsMethod = UserServiceGrpc.getAddUserClubsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddUserClubsMethod = UserServiceGrpc.getAddUserClubsMethod) == null) {
                    UserServiceGrpc.getAddUserClubsMethod = getAddUserClubsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UserClubRequest, com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addUserClubs"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserClubRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUserClubs"))
                                    .build();
                }
            }
        }
        return getAddUserClubsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserClubsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerUserService.UserClubsNet> METHOD_GET_USER_CLUBS = getGetUserClubsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerUserService.UserClubsNet> getGetUserClubsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
            com.texaspoker.moment.TexasPokerUserService.UserClubsNet> getGetUserClubsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid, com.texaspoker.moment.TexasPokerUserService.UserClubsNet> getGetUserClubsMethod;
        if ((getGetUserClubsMethod = UserServiceGrpc.getGetUserClubsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserClubsMethod = UserServiceGrpc.getGetUserClubsMethod) == null) {
                    UserServiceGrpc.getGetUserClubsMethod = getGetUserClubsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid, com.texaspoker.moment.TexasPokerUserService.UserClubsNet>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserClubs"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserClubsNet.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserClubs"))
                                    .build();
                }
            }
        }
        return getGetUserClubsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserClubsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserClubRequest,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> METHOD_REMOVE_USER_CLUBS = getRemoveUserClubsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserClubRequest,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getRemoveUserClubsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserClubRequest,
            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getRemoveUserClubsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UserClubRequest, com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getRemoveUserClubsMethod;
        if ((getRemoveUserClubsMethod = UserServiceGrpc.getRemoveUserClubsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserClubsMethod = UserServiceGrpc.getRemoveUserClubsMethod) == null) {
                    UserServiceGrpc.getRemoveUserClubsMethod = getRemoveUserClubsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UserClubRequest, com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserClubs"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserClubRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserClubs"))
                                    .build();
                }
            }
        }
        return getRemoveUserClubsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddUserChatRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse> METHOD_ADD_USER_CHAT_ROOMS = getAddUserChatRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse> getAddUserChatRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse> getAddUserChatRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest, com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse> getAddUserChatRoomsMethod;
        if ((getAddUserChatRoomsMethod = UserServiceGrpc.getAddUserChatRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddUserChatRoomsMethod = UserServiceGrpc.getAddUserChatRoomsMethod) == null) {
                    UserServiceGrpc.getAddUserChatRoomsMethod = getAddUserChatRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest, com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addUserChatRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUserChatRooms"))
                                    .build();
                }
            }
        }
        return getAddUserChatRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserChatRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse> METHOD_REMOVE_USER_CHAT_ROOMS = getRemoveUserChatRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse> getRemoveUserChatRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse> getRemoveUserChatRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse> getRemoveUserChatRoomsMethod;
        if ((getRemoveUserChatRoomsMethod = UserServiceGrpc.getRemoveUserChatRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserChatRoomsMethod = UserServiceGrpc.getRemoveUserChatRoomsMethod) == null) {
                    UserServiceGrpc.getRemoveUserChatRoomsMethod = getRemoveUserChatRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserChatRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserChatRooms"))
                                    .build();
                }
            }
        }
        return getRemoveUserChatRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserChatRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse> METHOD_GET_USER_CHAT_ROOMS = getGetUserChatRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse> getGetUserChatRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse> getGetUserChatRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest, com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse> getGetUserChatRoomsMethod;
        if ((getGetUserChatRoomsMethod = UserServiceGrpc.getGetUserChatRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserChatRoomsMethod = UserServiceGrpc.getGetUserChatRoomsMethod) == null) {
                    UserServiceGrpc.getGetUserChatRoomsMethod = getGetUserChatRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest, com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserChatRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserChatRooms"))
                                    .build();
                }
            }
        }
        return getGetUserChatRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserInTableMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse> METHOD_SET_USER_IN_TABLE = getSetUserInTableMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse> getSetUserInTableMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse> getSetUserInTableMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest, com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse> getSetUserInTableMethod;
        if ((getSetUserInTableMethod = UserServiceGrpc.getSetUserInTableMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserInTableMethod = UserServiceGrpc.getSetUserInTableMethod) == null) {
                    UserServiceGrpc.getSetUserInTableMethod = getSetUserInTableMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest, com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserInTable"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserInTable"))
                                    .build();
                }
            }
        }
        return getSetUserInTableMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserInTableMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse> METHOD_REMOVE_USER_IN_TABLE = getRemoveUserInTableMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse> getRemoveUserInTableMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse> getRemoveUserInTableMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse> getRemoveUserInTableMethod;
        if ((getRemoveUserInTableMethod = UserServiceGrpc.getRemoveUserInTableMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserInTableMethod = UserServiceGrpc.getRemoveUserInTableMethod) == null) {
                    UserServiceGrpc.getRemoveUserInTableMethod = getRemoveUserInTableMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserInTable"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserInTable"))
                                    .build();
                }
            }
        }
        return getRemoveUserInTableMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserInTableMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse> METHOD_GET_USER_IN_TABLE = getGetUserInTableMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse> getGetUserInTableMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse> getGetUserInTableMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest, com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse> getGetUserInTableMethod;
        if ((getGetUserInTableMethod = UserServiceGrpc.getGetUserInTableMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserInTableMethod = UserServiceGrpc.getGetUserInTableMethod) == null) {
                    UserServiceGrpc.getGetUserInTableMethod = getGetUserInTableMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest, com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserInTable"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserInTable"))
                                    .build();
                }
            }
        }
        return getGetUserInTableMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserTokenInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse> METHOD_GET_USER_TOKEN_INFO = getGetUserTokenInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse> getGetUserTokenInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse> getGetUserTokenInfoMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest, com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse> getGetUserTokenInfoMethod;
        if ((getGetUserTokenInfoMethod = UserServiceGrpc.getGetUserTokenInfoMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserTokenInfoMethod = UserServiceGrpc.getGetUserTokenInfoMethod) == null) {
                    UserServiceGrpc.getGetUserTokenInfoMethod = getGetUserTokenInfoMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest, com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserTokenInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserTokenInfo"))
                                    .build();
                }
            }
        }
        return getGetUserTokenInfoMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserSSOTokenInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse> METHOD_SET_USER_SSOTOKEN_INFO = getSetUserSSOTokenInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse> getSetUserSSOTokenInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse> getSetUserSSOTokenInfoMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest, com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse> getSetUserSSOTokenInfoMethod;
        if ((getSetUserSSOTokenInfoMethod = UserServiceGrpc.getSetUserSSOTokenInfoMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserSSOTokenInfoMethod = UserServiceGrpc.getSetUserSSOTokenInfoMethod) == null) {
                    UserServiceGrpc.getSetUserSSOTokenInfoMethod = getSetUserSSOTokenInfoMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest, com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserSSOTokenInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserSSOTokenInfo"))
                                    .build();
                }
            }
        }
        return getSetUserSSOTokenInfoMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserAPNTokenInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse> METHOD_SET_USER_APNTOKEN_INFO = getSetUserAPNTokenInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse> getSetUserAPNTokenInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse> getSetUserAPNTokenInfoMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest, com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse> getSetUserAPNTokenInfoMethod;
        if ((getSetUserAPNTokenInfoMethod = UserServiceGrpc.getSetUserAPNTokenInfoMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserAPNTokenInfoMethod = UserServiceGrpc.getSetUserAPNTokenInfoMethod) == null) {
                    UserServiceGrpc.getSetUserAPNTokenInfoMethod = getSetUserAPNTokenInfoMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest, com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserAPNTokenInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserAPNTokenInfo"))
                                    .build();
                }
            }
        }
        return getSetUserAPNTokenInfoMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getClearAPNTokenInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse> METHOD_CLEAR_APNTOKEN_INFO = getClearAPNTokenInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse> getClearAPNTokenInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse> getClearAPNTokenInfoMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest, com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse> getClearAPNTokenInfoMethod;
        if ((getClearAPNTokenInfoMethod = UserServiceGrpc.getClearAPNTokenInfoMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getClearAPNTokenInfoMethod = UserServiceGrpc.getClearAPNTokenInfoMethod) == null) {
                    UserServiceGrpc.getClearAPNTokenInfoMethod = getClearAPNTokenInfoMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest, com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "clearAPNTokenInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("clearAPNTokenInfo"))
                                    .build();
                }
            }
        }
        return getClearAPNTokenInfoMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserQuickRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse> METHOD_SET_USER_QUICK_ROOMS = getSetUserQuickRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse> getSetUserQuickRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse> getSetUserQuickRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest, com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse> getSetUserQuickRoomsMethod;
        if ((getSetUserQuickRoomsMethod = UserServiceGrpc.getSetUserQuickRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserQuickRoomsMethod = UserServiceGrpc.getSetUserQuickRoomsMethod) == null) {
                    UserServiceGrpc.getSetUserQuickRoomsMethod = getSetUserQuickRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest, com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserQuickRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserQuickRooms"))
                                    .build();
                }
            }
        }
        return getSetUserQuickRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserQuickRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse> METHOD_GET_USER_QUICK_ROOMS = getGetUserQuickRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse> getGetUserQuickRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse> getGetUserQuickRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest, com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse> getGetUserQuickRoomsMethod;
        if ((getGetUserQuickRoomsMethod = UserServiceGrpc.getGetUserQuickRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserQuickRoomsMethod = UserServiceGrpc.getGetUserQuickRoomsMethod) == null) {
                    UserServiceGrpc.getGetUserQuickRoomsMethod = getGetUserQuickRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest, com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserQuickRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserQuickRooms"))
                                    .build();
                }
            }
        }
        return getGetUserQuickRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserQuickRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse> METHOD_REMOVE_USER_QUICK_ROOMS = getRemoveUserQuickRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse> getRemoveUserQuickRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse> getRemoveUserQuickRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse> getRemoveUserQuickRoomsMethod;
        if ((getRemoveUserQuickRoomsMethod = UserServiceGrpc.getRemoveUserQuickRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserQuickRoomsMethod = UserServiceGrpc.getRemoveUserQuickRoomsMethod) == null) {
                    UserServiceGrpc.getRemoveUserQuickRoomsMethod = getRemoveUserQuickRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserQuickRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserQuickRooms"))
                                    .build();
                }
            }
        }
        return getRemoveUserQuickRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserStandByRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse> METHOD_SET_USER_STAND_BY_ROOMS = getSetUserStandByRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse> getSetUserStandByRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse> getSetUserStandByRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest, com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse> getSetUserStandByRoomsMethod;
        if ((getSetUserStandByRoomsMethod = UserServiceGrpc.getSetUserStandByRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserStandByRoomsMethod = UserServiceGrpc.getSetUserStandByRoomsMethod) == null) {
                    UserServiceGrpc.getSetUserStandByRoomsMethod = getSetUserStandByRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest, com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserStandByRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserStandByRooms"))
                                    .build();
                }
            }
        }
        return getSetUserStandByRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserStandByRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse> METHOD_REMOVE_USER_STAND_BY_ROOMS = getRemoveUserStandByRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse> getRemoveUserStandByRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse> getRemoveUserStandByRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse> getRemoveUserStandByRoomsMethod;
        if ((getRemoveUserStandByRoomsMethod = UserServiceGrpc.getRemoveUserStandByRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserStandByRoomsMethod = UserServiceGrpc.getRemoveUserStandByRoomsMethod) == null) {
                    UserServiceGrpc.getRemoveUserStandByRoomsMethod = getRemoveUserStandByRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserStandByRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserStandByRooms"))
                                    .build();
                }
            }
        }
        return getRemoveUserStandByRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserStandByRoomsMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse> METHOD_GET_USER_STAND_BY_ROOMS = getGetUserStandByRoomsMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse> getGetUserStandByRoomsMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse> getGetUserStandByRoomsMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest, com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse> getGetUserStandByRoomsMethod;
        if ((getGetUserStandByRoomsMethod = UserServiceGrpc.getGetUserStandByRoomsMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserStandByRoomsMethod = UserServiceGrpc.getGetUserStandByRoomsMethod) == null) {
                    UserServiceGrpc.getGetUserStandByRoomsMethod = getGetUserStandByRoomsMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest, com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "GetUserStandByRooms"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserStandByRooms"))
                                    .build();
                }
            }
        }
        return getGetUserStandByRoomsMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserBaseInfoIDMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse> METHOD_GET_USER_BASE_INFO_ID = getGetUserBaseInfoIDMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse> getGetUserBaseInfoIDMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse> getGetUserBaseInfoIDMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest, com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse> getGetUserBaseInfoIDMethod;
        if ((getGetUserBaseInfoIDMethod = UserServiceGrpc.getGetUserBaseInfoIDMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserBaseInfoIDMethod = UserServiceGrpc.getGetUserBaseInfoIDMethod) == null) {
                    UserServiceGrpc.getGetUserBaseInfoIDMethod = getGetUserBaseInfoIDMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest, com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserBaseInfoID"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserBaseInfoID"))
                                    .build();
                }
            }
        }
        return getGetUserBaseInfoIDMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserAccessTokenMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse> METHOD_GET_USER_ACCESS_TOKEN = getGetUserAccessTokenMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse> getGetUserAccessTokenMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse> getGetUserAccessTokenMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest, com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse> getGetUserAccessTokenMethod;
        if ((getGetUserAccessTokenMethod = UserServiceGrpc.getGetUserAccessTokenMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserAccessTokenMethod = UserServiceGrpc.getGetUserAccessTokenMethod) == null) {
                    UserServiceGrpc.getGetUserAccessTokenMethod = getGetUserAccessTokenMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest, com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserAccessToken"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserAccessToken"))
                                    .build();
                }
            }
        }
        return getGetUserAccessTokenMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserAccessTokenMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse> METHOD_SET_USER_ACCESS_TOKEN = getSetUserAccessTokenMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse> getSetUserAccessTokenMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse> getSetUserAccessTokenMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest, com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse> getSetUserAccessTokenMethod;
        if ((getSetUserAccessTokenMethod = UserServiceGrpc.getSetUserAccessTokenMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserAccessTokenMethod = UserServiceGrpc.getSetUserAccessTokenMethod) == null) {
                    UserServiceGrpc.getSetUserAccessTokenMethod = getSetUserAccessTokenMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest, com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserAccessToken"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserAccessToken"))
                                    .build();
                }
            }
        }
        return getSetUserAccessTokenMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserAccessTokenMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse> METHOD_REMOVE_USER_ACCESS_TOKEN = getRemoveUserAccessTokenMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse> getRemoveUserAccessTokenMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse> getRemoveUserAccessTokenMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse> getRemoveUserAccessTokenMethod;
        if ((getRemoveUserAccessTokenMethod = UserServiceGrpc.getRemoveUserAccessTokenMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserAccessTokenMethod = UserServiceGrpc.getRemoveUserAccessTokenMethod) == null) {
                    UserServiceGrpc.getRemoveUserAccessTokenMethod = getRemoveUserAccessTokenMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserAccessToken"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserAccessToken"))
                                    .build();
                }
            }
        }
        return getRemoveUserAccessTokenMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserCryptKeyMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse> METHOD_GET_USER_CRYPT_KEY = getGetUserCryptKeyMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse> getGetUserCryptKeyMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse> getGetUserCryptKeyMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest, com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse> getGetUserCryptKeyMethod;
        if ((getGetUserCryptKeyMethod = UserServiceGrpc.getGetUserCryptKeyMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserCryptKeyMethod = UserServiceGrpc.getGetUserCryptKeyMethod) == null) {
                    UserServiceGrpc.getGetUserCryptKeyMethod = getGetUserCryptKeyMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest, com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserCryptKey"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserCryptKey"))
                                    .build();
                }
            }
        }
        return getGetUserCryptKeyMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserCryptKeyMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse> METHOD_SET_USER_CRYPT_KEY = getSetUserCryptKeyMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse> getSetUserCryptKeyMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse> getSetUserCryptKeyMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest, com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse> getSetUserCryptKeyMethod;
        if ((getSetUserCryptKeyMethod = UserServiceGrpc.getSetUserCryptKeyMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserCryptKeyMethod = UserServiceGrpc.getSetUserCryptKeyMethod) == null) {
                    UserServiceGrpc.getSetUserCryptKeyMethod = getSetUserCryptKeyMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest, com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserCryptKey"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserCryptKey"))
                                    .build();
                }
            }
        }
        return getSetUserCryptKeyMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserCryptKeyMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse> METHOD_REMOVE_USER_CRYPT_KEY = getRemoveUserCryptKeyMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse> getRemoveUserCryptKeyMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse> getRemoveUserCryptKeyMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse> getRemoveUserCryptKeyMethod;
        if ((getRemoveUserCryptKeyMethod = UserServiceGrpc.getRemoveUserCryptKeyMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserCryptKeyMethod = UserServiceGrpc.getRemoveUserCryptKeyMethod) == null) {
                    UserServiceGrpc.getRemoveUserCryptKeyMethod = getRemoveUserCryptKeyMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserCryptKey"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserCryptKey"))
                                    .build();
                }
            }
        }
        return getRemoveUserCryptKeyMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getCheckUserCoinMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse> METHOD_CHECK_USER_COIN = getCheckUserCoinMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse> getCheckUserCoinMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse> getCheckUserCoinMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest, com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse> getCheckUserCoinMethod;
        if ((getCheckUserCoinMethod = UserServiceGrpc.getCheckUserCoinMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getCheckUserCoinMethod = UserServiceGrpc.getCheckUserCoinMethod) == null) {
                    UserServiceGrpc.getCheckUserCoinMethod = getCheckUserCoinMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest, com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "checkUserCoin"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("checkUserCoin"))
                                    .build();
                }
            }
        }
        return getCheckUserCoinMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getCheckUserPopularityMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse> METHOD_CHECK_USER_POPULARITY = getCheckUserPopularityMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse> getCheckUserPopularityMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse> getCheckUserPopularityMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest, com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse> getCheckUserPopularityMethod;
        if ((getCheckUserPopularityMethod = UserServiceGrpc.getCheckUserPopularityMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getCheckUserPopularityMethod = UserServiceGrpc.getCheckUserPopularityMethod) == null) {
                    UserServiceGrpc.getCheckUserPopularityMethod = getCheckUserPopularityMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest, com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "checkUserPopularity"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("checkUserPopularity"))
                                    .build();
                }
            }
        }
        return getCheckUserPopularityMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getAddUserMTTGameMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse> METHOD_ADD_USER_MTTGAME = getAddUserMTTGameMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse> getAddUserMTTGameMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest,
            com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse> getAddUserMTTGameMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest, com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse> getAddUserMTTGameMethod;
        if ((getAddUserMTTGameMethod = UserServiceGrpc.getAddUserMTTGameMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getAddUserMTTGameMethod = UserServiceGrpc.getAddUserMTTGameMethod) == null) {
                    UserServiceGrpc.getAddUserMTTGameMethod = getAddUserMTTGameMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest, com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "addUserMTTGame"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addUserMTTGame"))
                                    .build();
                }
            }
        }
        return getAddUserMTTGameMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getRemoveUserMTTGameMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse> METHOD_REMOVE_USER_MTTGAME = getRemoveUserMTTGameMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse> getRemoveUserMTTGameMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest,
            com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse> getRemoveUserMTTGameMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse> getRemoveUserMTTGameMethod;
        if ((getRemoveUserMTTGameMethod = UserServiceGrpc.getRemoveUserMTTGameMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getRemoveUserMTTGameMethod = UserServiceGrpc.getRemoveUserMTTGameMethod) == null) {
                    UserServiceGrpc.getRemoveUserMTTGameMethod = getRemoveUserMTTGameMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest, com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "removeUserMTTGame"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("removeUserMTTGame"))
                                    .build();
                }
            }
        }
        return getRemoveUserMTTGameMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserMTTGamesMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse> METHOD_GET_USER_MTTGAMES = getGetUserMTTGamesMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse> getGetUserMTTGamesMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse> getGetUserMTTGamesMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest, com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse> getGetUserMTTGamesMethod;
        if ((getGetUserMTTGamesMethod = UserServiceGrpc.getGetUserMTTGamesMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserMTTGamesMethod = UserServiceGrpc.getGetUserMTTGamesMethod) == null) {
                    UserServiceGrpc.getGetUserMTTGamesMethod = getGetUserMTTGamesMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest, com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserMTTGames"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserMTTGames"))
                                    .build();
                }
            }
        }
        return getGetUserMTTGamesMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUuidByStridMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse> METHOD_GET_UUID_BY_STRID = getGetUuidByStridMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse> getGetUuidByStridMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse> getGetUuidByStridMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest, com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse> getGetUuidByStridMethod;
        if ((getGetUuidByStridMethod = UserServiceGrpc.getGetUuidByStridMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUuidByStridMethod = UserServiceGrpc.getGetUuidByStridMethod) == null) {
                    UserServiceGrpc.getGetUuidByStridMethod = getGetUuidByStridMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest, com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUuidByStrid"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUuidByStrid"))
                                    .build();
                }
            }
        }
        return getGetUuidByStridMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserBaseInfosByBatchMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse> METHOD_GET_USER_BASE_INFOS_BY_BATCH = getGetUserBaseInfosByBatchMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse> getGetUserBaseInfosByBatchMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse> getGetUserBaseInfosByBatchMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest, com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse> getGetUserBaseInfosByBatchMethod;
        if ((getGetUserBaseInfosByBatchMethod = UserServiceGrpc.getGetUserBaseInfosByBatchMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserBaseInfosByBatchMethod = UserServiceGrpc.getGetUserBaseInfosByBatchMethod) == null) {
                    UserServiceGrpc.getGetUserBaseInfosByBatchMethod = getGetUserBaseInfosByBatchMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest, com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserBaseInfosByBatch"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserBaseInfosByBatch"))
                                    .build();
                }
            }
        }
        return getGetUserBaseInfosByBatchMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserSecurityStatusMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse> METHOD_SET_USER_SECURITY_STATUS = getSetUserSecurityStatusMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse> getSetUserSecurityStatusMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse> getSetUserSecurityStatusMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest, com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse> getSetUserSecurityStatusMethod;
        if ((getSetUserSecurityStatusMethod = UserServiceGrpc.getSetUserSecurityStatusMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserSecurityStatusMethod = UserServiceGrpc.getSetUserSecurityStatusMethod) == null) {
                    UserServiceGrpc.getSetUserSecurityStatusMethod = getSetUserSecurityStatusMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest, com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserSecurityStatus"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserSecurityStatus"))
                                    .build();
                }
            }
        }
        return getSetUserSecurityStatusMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserProtectStatusMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse> METHOD_SET_USER_PROTECT_STATUS = getSetUserProtectStatusMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse> getSetUserProtectStatusMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse> getSetUserProtectStatusMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest, com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse> getSetUserProtectStatusMethod;
        if ((getSetUserProtectStatusMethod = UserServiceGrpc.getSetUserProtectStatusMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserProtectStatusMethod = UserServiceGrpc.getSetUserProtectStatusMethod) == null) {
                    UserServiceGrpc.getSetUserProtectStatusMethod = getSetUserProtectStatusMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest, com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserProtectStatus"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserProtectStatus"))
                                    .build();
                }
            }
        }
        return getSetUserProtectStatusMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserSecurityCodeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse> METHOD_SET_USER_SECURITY_CODE = getSetUserSecurityCodeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse> getSetUserSecurityCodeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse> getSetUserSecurityCodeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse> getSetUserSecurityCodeMethod;
        if ((getSetUserSecurityCodeMethod = UserServiceGrpc.getSetUserSecurityCodeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserSecurityCodeMethod = UserServiceGrpc.getSetUserSecurityCodeMethod) == null) {
                    UserServiceGrpc.getSetUserSecurityCodeMethod = getSetUserSecurityCodeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest, com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserSecurityCode"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserSecurityCode"))
                                    .build();
                }
            }
        }
        return getSetUserSecurityCodeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserSecurityCodeMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse> METHOD_GET_USER_SECURITY_CODE = getGetUserSecurityCodeMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse> getGetUserSecurityCodeMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse> getGetUserSecurityCodeMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest, com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse> getGetUserSecurityCodeMethod;
        if ((getGetUserSecurityCodeMethod = UserServiceGrpc.getGetUserSecurityCodeMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserSecurityCodeMethod = UserServiceGrpc.getGetUserSecurityCodeMethod) == null) {
                    UserServiceGrpc.getGetUserSecurityCodeMethod = getGetUserSecurityCodeMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest, com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserSecurityCode"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserSecurityCode"))
                                    .build();
                }
            }
        }
        return getGetUserSecurityCodeMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getUpdateUserLimitTokenMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse> METHOD_UPDATE_USER_LIMIT_TOKEN = getUpdateUserLimitTokenMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse> getUpdateUserLimitTokenMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse> getUpdateUserLimitTokenMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest, com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse> getUpdateUserLimitTokenMethod;
        if ((getUpdateUserLimitTokenMethod = UserServiceGrpc.getUpdateUserLimitTokenMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getUpdateUserLimitTokenMethod = UserServiceGrpc.getUpdateUserLimitTokenMethod) == null) {
                    UserServiceGrpc.getUpdateUserLimitTokenMethod = getUpdateUserLimitTokenMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest, com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "updateUserLimitToken"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updateUserLimitToken"))
                                    .build();
                }
            }
        }
        return getUpdateUserLimitTokenMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetLastUserLoginTokenMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse> METHOD_SET_LAST_USER_LOGIN_TOKEN = getSetLastUserLoginTokenMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse> getSetLastUserLoginTokenMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse> getSetLastUserLoginTokenMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest, com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse> getSetLastUserLoginTokenMethod;
        if ((getSetLastUserLoginTokenMethod = UserServiceGrpc.getSetLastUserLoginTokenMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetLastUserLoginTokenMethod = UserServiceGrpc.getSetLastUserLoginTokenMethod) == null) {
                    UserServiceGrpc.getSetLastUserLoginTokenMethod = getSetLastUserLoginTokenMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest, com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setLastUserLoginToken"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setLastUserLoginToken"))
                                    .build();
                }
            }
        }
        return getSetLastUserLoginTokenMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getCheckUserLimtTokenMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse> METHOD_CHECK_USER_LIMT_TOKEN = getCheckUserLimtTokenMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse> getCheckUserLimtTokenMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse> getCheckUserLimtTokenMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest, com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse> getCheckUserLimtTokenMethod;
        if ((getCheckUserLimtTokenMethod = UserServiceGrpc.getCheckUserLimtTokenMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getCheckUserLimtTokenMethod = UserServiceGrpc.getCheckUserLimtTokenMethod) == null) {
                    UserServiceGrpc.getCheckUserLimtTokenMethod = getCheckUserLimtTokenMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest, com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "checkUserLimtToken"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("checkUserLimtToken"))
                                    .build();
                }
            }
        }
        return getCheckUserLimtTokenMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getSetUserVoiceRecognitionMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse> METHOD_SET_USER_VOICE_RECOGNITION = getSetUserVoiceRecognitionMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse> getSetUserVoiceRecognitionMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest,
            com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse> getSetUserVoiceRecognitionMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest, com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse> getSetUserVoiceRecognitionMethod;
        if ((getSetUserVoiceRecognitionMethod = UserServiceGrpc.getSetUserVoiceRecognitionMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getSetUserVoiceRecognitionMethod = UserServiceGrpc.getSetUserVoiceRecognitionMethod) == null) {
                    UserServiceGrpc.getSetUserVoiceRecognitionMethod = getSetUserVoiceRecognitionMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest, com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "setUserVoiceRecognition"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("setUserVoiceRecognition"))
                                    .build();
                }
            }
        }
        return getSetUserVoiceRecognitionMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getCheckReWardRequestMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse> METHOD_CHECK_RE_WARD_REQUEST = getCheckReWardRequestMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse> getCheckReWardRequestMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest,
            com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse> getCheckReWardRequestMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest, com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse> getCheckReWardRequestMethod;
        if ((getCheckReWardRequestMethod = UserServiceGrpc.getCheckReWardRequestMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getCheckReWardRequestMethod = UserServiceGrpc.getCheckReWardRequestMethod) == null) {
                    UserServiceGrpc.getCheckReWardRequestMethod = getCheckReWardRequestMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest, com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "checkReWardRequest"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("checkReWardRequest"))
                                    .build();
                }
            }
        }
        return getCheckReWardRequestMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getUpdateSuperVisaVesionMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse> METHOD_UPDATE_SUPER_VISA_VESION = getUpdateSuperVisaVesionMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse> getUpdateSuperVisaVesionMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse> getUpdateSuperVisaVesionMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest, com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse> getUpdateSuperVisaVesionMethod;
        if ((getUpdateSuperVisaVesionMethod = UserServiceGrpc.getUpdateSuperVisaVesionMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getUpdateSuperVisaVesionMethod = UserServiceGrpc.getUpdateSuperVisaVesionMethod) == null) {
                    UserServiceGrpc.getUpdateSuperVisaVesionMethod = getUpdateSuperVisaVesionMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest, com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "updateSuperVisaVesion"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updateSuperVisaVesion"))
                                    .build();
                }
            }
        }
        return getUpdateSuperVisaVesionMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetSuperVisaVesionInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse> METHOD_GET_SUPER_VISA_VESION_INFO = getGetSuperVisaVesionInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse> getGetSuperVisaVesionInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse> getGetSuperVisaVesionInfoMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest, com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse> getGetSuperVisaVesionInfoMethod;
        if ((getGetSuperVisaVesionInfoMethod = UserServiceGrpc.getGetSuperVisaVesionInfoMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetSuperVisaVesionInfoMethod = UserServiceGrpc.getGetSuperVisaVesionInfoMethod) == null) {
                    UserServiceGrpc.getGetSuperVisaVesionInfoMethod = getGetSuperVisaVesionInfoMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest, com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getSuperVisaVesionInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getSuperVisaVesionInfo"))
                                    .build();
                }
            }
        }
        return getGetSuperVisaVesionInfoMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getUpdateUserTimeZoneMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse> METHOD_UPDATE_USER_TIME_ZONE = getUpdateUserTimeZoneMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse> getUpdateUserTimeZoneMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest,
            com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse> getUpdateUserTimeZoneMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest, com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse> getUpdateUserTimeZoneMethod;
        if ((getUpdateUserTimeZoneMethod = UserServiceGrpc.getUpdateUserTimeZoneMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getUpdateUserTimeZoneMethod = UserServiceGrpc.getUpdateUserTimeZoneMethod) == null) {
                    UserServiceGrpc.getUpdateUserTimeZoneMethod = getUpdateUserTimeZoneMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest, com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "updateUserTimeZone"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updateUserTimeZone"))
                                    .build();
                }
            }
        }
        return getUpdateUserTimeZoneMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetUserTimeZoneMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse> METHOD_GET_USER_TIME_ZONE = getGetUserTimeZoneMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse> getGetUserTimeZoneMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest,
            com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse> getGetUserTimeZoneMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest, com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse> getGetUserTimeZoneMethod;
        if ((getGetUserTimeZoneMethod = UserServiceGrpc.getGetUserTimeZoneMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getGetUserTimeZoneMethod = UserServiceGrpc.getGetUserTimeZoneMethod) == null) {
                    UserServiceGrpc.getGetUserTimeZoneMethod = getGetUserTimeZoneMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest, com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "getUserTimeZone"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserTimeZone"))
                                    .build();
                }
            }
        }
        return getGetUserTimeZoneMethod;
    }
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getDebugClearUserInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse> METHOD_DEBUG_CLEAR_USER_INFO = getDebugClearUserInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse> getDebugClearUserInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest,
            com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse> getDebugClearUserInfoMethod() {
        io.grpc.MethodDescriptor<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest, com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse> getDebugClearUserInfoMethod;
        if ((getDebugClearUserInfoMethod = UserServiceGrpc.getDebugClearUserInfoMethod) == null) {
            synchronized (UserServiceGrpc.class) {
                if ((getDebugClearUserInfoMethod = UserServiceGrpc.getDebugClearUserInfoMethod) == null) {
                    UserServiceGrpc.getDebugClearUserInfoMethod = getDebugClearUserInfoMethod =
                            io.grpc.MethodDescriptor.<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest, com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "texaspoker.UserService", "debugClearUserInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("debugClearUserInfo"))
                                    .build();
                }
            }
        }
        return getDebugClearUserInfoMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static UserServiceStub newStub(io.grpc.Channel channel) {
        return new UserServiceStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static UserServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new UserServiceBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static UserServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new UserServiceFutureStub(channel);
    }

    /**
     */
    public static abstract class UserServiceImplBase implements io.grpc.BindableService {

        /**
         */
        public void getUserBaseInfo(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserBaseInfoMethod(), responseObserver);
        }

        /**
         */
        public void getUserBaseInfoByShowID(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest request,
                                            io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserBaseInfoByShowIDMethod(), responseObserver);
        }

        /**
         */
        public void addNewUserBaseInfo(com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddNewUserBaseInfoMethod(), responseObserver);
        }

        /**
         */
        public void addUserPopularity(com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddUserPopularityMethod(), responseObserver);
        }

        /**
         */
        public void addUserCoin(com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest request,
                                io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddUserCoinMethod(), responseObserver);
        }

        /**
         */
        public void addUserPopularityType(com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddUserPopularityTypeMethod(), responseObserver);
        }

        /**
         */
        public void addUserCoinType(com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddUserCoinTypeMethod(), responseObserver);
        }

        /**
         */
        public void setUserType(com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest request,
                                io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserTypeMethod(), responseObserver);
        }

        /**
         */
        public void setUserBaseInfoAlbume(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserBaseInfoAlbumeMethod(), responseObserver);
        }

        /**
         */
        public void setUserBaseInfoCover(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest request,
                                         io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserBaseInfoCoverMethod(), responseObserver);
        }

        /**
         */
        public void setUserBaseInfoVIP(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserBaseInfoVIPMethod(), responseObserver);
        }

        /**
         */
        public void setUserBaseInfoLoginTime(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest request,
                                             io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserBaseInfoLoginTimeMethod(), responseObserver);
        }

        /**
         */
        public void setUserBaseInfoSetting(com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserBaseInfoSettingMethod(), responseObserver);
        }

        /**
         */
        public void setUserBaseInfoLocalSetting(com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest request,
                                                io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserBaseInfoLocalSettingMethod(), responseObserver);
        }

        /**
         * <pre>
         * 更新用户APP渠道号
         * </pre>
         */
        public void setUserBaseInfoAppType(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserBaseInfoAppTypeMethod(), responseObserver);
        }

        /**
         * <pre>
         * 更新用户正在使用的协议版本号
         * </pre>
         */
        public void setUserBaseInfoCurrentVersion(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest request,
                                                  io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserBaseInfoCurrentVersionMethod(), responseObserver);
        }

        /**
         */
        public void uploadUserCover(com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getUploadUserCoverMethod(), responseObserver);
        }

        /**
         */
        public void deleteUserCover(com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getDeleteUserCoverMethod(), responseObserver);
        }

        /**
         */
        public void setUserRegisterPWD(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserRegisterPWDMethod(), responseObserver);
        }

        /**
         */
        public void getUserRegisterPWD(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserRegisterPWDMethod(), responseObserver);
        }

        /**
         */
        public void setUserRegisterData(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserRegisterDataMethod(), responseObserver);
        }

        /**
         */
        public void getUserRegisterData(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserRegisterDataMethod(), responseObserver);
        }

        /**
         */
        public void setUserRegisterVerifyCode(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq request,
                                              io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserRegisterVerifyCodeMethod(), responseObserver);
        }

        /**
         */
        public void getUserRegisterVerifyCode(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq request,
                                              io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserRegisterVerifyCodeMethod(), responseObserver);
        }

        /**
         */
        public void getNewUuid(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request,
                               io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> responseObserver) {
            asyncUnimplementedUnaryCall(getGetNewUuidMethod(), responseObserver);
        }

        /**
         */
        public void addUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddUserCreateGameRoomsMethod(), responseObserver);
        }

        /**
         */
        public void removeUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest request,
                                              io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserCreateGameRoomsMethod(), responseObserver);
        }

        /**
         */
        public void getUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserCreateGameRoomsMethod(), responseObserver);
        }

        /**
         */
        public void addUserClubs(com.texaspoker.moment.TexasPokerUserService.UserClubRequest request,
                                 io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> responseObserver) {
            asyncUnimplementedUnaryCall(getAddUserClubsMethod(), responseObserver);
        }

        /**
         */
        public void getUserClubs(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request,
                                 io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserClubsNet> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserClubsMethod(), responseObserver);
        }

        /**
         */
        public void removeUserClubs(com.texaspoker.moment.TexasPokerUserService.UserClubRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserClubsMethod(), responseObserver);
        }

        /**
         */
        public void addUserChatRooms(com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest request,
                                     io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddUserChatRoomsMethod(), responseObserver);
        }

        /**
         */
        public void removeUserChatRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserChatRoomsMethod(), responseObserver);
        }

        /**
         */
        public void getUserChatRooms(com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest request,
                                     io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserChatRoomsMethod(), responseObserver);
        }

        /**
         */
        public void setUserInTable(com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest request,
                                   io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserInTableMethod(), responseObserver);
        }

        /**
         */
        public void removeUserInTable(com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserInTableMethod(), responseObserver);
        }

        /**
         */
        public void getUserInTable(com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest request,
                                   io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserInTableMethod(), responseObserver);
        }

        /**
         */
        public void getUserTokenInfo(com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest request,
                                     io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserTokenInfoMethod(), responseObserver);
        }

        /**
         */
        public void setUserSSOTokenInfo(com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserSSOTokenInfoMethod(), responseObserver);
        }

        /**
         */
        public void setUserAPNTokenInfo(com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserAPNTokenInfoMethod(), responseObserver);
        }

        /**
         */
        public void clearAPNTokenInfo(com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getClearAPNTokenInfoMethod(), responseObserver);
        }

        /**
         */
        public void setUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserQuickRoomsMethod(), responseObserver);
        }

        /**
         */
        public void getUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserQuickRoomsMethod(), responseObserver);
        }

        /**
         */
        public void removeUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest request,
                                         io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserQuickRoomsMethod(), responseObserver);
        }

        /**
         */
        public void setUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserStandByRoomsMethod(), responseObserver);
        }

        /**
         */
        public void removeUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserStandByRoomsMethod(), responseObserver);
        }

        /**
         */
        public void getUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserStandByRoomsMethod(), responseObserver);
        }

        /**
         */
        public void getUserBaseInfoID(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserBaseInfoIDMethod(), responseObserver);
        }

        /**
         */
        public void getUserAccessToken(com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserAccessTokenMethod(), responseObserver);
        }

        /**
         */
        public void setUserAccessToken(com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserAccessTokenMethod(), responseObserver);
        }

        /**
         */
        public void removeUserAccessToken(com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserAccessTokenMethod(), responseObserver);
        }

        /**
         */
        public void getUserCryptKey(com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserCryptKeyMethod(), responseObserver);
        }

        /**
         */
        public void setUserCryptKey(com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserCryptKeyMethod(), responseObserver);
        }

        /**
         */
        public void removeUserCryptKey(com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserCryptKeyMethod(), responseObserver);
        }

        /**
         */
        public void checkUserCoin(com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest request,
                                  io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getCheckUserCoinMethod(), responseObserver);
        }

        /**
         */
        public void checkUserPopularity(com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getCheckUserPopularityMethod(), responseObserver);
        }

        /**
         */
        public void addUserMTTGame(com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest request,
                                   io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getAddUserMTTGameMethod(), responseObserver);
        }

        /**
         */
        public void removeUserMTTGame(com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getRemoveUserMTTGameMethod(), responseObserver);
        }

        /**
         */
        public void getUserMTTGames(com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserMTTGamesMethod(), responseObserver);
        }

        /**
         */
        public void getUuidByStrid(com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest request,
                                   io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUuidByStridMethod(), responseObserver);
        }

        /**
         */
        public void getUserBaseInfosByBatch(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest request,
                                            io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserBaseInfosByBatchMethod(), responseObserver);
        }

        /**
         */
        public void setUserSecurityStatus(com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserSecurityStatusMethod(), responseObserver);
        }

        /**
         */
        public void setUserProtectStatus(com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest request,
                                         io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserProtectStatusMethod(), responseObserver);
        }

        /**
         */
        public void setUserSecurityCode(com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserSecurityCodeMethod(), responseObserver);
        }

        /**
         */
        public void getUserSecurityCode(com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserSecurityCodeMethod(), responseObserver);
        }

        /**
         */
        public void updateUserLimitToken(com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest request,
                                         io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getUpdateUserLimitTokenMethod(), responseObserver);
        }

        /**
         */
        public void setLastUserLoginToken(com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetLastUserLoginTokenMethod(), responseObserver);
        }

        /**
         */
        public void checkUserLimtToken(com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getCheckUserLimtTokenMethod(), responseObserver);
        }

        /**
         */
        public void setUserVoiceRecognition(com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest request,
                                            io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSetUserVoiceRecognitionMethod(), responseObserver);
        }

        /**
         */
        public void checkReWardRequest(com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getCheckReWardRequestMethod(), responseObserver);
        }

        /**
         */
        public void updateSuperVisaVesion(com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getUpdateSuperVisaVesionMethod(), responseObserver);
        }

        /**
         */
        public void getSuperVisaVesionInfo(com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetSuperVisaVesionInfoMethod(), responseObserver);
        }

        /**
         * <pre>
         *用户时区
         * </pre>
         */
        public void updateUserTimeZone(com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getUpdateUserTimeZoneMethod(), responseObserver);
        }

        /**
         */
        public void getUserTimeZone(com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetUserTimeZoneMethod(), responseObserver);
        }

        /**
         */
        public void debugClearUserInfo(com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getDebugClearUserInfoMethod(), responseObserver);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getGetUserBaseInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
                                            com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet>(
                                            this, METHODID_GET_USER_BASE_INFO)))
                    .addMethod(
                            getGetUserBaseInfoByShowIDMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse>(
                                            this, METHODID_GET_USER_BASE_INFO_BY_SHOW_ID)))
                    .addMethod(
                            getAddNewUserBaseInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest,
                                            com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse>(
                                            this, METHODID_ADD_NEW_USER_BASE_INFO)))
                    .addMethod(
                            getAddUserPopularityMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest,
                                            com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse>(
                                            this, METHODID_ADD_USER_POPULARITY)))
                    .addMethod(
                            getAddUserCoinMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest,
                                            com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse>(
                                            this, METHODID_ADD_USER_COIN)))
                    .addMethod(
                            getAddUserPopularityTypeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest,
                                            com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse>(
                                            this, METHODID_ADD_USER_POPULARITY_TYPE)))
                    .addMethod(
                            getAddUserCoinTypeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest,
                                            com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse>(
                                            this, METHODID_ADD_USER_COIN_TYPE)))
                    .addMethod(
                            getSetUserTypeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse>(
                                            this, METHODID_SET_USER_TYPE)))
                    .addMethod(
                            getSetUserBaseInfoAlbumeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse>(
                                            this, METHODID_SET_USER_BASE_INFO_ALBUME)))
                    .addMethod(
                            getSetUserBaseInfoCoverMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse>(
                                            this, METHODID_SET_USER_BASE_INFO_COVER)))
                    .addMethod(
                            getSetUserBaseInfoVIPMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse>(
                                            this, METHODID_SET_USER_BASE_INFO_VIP)))
                    .addMethod(
                            getSetUserBaseInfoLoginTimeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse>(
                                            this, METHODID_SET_USER_BASE_INFO_LOGIN_TIME)))
                    .addMethod(
                            getSetUserBaseInfoSettingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse>(
                                            this, METHODID_SET_USER_BASE_INFO_SETTING)))
                    .addMethod(
                            getSetUserBaseInfoLocalSettingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse>(
                                            this, METHODID_SET_USER_BASE_INFO_LOCAL_SETTING)))
                    .addMethod(
                            getSetUserBaseInfoAppTypeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse>(
                                            this, METHODID_SET_USER_BASE_INFO_APP_TYPE)))
                    .addMethod(
                            getSetUserBaseInfoCurrentVersionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse>(
                                            this, METHODID_SET_USER_BASE_INFO_CURRENT_VERSION)))
                    .addMethod(
                            getUploadUserCoverMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest,
                                            com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse>(
                                            this, METHODID_UPLOAD_USER_COVER)))
                    .addMethod(
                            getDeleteUserCoverMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest,
                                            com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse>(
                                            this, METHODID_DELETE_USER_COVER)))
                    .addMethod(
                            getSetUserRegisterPWDMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp>(
                                            this, METHODID_SET_USER_REGISTER_PWD)))
                    .addMethod(
                            getGetUserRegisterPWDMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp>(
                                            this, METHODID_GET_USER_REGISTER_PWD)))
                    .addMethod(
                            getSetUserRegisterDataMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp>(
                                            this, METHODID_SET_USER_REGISTER_DATA)))
                    .addMethod(
                            getGetUserRegisterDataMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp>(
                                            this, METHODID_GET_USER_REGISTER_DATA)))
                    .addMethod(
                            getSetUserRegisterVerifyCodeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp>(
                                            this, METHODID_SET_USER_REGISTER_VERIFY_CODE)))
                    .addMethod(
                            getGetUserRegisterVerifyCodeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp>(
                                            this, METHODID_GET_USER_REGISTER_VERIFY_CODE)))
                    .addMethod(
                            getGetNewUuidMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>(
                                            this, METHODID_GET_NEW_UUID)))
                    .addMethod(
                            getAddUserCreateGameRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse>(
                                            this, METHODID_ADD_USER_CREATE_GAME_ROOMS)))
                    .addMethod(
                            getRemoveUserCreateGameRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse>(
                                            this, METHODID_REMOVE_USER_CREATE_GAME_ROOMS)))
                    .addMethod(
                            getGetUserCreateGameRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse>(
                                            this, METHODID_GET_USER_CREATE_GAME_ROOMS)))
                    .addMethod(
                            getAddUserClubsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UserClubRequest,
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>(
                                            this, METHODID_ADD_USER_CLUBS)))
                    .addMethod(
                            getGetUserClubsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid,
                                            com.texaspoker.moment.TexasPokerUserService.UserClubsNet>(
                                            this, METHODID_GET_USER_CLUBS)))
                    .addMethod(
                            getRemoveUserClubsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UserClubRequest,
                                            com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>(
                                            this, METHODID_REMOVE_USER_CLUBS)))
                    .addMethod(
                            getAddUserChatRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse>(
                                            this, METHODID_ADD_USER_CHAT_ROOMS)))
                    .addMethod(
                            getRemoveUserChatRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse>(
                                            this, METHODID_REMOVE_USER_CHAT_ROOMS)))
                    .addMethod(
                            getGetUserChatRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse>(
                                            this, METHODID_GET_USER_CHAT_ROOMS)))
                    .addMethod(
                            getSetUserInTableMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse>(
                                            this, METHODID_SET_USER_IN_TABLE)))
                    .addMethod(
                            getRemoveUserInTableMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest,
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse>(
                                            this, METHODID_REMOVE_USER_IN_TABLE)))
                    .addMethod(
                            getGetUserInTableMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse>(
                                            this, METHODID_GET_USER_IN_TABLE)))
                    .addMethod(
                            getGetUserTokenInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse>(
                                            this, METHODID_GET_USER_TOKEN_INFO)))
                    .addMethod(
                            getSetUserSSOTokenInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse>(
                                            this, METHODID_SET_USER_SSOTOKEN_INFO)))
                    .addMethod(
                            getSetUserAPNTokenInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse>(
                                            this, METHODID_SET_USER_APNTOKEN_INFO)))
                    .addMethod(
                            getClearAPNTokenInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest,
                                            com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse>(
                                            this, METHODID_CLEAR_APNTOKEN_INFO)))
                    .addMethod(
                            getSetUserQuickRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse>(
                                            this, METHODID_SET_USER_QUICK_ROOMS)))
                    .addMethod(
                            getGetUserQuickRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse>(
                                            this, METHODID_GET_USER_QUICK_ROOMS)))
                    .addMethod(
                            getRemoveUserQuickRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse>(
                                            this, METHODID_REMOVE_USER_QUICK_ROOMS)))
                    .addMethod(
                            getSetUserStandByRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse>(
                                            this, METHODID_SET_USER_STAND_BY_ROOMS)))
                    .addMethod(
                            getRemoveUserStandByRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse>(
                                            this, METHODID_REMOVE_USER_STAND_BY_ROOMS)))
                    .addMethod(
                            getGetUserStandByRoomsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse>(
                                            this, METHODID_GET_USER_STAND_BY_ROOMS)))
                    .addMethod(
                            getGetUserBaseInfoIDMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse>(
                                            this, METHODID_GET_USER_BASE_INFO_ID)))
                    .addMethod(
                            getGetUserAccessTokenMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse>(
                                            this, METHODID_GET_USER_ACCESS_TOKEN)))
                    .addMethod(
                            getSetUserAccessTokenMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse>(
                                            this, METHODID_SET_USER_ACCESS_TOKEN)))
                    .addMethod(
                            getRemoveUserAccessTokenMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest,
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse>(
                                            this, METHODID_REMOVE_USER_ACCESS_TOKEN)))
                    .addMethod(
                            getGetUserCryptKeyMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse>(
                                            this, METHODID_GET_USER_CRYPT_KEY)))
                    .addMethod(
                            getSetUserCryptKeyMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse>(
                                            this, METHODID_SET_USER_CRYPT_KEY)))
                    .addMethod(
                            getRemoveUserCryptKeyMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest,
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse>(
                                            this, METHODID_REMOVE_USER_CRYPT_KEY)))
                    .addMethod(
                            getCheckUserCoinMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest,
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse>(
                                            this, METHODID_CHECK_USER_COIN)))
                    .addMethod(
                            getCheckUserPopularityMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest,
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse>(
                                            this, METHODID_CHECK_USER_POPULARITY)))
                    .addMethod(
                            getAddUserMTTGameMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest,
                                            com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse>(
                                            this, METHODID_ADD_USER_MTTGAME)))
                    .addMethod(
                            getRemoveUserMTTGameMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest,
                                            com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse>(
                                            this, METHODID_REMOVE_USER_MTTGAME)))
                    .addMethod(
                            getGetUserMTTGamesMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse>(
                                            this, METHODID_GET_USER_MTTGAMES)))
                    .addMethod(
                            getGetUuidByStridMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse>(
                                            this, METHODID_GET_UUID_BY_STRID)))
                    .addMethod(
                            getGetUserBaseInfosByBatchMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse>(
                                            this, METHODID_GET_USER_BASE_INFOS_BY_BATCH)))
                    .addMethod(
                            getSetUserSecurityStatusMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse>(
                                            this, METHODID_SET_USER_SECURITY_STATUS)))
                    .addMethod(
                            getSetUserProtectStatusMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse>(
                                            this, METHODID_SET_USER_PROTECT_STATUS)))
                    .addMethod(
                            getSetUserSecurityCodeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse>(
                                            this, METHODID_SET_USER_SECURITY_CODE)))
                    .addMethod(
                            getGetUserSecurityCodeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse>(
                                            this, METHODID_GET_USER_SECURITY_CODE)))
                    .addMethod(
                            getUpdateUserLimitTokenMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest,
                                            com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse>(
                                            this, METHODID_UPDATE_USER_LIMIT_TOKEN)))
                    .addMethod(
                            getSetLastUserLoginTokenMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse>(
                                            this, METHODID_SET_LAST_USER_LOGIN_TOKEN)))
                    .addMethod(
                            getCheckUserLimtTokenMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest,
                                            com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse>(
                                            this, METHODID_CHECK_USER_LIMT_TOKEN)))
                    .addMethod(
                            getSetUserVoiceRecognitionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest,
                                            com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse>(
                                            this, METHODID_SET_USER_VOICE_RECOGNITION)))
                    .addMethod(
                            getCheckReWardRequestMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest,
                                            com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse>(
                                            this, METHODID_CHECK_RE_WARD_REQUEST)))
                    .addMethod(
                            getUpdateSuperVisaVesionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest,
                                            com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse>(
                                            this, METHODID_UPDATE_SUPER_VISA_VESION)))
                    .addMethod(
                            getGetSuperVisaVesionInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse>(
                                            this, METHODID_GET_SUPER_VISA_VESION_INFO)))
                    .addMethod(
                            getUpdateUserTimeZoneMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest,
                                            com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse>(
                                            this, METHODID_UPDATE_USER_TIME_ZONE)))
                    .addMethod(
                            getGetUserTimeZoneMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest,
                                            com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse>(
                                            this, METHODID_GET_USER_TIME_ZONE)))
                    .addMethod(
                            getDebugClearUserInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest,
                                            com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse>(
                                            this, METHODID_DEBUG_CLEAR_USER_INFO)))
                    .build();
        }
    }

    /**
     */
    public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
        private UserServiceStub(io.grpc.Channel channel) {
            super(channel);
        }

        private UserServiceStub(io.grpc.Channel channel,
                                io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected UserServiceStub build(io.grpc.Channel channel,
                                        io.grpc.CallOptions callOptions) {
            return new UserServiceStub(channel, callOptions);
        }

        /**
         */
        public void getUserBaseInfo(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserBaseInfoMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserBaseInfoByShowID(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest request,
                                            io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserBaseInfoByShowIDMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addNewUserBaseInfo(com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddNewUserBaseInfoMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addUserPopularity(com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddUserPopularityMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addUserCoin(com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest request,
                                io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddUserCoinMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addUserPopularityType(com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddUserPopularityTypeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addUserCoinType(com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddUserCoinTypeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserType(com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest request,
                                io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserTypeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserBaseInfoAlbume(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoAlbumeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserBaseInfoCover(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest request,
                                         io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoCoverMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserBaseInfoVIP(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoVIPMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserBaseInfoLoginTime(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest request,
                                             io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoLoginTimeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserBaseInfoSetting(com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoSettingMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserBaseInfoLocalSetting(com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest request,
                                                io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoLocalSettingMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * 更新用户APP渠道号
         * </pre>
         */
        public void setUserBaseInfoAppType(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoAppTypeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * 更新用户正在使用的协议版本号
         * </pre>
         */
        public void setUserBaseInfoCurrentVersion(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest request,
                                                  io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoCurrentVersionMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void uploadUserCover(com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getUploadUserCoverMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void deleteUserCover(com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getDeleteUserCoverMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserRegisterPWD(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserRegisterPWDMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserRegisterPWD(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserRegisterPWDMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserRegisterData(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserRegisterDataMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserRegisterData(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserRegisterDataMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserRegisterVerifyCode(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq request,
                                              io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserRegisterVerifyCodeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserRegisterVerifyCode(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq request,
                                              io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserRegisterVerifyCodeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getNewUuid(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request,
                               io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetNewUuidMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddUserCreateGameRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest request,
                                              io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserCreateGameRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserCreateGameRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addUserClubs(com.texaspoker.moment.TexasPokerUserService.UserClubRequest request,
                                 io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddUserClubsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserClubs(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request,
                                 io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserClubsNet> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserClubsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserClubs(com.texaspoker.moment.TexasPokerUserService.UserClubRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserClubsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addUserChatRooms(com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest request,
                                     io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddUserChatRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserChatRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserChatRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserChatRooms(com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest request,
                                     io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserChatRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserInTable(com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest request,
                                   io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserInTableMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserInTable(com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserInTableMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserInTable(com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest request,
                                   io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserInTableMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserTokenInfo(com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest request,
                                     io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserTokenInfoMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserSSOTokenInfo(com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserSSOTokenInfoMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserAPNTokenInfo(com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserAPNTokenInfoMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void clearAPNTokenInfo(com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getClearAPNTokenInfoMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserQuickRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserQuickRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest request,
                                         io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserQuickRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserStandByRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserStandByRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserStandByRoomsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserBaseInfoID(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserBaseInfoIDMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserAccessToken(com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserAccessTokenMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserAccessToken(com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserAccessTokenMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserAccessToken(com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserAccessTokenMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserCryptKey(com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserCryptKeyMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserCryptKey(com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserCryptKeyMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserCryptKey(com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserCryptKeyMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void checkUserCoin(com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest request,
                                  io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getCheckUserCoinMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void checkUserPopularity(com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getCheckUserPopularityMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addUserMTTGame(com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest request,
                                   io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getAddUserMTTGameMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void removeUserMTTGame(com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest request,
                                      io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getRemoveUserMTTGameMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserMTTGames(com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserMTTGamesMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUuidByStrid(com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest request,
                                   io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUuidByStridMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserBaseInfosByBatch(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest request,
                                            io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserBaseInfosByBatchMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserSecurityStatus(com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserSecurityStatusMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserProtectStatus(com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest request,
                                         io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserProtectStatusMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserSecurityCode(com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserSecurityCodeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserSecurityCode(com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest request,
                                        io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserSecurityCodeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void updateUserLimitToken(com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest request,
                                         io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getUpdateUserLimitTokenMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setLastUserLoginToken(com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetLastUserLoginTokenMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void checkUserLimtToken(com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getCheckUserLimtTokenMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void setUserVoiceRecognition(com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest request,
                                            io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSetUserVoiceRecognitionMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void checkReWardRequest(com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getCheckReWardRequestMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void updateSuperVisaVesion(com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest request,
                                          io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getUpdateSuperVisaVesionMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getSuperVisaVesionInfo(com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest request,
                                           io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetSuperVisaVesionInfoMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         *用户时区
         * </pre>
         */
        public void updateUserTimeZone(com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getUpdateUserTimeZoneMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getUserTimeZone(com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest request,
                                    io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetUserTimeZoneMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void debugClearUserInfo(com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest request,
                                       io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getDebugClearUserInfoMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     */
    public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
        private UserServiceBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private UserServiceBlockingStub(io.grpc.Channel channel,
                                        io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected UserServiceBlockingStub build(io.grpc.Channel channel,
                                                io.grpc.CallOptions callOptions) {
            return new UserServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet getUserBaseInfo(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserBaseInfoMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse getUserBaseInfoByShowID(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserBaseInfoByShowIDMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse addNewUserBaseInfo(com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddNewUserBaseInfoMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse addUserPopularity(com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddUserPopularityMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse addUserCoin(com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddUserCoinMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse addUserPopularityType(com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddUserPopularityTypeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse addUserCoinType(com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddUserCoinTypeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse setUserType(com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserTypeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse setUserBaseInfoAlbume(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserBaseInfoAlbumeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse setUserBaseInfoCover(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserBaseInfoCoverMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse setUserBaseInfoVIP(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserBaseInfoVIPMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse setUserBaseInfoLoginTime(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserBaseInfoLoginTimeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse setUserBaseInfoSetting(com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserBaseInfoSettingMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse setUserBaseInfoLocalSetting(com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserBaseInfoLocalSettingMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * 更新用户APP渠道号
         * </pre>
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse setUserBaseInfoAppType(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserBaseInfoAppTypeMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * 更新用户正在使用的协议版本号
         * </pre>
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse setUserBaseInfoCurrentVersion(com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserBaseInfoCurrentVersionMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse uploadUserCover(com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest request) {
            return blockingUnaryCall(
                    getChannel(), getUploadUserCoverMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse deleteUserCover(com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest request) {
            return blockingUnaryCall(
                    getChannel(), getDeleteUserCoverMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp setUserRegisterPWD(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserRegisterPWDMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp getUserRegisterPWD(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserRegisterPWDMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp setUserRegisterData(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserRegisterDataMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp getUserRegisterData(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserRegisterDataMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp setUserRegisterVerifyCode(com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserRegisterVerifyCodeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp getUserRegisterVerifyCode(com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserRegisterVerifyCodeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid getNewUuid(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request) {
            return blockingUnaryCall(
                    getChannel(), getGetNewUuidMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse addUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddUserCreateGameRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse removeUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserCreateGameRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse getUserCreateGameRooms(com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserCreateGameRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid addUserClubs(com.texaspoker.moment.TexasPokerUserService.UserClubRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddUserClubsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UserClubsNet getUserClubs(com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserClubsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid removeUserClubs(com.texaspoker.moment.TexasPokerUserService.UserClubRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserClubsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse addUserChatRooms(com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddUserChatRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse removeUserChatRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserChatRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse getUserChatRooms(com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserChatRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse setUserInTable(com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserInTableMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse removeUserInTable(com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserInTableMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse getUserInTable(com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserInTableMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse getUserTokenInfo(com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserTokenInfoMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse setUserSSOTokenInfo(com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserSSOTokenInfoMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse setUserAPNTokenInfo(com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserAPNTokenInfoMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse clearAPNTokenInfo(com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest request) {
            return blockingUnaryCall(
                    getChannel(), getClearAPNTokenInfoMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse setUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserQuickRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse getUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserQuickRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse removeUserQuickRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserQuickRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse setUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserStandByRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse removeUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserStandByRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse getUserStandByRooms(com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserStandByRoomsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse getUserBaseInfoID(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserBaseInfoIDMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse getUserAccessToken(com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserAccessTokenMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse setUserAccessToken(com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserAccessTokenMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse removeUserAccessToken(com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserAccessTokenMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse getUserCryptKey(com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserCryptKeyMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse setUserCryptKey(com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserCryptKeyMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse removeUserCryptKey(com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserCryptKeyMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse checkUserCoin(com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest request) {
            return blockingUnaryCall(
                    getChannel(), getCheckUserCoinMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse checkUserPopularity(com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest request) {
            return blockingUnaryCall(
                    getChannel(), getCheckUserPopularityMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse addUserMTTGame(com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest request) {
            return blockingUnaryCall(
                    getChannel(), getAddUserMTTGameMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse removeUserMTTGame(com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest request) {
            return blockingUnaryCall(
                    getChannel(), getRemoveUserMTTGameMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse getUserMTTGames(com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserMTTGamesMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse getUuidByStrid(com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUuidByStridMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse getUserBaseInfosByBatch(com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserBaseInfosByBatchMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse setUserSecurityStatus(com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserSecurityStatusMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse setUserProtectStatus(com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserProtectStatusMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse setUserSecurityCode(com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserSecurityCodeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse getUserSecurityCode(com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserSecurityCodeMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse updateUserLimitToken(com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest request) {
            return blockingUnaryCall(
                    getChannel(), getUpdateUserLimitTokenMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse setLastUserLoginToken(com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetLastUserLoginTokenMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse checkUserLimtToken(com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest request) {
            return blockingUnaryCall(
                    getChannel(), getCheckUserLimtTokenMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse setUserVoiceRecognition(com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSetUserVoiceRecognitionMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse checkReWardRequest(com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest request) {
            return blockingUnaryCall(
                    getChannel(), getCheckReWardRequestMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse updateSuperVisaVesion(com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest request) {
            return blockingUnaryCall(
                    getChannel(), getUpdateSuperVisaVesionMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse getSuperVisaVesionInfo(com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetSuperVisaVesionInfoMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         *用户时区
         * </pre>
         */
        public com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse updateUserTimeZone(com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest request) {
            return blockingUnaryCall(
                    getChannel(), getUpdateUserTimeZoneMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse getUserTimeZone(com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest request) {
            return blockingUnaryCall(
                    getChannel(), getGetUserTimeZoneMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse debugClearUserInfo(com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest request) {
            return blockingUnaryCall(
                    getChannel(), getDebugClearUserInfoMethod(), getCallOptions(), request);
        }
    }

    /**
     */
    public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
        private UserServiceFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private UserServiceFutureStub(io.grpc.Channel channel,
                                      io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected UserServiceFutureStub build(io.grpc.Channel channel,
                                              io.grpc.CallOptions callOptions) {
            return new UserServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet> getUserBaseInfo(
                com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserBaseInfoMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse> getUserBaseInfoByShowID(
                com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserBaseInfoByShowIDMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse> addNewUserBaseInfo(
                com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddNewUserBaseInfoMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse> addUserPopularity(
                com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddUserPopularityMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse> addUserCoin(
                com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddUserCoinMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse> addUserPopularityType(
                com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddUserPopularityTypeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse> addUserCoinType(
                com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddUserCoinTypeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse> setUserType(
                com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserTypeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse> setUserBaseInfoAlbume(
                com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoAlbumeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse> setUserBaseInfoCover(
                com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoCoverMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse> setUserBaseInfoVIP(
                com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoVIPMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse> setUserBaseInfoLoginTime(
                com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoLoginTimeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse> setUserBaseInfoSetting(
                com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoSettingMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse> setUserBaseInfoLocalSetting(
                com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoLocalSettingMethod(), getCallOptions()), request);
        }

        /**
         * <pre>
         * 更新用户APP渠道号
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse> setUserBaseInfoAppType(
                com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoAppTypeMethod(), getCallOptions()), request);
        }

        /**
         * <pre>
         * 更新用户正在使用的协议版本号
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse> setUserBaseInfoCurrentVersion(
                com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserBaseInfoCurrentVersionMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse> uploadUserCover(
                com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getUploadUserCoverMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse> deleteUserCover(
                com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getDeleteUserCoverMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp> setUserRegisterPWD(
                com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserRegisterPWDMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp> getUserRegisterPWD(
                com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserRegisterPWDMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp> setUserRegisterData(
                com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserRegisterDataMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp> getUserRegisterData(
                com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserRegisterDataMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp> setUserRegisterVerifyCode(
                com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserRegisterVerifyCodeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp> getUserRegisterVerifyCode(
                com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserRegisterVerifyCodeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> getNewUuid(
                com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetNewUuidMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse> addUserCreateGameRooms(
                com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddUserCreateGameRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse> removeUserCreateGameRooms(
                com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserCreateGameRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse> getUserCreateGameRooms(
                com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserCreateGameRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> addUserClubs(
                com.texaspoker.moment.TexasPokerUserService.UserClubRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddUserClubsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UserClubsNet> getUserClubs(
                com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserClubsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid> removeUserClubs(
                com.texaspoker.moment.TexasPokerUserService.UserClubRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserClubsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse> addUserChatRooms(
                com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddUserChatRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse> removeUserChatRooms(
                com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserChatRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse> getUserChatRooms(
                com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserChatRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse> setUserInTable(
                com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserInTableMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse> removeUserInTable(
                com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserInTableMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse> getUserInTable(
                com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserInTableMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse> getUserTokenInfo(
                com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserTokenInfoMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse> setUserSSOTokenInfo(
                com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserSSOTokenInfoMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse> setUserAPNTokenInfo(
                com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserAPNTokenInfoMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse> clearAPNTokenInfo(
                com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getClearAPNTokenInfoMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse> setUserQuickRooms(
                com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserQuickRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse> getUserQuickRooms(
                com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserQuickRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse> removeUserQuickRooms(
                com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserQuickRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse> setUserStandByRooms(
                com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserStandByRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse> removeUserStandByRooms(
                com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserStandByRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse> getUserStandByRooms(
                com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserStandByRoomsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse> getUserBaseInfoID(
                com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserBaseInfoIDMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse> getUserAccessToken(
                com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserAccessTokenMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse> setUserAccessToken(
                com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserAccessTokenMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse> removeUserAccessToken(
                com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserAccessTokenMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse> getUserCryptKey(
                com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserCryptKeyMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse> setUserCryptKey(
                com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserCryptKeyMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse> removeUserCryptKey(
                com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserCryptKeyMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse> checkUserCoin(
                com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getCheckUserCoinMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse> checkUserPopularity(
                com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getCheckUserPopularityMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse> addUserMTTGame(
                com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getAddUserMTTGameMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse> removeUserMTTGame(
                com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getRemoveUserMTTGameMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse> getUserMTTGames(
                com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserMTTGamesMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse> getUuidByStrid(
                com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUuidByStridMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse> getUserBaseInfosByBatch(
                com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserBaseInfosByBatchMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse> setUserSecurityStatus(
                com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserSecurityStatusMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse> setUserProtectStatus(
                com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserProtectStatusMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse> setUserSecurityCode(
                com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserSecurityCodeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse> getUserSecurityCode(
                com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserSecurityCodeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse> updateUserLimitToken(
                com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getUpdateUserLimitTokenMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse> setLastUserLoginToken(
                com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetLastUserLoginTokenMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse> checkUserLimtToken(
                com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getCheckUserLimtTokenMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse> setUserVoiceRecognition(
                com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSetUserVoiceRecognitionMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse> checkReWardRequest(
                com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getCheckReWardRequestMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse> updateSuperVisaVesion(
                com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getUpdateSuperVisaVesionMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse> getSuperVisaVesionInfo(
                com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetSuperVisaVesionInfoMethod(), getCallOptions()), request);
        }

        /**
         * <pre>
         *用户时区
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse> updateUserTimeZone(
                com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getUpdateUserTimeZoneMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse> getUserTimeZone(
                com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetUserTimeZoneMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse> debugClearUserInfo(
                com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getDebugClearUserInfoMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_USER_BASE_INFO = 0;
    private static final int METHODID_GET_USER_BASE_INFO_BY_SHOW_ID = 1;
    private static final int METHODID_ADD_NEW_USER_BASE_INFO = 2;
    private static final int METHODID_ADD_USER_POPULARITY = 3;
    private static final int METHODID_ADD_USER_COIN = 4;
    private static final int METHODID_ADD_USER_POPULARITY_TYPE = 5;
    private static final int METHODID_ADD_USER_COIN_TYPE = 6;
    private static final int METHODID_SET_USER_TYPE = 7;
    private static final int METHODID_SET_USER_BASE_INFO_ALBUME = 8;
    private static final int METHODID_SET_USER_BASE_INFO_COVER = 9;
    private static final int METHODID_SET_USER_BASE_INFO_VIP = 10;
    private static final int METHODID_SET_USER_BASE_INFO_LOGIN_TIME = 11;
    private static final int METHODID_SET_USER_BASE_INFO_SETTING = 12;
    private static final int METHODID_SET_USER_BASE_INFO_LOCAL_SETTING = 13;
    private static final int METHODID_SET_USER_BASE_INFO_APP_TYPE = 14;
    private static final int METHODID_SET_USER_BASE_INFO_CURRENT_VERSION = 15;
    private static final int METHODID_UPLOAD_USER_COVER = 16;
    private static final int METHODID_DELETE_USER_COVER = 17;
    private static final int METHODID_SET_USER_REGISTER_PWD = 18;
    private static final int METHODID_GET_USER_REGISTER_PWD = 19;
    private static final int METHODID_SET_USER_REGISTER_DATA = 20;
    private static final int METHODID_GET_USER_REGISTER_DATA = 21;
    private static final int METHODID_SET_USER_REGISTER_VERIFY_CODE = 22;
    private static final int METHODID_GET_USER_REGISTER_VERIFY_CODE = 23;
    private static final int METHODID_GET_NEW_UUID = 24;
    private static final int METHODID_ADD_USER_CREATE_GAME_ROOMS = 25;
    private static final int METHODID_REMOVE_USER_CREATE_GAME_ROOMS = 26;
    private static final int METHODID_GET_USER_CREATE_GAME_ROOMS = 27;
    private static final int METHODID_ADD_USER_CLUBS = 28;
    private static final int METHODID_GET_USER_CLUBS = 29;
    private static final int METHODID_REMOVE_USER_CLUBS = 30;
    private static final int METHODID_ADD_USER_CHAT_ROOMS = 31;
    private static final int METHODID_REMOVE_USER_CHAT_ROOMS = 32;
    private static final int METHODID_GET_USER_CHAT_ROOMS = 33;
    private static final int METHODID_SET_USER_IN_TABLE = 34;
    private static final int METHODID_REMOVE_USER_IN_TABLE = 35;
    private static final int METHODID_GET_USER_IN_TABLE = 36;
    private static final int METHODID_GET_USER_TOKEN_INFO = 37;
    private static final int METHODID_SET_USER_SSOTOKEN_INFO = 38;
    private static final int METHODID_SET_USER_APNTOKEN_INFO = 39;
    private static final int METHODID_CLEAR_APNTOKEN_INFO = 40;
    private static final int METHODID_SET_USER_QUICK_ROOMS = 41;
    private static final int METHODID_GET_USER_QUICK_ROOMS = 42;
    private static final int METHODID_REMOVE_USER_QUICK_ROOMS = 43;
    private static final int METHODID_SET_USER_STAND_BY_ROOMS = 44;
    private static final int METHODID_REMOVE_USER_STAND_BY_ROOMS = 45;
    private static final int METHODID_GET_USER_STAND_BY_ROOMS = 46;
    private static final int METHODID_GET_USER_BASE_INFO_ID = 47;
    private static final int METHODID_GET_USER_ACCESS_TOKEN = 48;
    private static final int METHODID_SET_USER_ACCESS_TOKEN = 49;
    private static final int METHODID_REMOVE_USER_ACCESS_TOKEN = 50;
    private static final int METHODID_GET_USER_CRYPT_KEY = 51;
    private static final int METHODID_SET_USER_CRYPT_KEY = 52;
    private static final int METHODID_REMOVE_USER_CRYPT_KEY = 53;
    private static final int METHODID_CHECK_USER_COIN = 54;
    private static final int METHODID_CHECK_USER_POPULARITY = 55;
    private static final int METHODID_ADD_USER_MTTGAME = 56;
    private static final int METHODID_REMOVE_USER_MTTGAME = 57;
    private static final int METHODID_GET_USER_MTTGAMES = 58;
    private static final int METHODID_GET_UUID_BY_STRID = 59;
    private static final int METHODID_GET_USER_BASE_INFOS_BY_BATCH = 60;
    private static final int METHODID_SET_USER_SECURITY_STATUS = 61;
    private static final int METHODID_SET_USER_PROTECT_STATUS = 62;
    private static final int METHODID_SET_USER_SECURITY_CODE = 63;
    private static final int METHODID_GET_USER_SECURITY_CODE = 64;
    private static final int METHODID_UPDATE_USER_LIMIT_TOKEN = 65;
    private static final int METHODID_SET_LAST_USER_LOGIN_TOKEN = 66;
    private static final int METHODID_CHECK_USER_LIMT_TOKEN = 67;
    private static final int METHODID_SET_USER_VOICE_RECOGNITION = 68;
    private static final int METHODID_CHECK_RE_WARD_REQUEST = 69;
    private static final int METHODID_UPDATE_SUPER_VISA_VESION = 70;
    private static final int METHODID_GET_SUPER_VISA_VESION_INFO = 71;
    private static final int METHODID_UPDATE_USER_TIME_ZONE = 72;
    private static final int METHODID_GET_USER_TIME_ZONE = 73;
    private static final int METHODID_DEBUG_CLEAR_USER_INFO = 74;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final UserServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_USER_BASE_INFO:
                    serviceImpl.getUserBaseInfo((com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet>) responseObserver);
                    break;
                case METHODID_GET_USER_BASE_INFO_BY_SHOW_ID:
                    serviceImpl.getUserBaseInfoByShowID((com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoByShowIDResponse>) responseObserver);
                    break;
                case METHODID_ADD_NEW_USER_BASE_INFO:
                    serviceImpl.addNewUserBaseInfo((com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddNewUserBaseInfoResponse>) responseObserver);
                    break;
                case METHODID_ADD_USER_POPULARITY:
                    serviceImpl.addUserPopularity((com.texaspoker.moment.TexasPokerUserService.UserAddPopularityRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserAddPopularityResponse>) responseObserver);
                    break;
                case METHODID_ADD_USER_COIN:
                    serviceImpl.addUserCoin((com.texaspoker.moment.TexasPokerUserService.UserAddCoinRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserAddCoinResponse>) responseObserver);
                    break;
                case METHODID_ADD_USER_POPULARITY_TYPE:
                    serviceImpl.addUserPopularityType((com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserPopularityTypeResponse>) responseObserver);
                    break;
                case METHODID_ADD_USER_COIN_TYPE:
                    serviceImpl.addUserCoinType((com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserCoinTypeResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_TYPE:
                    serviceImpl.setUserType((com.texaspoker.moment.TexasPokerUserService.SetUserTypeRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserTypeResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_BASE_INFO_ALBUME:
                    serviceImpl.setUserBaseInfoAlbume((com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAlbumeResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_BASE_INFO_COVER:
                    serviceImpl.setUserBaseInfoCover((com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCoverResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_BASE_INFO_VIP:
                    serviceImpl.setUserBaseInfoVIP((com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoVIPResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_BASE_INFO_LOGIN_TIME:
                    serviceImpl.setUserBaseInfoLoginTime((com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoLoginTimeResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_BASE_INFO_SETTING:
                    serviceImpl.setUserBaseInfoSetting((com.texaspoker.moment.TexasPokerUserService.SetUserInfoRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInfoResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_BASE_INFO_LOCAL_SETTING:
                    serviceImpl.setUserBaseInfoLocalSetting((com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInfoSettingResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_BASE_INFO_APP_TYPE:
                    serviceImpl.setUserBaseInfoAppType((com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoAppTypeResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_BASE_INFO_CURRENT_VERSION:
                    serviceImpl.setUserBaseInfoCurrentVersion((com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserBaseInfoCurrentVersionResponse>) responseObserver);
                    break;
                case METHODID_UPLOAD_USER_COVER:
                    serviceImpl.uploadUserCover((com.texaspoker.moment.TexasPokerUserService.UploadUserCoverRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UploadUserCoverResponse>) responseObserver);
                    break;
                case METHODID_DELETE_USER_COVER:
                    serviceImpl.deleteUserCover((com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.DeleteUserCoverResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_REGISTER_PWD:
                    serviceImpl.setUserRegisterPWD((com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDReq) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterPWDRsp>) responseObserver);
                    break;
                case METHODID_GET_USER_REGISTER_PWD:
                    serviceImpl.getUserRegisterPWD((com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDReq) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterPWDRsp>) responseObserver);
                    break;
                case METHODID_SET_USER_REGISTER_DATA:
                    serviceImpl.setUserRegisterData((com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataReq) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterDataRsp>) responseObserver);
                    break;
                case METHODID_GET_USER_REGISTER_DATA:
                    serviceImpl.getUserRegisterData((com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataReq) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterDataRsp>) responseObserver);
                    break;
                case METHODID_SET_USER_REGISTER_VERIFY_CODE:
                    serviceImpl.setUserRegisterVerifyCode((com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeReq) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserRegisterVerifyCodeRsp>) responseObserver);
                    break;
                case METHODID_GET_USER_REGISTER_VERIFY_CODE:
                    serviceImpl.getUserRegisterVerifyCode((com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeReq) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserRegisterVerifyCodeRsp>) responseObserver);
                    break;
                case METHODID_GET_NEW_UUID:
                    serviceImpl.getNewUuid((com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>) responseObserver);
                    break;
                case METHODID_ADD_USER_CREATE_GAME_ROOMS:
                    serviceImpl.addUserCreateGameRooms((com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserCreateGameRoomsReqsponse>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_CREATE_GAME_ROOMS:
                    serviceImpl.removeUserCreateGameRooms((com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserCreateGameRoomsResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_CREATE_GAME_ROOMS:
                    serviceImpl.getUserCreateGameRooms((com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserCreateGameRoomsResponse>) responseObserver);
                    break;
                case METHODID_ADD_USER_CLUBS:
                    serviceImpl.addUserClubs((com.texaspoker.moment.TexasPokerUserService.UserClubRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>) responseObserver);
                    break;
                case METHODID_GET_USER_CLUBS:
                    serviceImpl.getUserClubs((com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserClubsNet>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_CLUBS:
                    serviceImpl.removeUserClubs((com.texaspoker.moment.TexasPokerUserService.UserClubRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UserBaseInfoUuid>) responseObserver);
                    break;
                case METHODID_ADD_USER_CHAT_ROOMS:
                    serviceImpl.addUserChatRooms((com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserChatRoomsResponse>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_CHAT_ROOMS:
                    serviceImpl.removeUserChatRooms((com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserChatRoomsResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_CHAT_ROOMS:
                    serviceImpl.getUserChatRooms((com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserChatRoomsResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_IN_TABLE:
                    serviceImpl.setUserInTable((com.texaspoker.moment.TexasPokerUserService.SetUserInTableRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserInTableResponse>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_IN_TABLE:
                    serviceImpl.removeUserInTable((com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserInTableResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_IN_TABLE:
                    serviceImpl.getUserInTable((com.texaspoker.moment.TexasPokerUserService.GetUserInTableRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserInTableResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_TOKEN_INFO:
                    serviceImpl.getUserTokenInfo((com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserTokenInfoResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_SSOTOKEN_INFO:
                    serviceImpl.setUserSSOTokenInfo((com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSSOTokenInfoResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_APNTOKEN_INFO:
                    serviceImpl.setUserAPNTokenInfo((com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserAPNTokenInfoResponse>) responseObserver);
                    break;
                case METHODID_CLEAR_APNTOKEN_INFO:
                    serviceImpl.clearAPNTokenInfo((com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.ClearAPNTokenInfoResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_QUICK_ROOMS:
                    serviceImpl.setUserQuickRooms((com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserQuickRoomsResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_QUICK_ROOMS:
                    serviceImpl.getUserQuickRooms((com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserQuickRoomsResponse>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_QUICK_ROOMS:
                    serviceImpl.removeUserQuickRooms((com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserQuickRoomsResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_STAND_BY_ROOMS:
                    serviceImpl.setUserStandByRooms((com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserStandByRoomsResponse>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_STAND_BY_ROOMS:
                    serviceImpl.removeUserStandByRooms((com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserStandByRoomsResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_STAND_BY_ROOMS:
                    serviceImpl.getUserStandByRooms((com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserStandByRoomsResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_BASE_INFO_ID:
                    serviceImpl.getUserBaseInfoID((com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfoIDResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_ACCESS_TOKEN:
                    serviceImpl.getUserAccessToken((com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserAccessTokenResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_ACCESS_TOKEN:
                    serviceImpl.setUserAccessToken((com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserAccessTokenResponse>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_ACCESS_TOKEN:
                    serviceImpl.removeUserAccessToken((com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserAccessTokenResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_CRYPT_KEY:
                    serviceImpl.getUserCryptKey((com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserCryptKeyResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_CRYPT_KEY:
                    serviceImpl.setUserCryptKey((com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserCryptKeyResponse>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_CRYPT_KEY:
                    serviceImpl.removeUserCryptKey((com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserCryptKeyResponse>) responseObserver);
                    break;
                case METHODID_CHECK_USER_COIN:
                    serviceImpl.checkUserCoin((com.texaspoker.moment.TexasPokerUserService.CheckUserCoinRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserCoinResponse>) responseObserver);
                    break;
                case METHODID_CHECK_USER_POPULARITY:
                    serviceImpl.checkUserPopularity((com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserPopularityResponse>) responseObserver);
                    break;
                case METHODID_ADD_USER_MTTGAME:
                    serviceImpl.addUserMTTGame((com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.AddUserMTTGameResponse>) responseObserver);
                    break;
                case METHODID_REMOVE_USER_MTTGAME:
                    serviceImpl.removeUserMTTGame((com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.RemoveUserMTTGameResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_MTTGAMES:
                    serviceImpl.getUserMTTGames((com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserMTTGamesResponse>) responseObserver);
                    break;
                case METHODID_GET_UUID_BY_STRID:
                    serviceImpl.getUuidByStrid((com.texaspoker.moment.TexasPokerUserService.GetUuidByStridRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUuidByStridResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_BASE_INFOS_BY_BATCH:
                    serviceImpl.getUserBaseInfosByBatch((com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserBaseInfosByBatchResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_SECURITY_STATUS:
                    serviceImpl.setUserSecurityStatus((com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityStatusResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_PROTECT_STATUS:
                    serviceImpl.setUserProtectStatus((com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserProtectStatusResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_SECURITY_CODE:
                    serviceImpl.setUserSecurityCode((com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserSecurityCodeResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_SECURITY_CODE:
                    serviceImpl.getUserSecurityCode((com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserSecurityCodeResponse>) responseObserver);
                    break;
                case METHODID_UPDATE_USER_LIMIT_TOKEN:
                    serviceImpl.updateUserLimitToken((com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateUserLimitTokenResponse>) responseObserver);
                    break;
                case METHODID_SET_LAST_USER_LOGIN_TOKEN:
                    serviceImpl.setLastUserLoginToken((com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetLastUserLoginTokenResponse>) responseObserver);
                    break;
                case METHODID_CHECK_USER_LIMT_TOKEN:
                    serviceImpl.checkUserLimtToken((com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckUserLimtTokenResponse>) responseObserver);
                    break;
                case METHODID_SET_USER_VOICE_RECOGNITION:
                    serviceImpl.setUserVoiceRecognition((com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.SetUserVoiceRecognitionResponse>) responseObserver);
                    break;
                case METHODID_CHECK_RE_WARD_REQUEST:
                    serviceImpl.checkReWardRequest((com.texaspoker.moment.TexasPokerUserService.CheckReWardRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.CheckReWardResponse>) responseObserver);
                    break;
                case METHODID_UPDATE_SUPER_VISA_VESION:
                    serviceImpl.updateSuperVisaVesion((com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateSuperVisaVesionResponse>) responseObserver);
                    break;
                case METHODID_GET_SUPER_VISA_VESION_INFO:
                    serviceImpl.getSuperVisaVesionInfo((com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetSuperVisaVesionInfoResponse>) responseObserver);
                    break;
                case METHODID_UPDATE_USER_TIME_ZONE:
                    serviceImpl.updateUserTimeZone((com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.UpdateUserTimeZoneResponse>) responseObserver);
                    break;
                case METHODID_GET_USER_TIME_ZONE:
                    serviceImpl.getUserTimeZone((com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.GetUserTimeZoneResponse>) responseObserver);
                    break;
                case METHODID_DEBUG_CLEAR_USER_INFO:
                    serviceImpl.debugClearUserInfo((com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoRequest) request,
                            (io.grpc.stub.StreamObserver<com.texaspoker.moment.TexasPokerUserService.DebugClearUserInfoResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class UserServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        UserServiceBaseDescriptorSupplier() {}

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.texaspoker.moment.TexasPokerUserService.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("UserService");
        }
    }

    private static final class UserServiceFileDescriptorSupplier
            extends UserServiceBaseDescriptorSupplier {
        UserServiceFileDescriptorSupplier() {}
    }

    private static final class UserServiceMethodDescriptorSupplier
            extends UserServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        UserServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (UserServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
                            .addMethod(getGetUserBaseInfoMethod())
                            .addMethod(getGetUserBaseInfoByShowIDMethod())
                            .addMethod(getAddNewUserBaseInfoMethod())
                            .addMethod(getAddUserPopularityMethod())
                            .addMethod(getAddUserCoinMethod())
                            .addMethod(getAddUserPopularityTypeMethod())
                            .addMethod(getAddUserCoinTypeMethod())
                            .addMethod(getSetUserTypeMethod())
                            .addMethod(getSetUserBaseInfoAlbumeMethod())
                            .addMethod(getSetUserBaseInfoCoverMethod())
                            .addMethod(getSetUserBaseInfoVIPMethod())
                            .addMethod(getSetUserBaseInfoLoginTimeMethod())
                            .addMethod(getSetUserBaseInfoSettingMethod())
                            .addMethod(getSetUserBaseInfoLocalSettingMethod())
                            .addMethod(getSetUserBaseInfoAppTypeMethod())
                            .addMethod(getSetUserBaseInfoCurrentVersionMethod())
                            .addMethod(getUploadUserCoverMethod())
                            .addMethod(getDeleteUserCoverMethod())
                            .addMethod(getSetUserRegisterPWDMethod())
                            .addMethod(getGetUserRegisterPWDMethod())
                            .addMethod(getSetUserRegisterDataMethod())
                            .addMethod(getGetUserRegisterDataMethod())
                            .addMethod(getSetUserRegisterVerifyCodeMethod())
                            .addMethod(getGetUserRegisterVerifyCodeMethod())
                            .addMethod(getGetNewUuidMethod())
                            .addMethod(getAddUserCreateGameRoomsMethod())
                            .addMethod(getRemoveUserCreateGameRoomsMethod())
                            .addMethod(getGetUserCreateGameRoomsMethod())
                            .addMethod(getAddUserClubsMethod())
                            .addMethod(getGetUserClubsMethod())
                            .addMethod(getRemoveUserClubsMethod())
                            .addMethod(getAddUserChatRoomsMethod())
                            .addMethod(getRemoveUserChatRoomsMethod())
                            .addMethod(getGetUserChatRoomsMethod())
                            .addMethod(getSetUserInTableMethod())
                            .addMethod(getRemoveUserInTableMethod())
                            .addMethod(getGetUserInTableMethod())
                            .addMethod(getGetUserTokenInfoMethod())
                            .addMethod(getSetUserSSOTokenInfoMethod())
                            .addMethod(getSetUserAPNTokenInfoMethod())
                            .addMethod(getClearAPNTokenInfoMethod())
                            .addMethod(getSetUserQuickRoomsMethod())
                            .addMethod(getGetUserQuickRoomsMethod())
                            .addMethod(getRemoveUserQuickRoomsMethod())
                            .addMethod(getSetUserStandByRoomsMethod())
                            .addMethod(getRemoveUserStandByRoomsMethod())
                            .addMethod(getGetUserStandByRoomsMethod())
                            .addMethod(getGetUserBaseInfoIDMethod())
                            .addMethod(getGetUserAccessTokenMethod())
                            .addMethod(getSetUserAccessTokenMethod())
                            .addMethod(getRemoveUserAccessTokenMethod())
                            .addMethod(getGetUserCryptKeyMethod())
                            .addMethod(getSetUserCryptKeyMethod())
                            .addMethod(getRemoveUserCryptKeyMethod())
                            .addMethod(getCheckUserCoinMethod())
                            .addMethod(getCheckUserPopularityMethod())
                            .addMethod(getAddUserMTTGameMethod())
                            .addMethod(getRemoveUserMTTGameMethod())
                            .addMethod(getGetUserMTTGamesMethod())
                            .addMethod(getGetUuidByStridMethod())
                            .addMethod(getGetUserBaseInfosByBatchMethod())
                            .addMethod(getSetUserSecurityStatusMethod())
                            .addMethod(getSetUserProtectStatusMethod())
                            .addMethod(getSetUserSecurityCodeMethod())
                            .addMethod(getGetUserSecurityCodeMethod())
                            .addMethod(getUpdateUserLimitTokenMethod())
                            .addMethod(getSetLastUserLoginTokenMethod())
                            .addMethod(getCheckUserLimtTokenMethod())
                            .addMethod(getSetUserVoiceRecognitionMethod())
                            .addMethod(getCheckReWardRequestMethod())
                            .addMethod(getUpdateSuperVisaVesionMethod())
                            .addMethod(getGetSuperVisaVesionInfoMethod())
                            .addMethod(getUpdateUserTimeZoneMethod())
                            .addMethod(getGetUserTimeZoneMethod())
                            .addMethod(getDebugClearUserInfoMethod())
                            .build();
                }
            }
        }
        return result;
    }
}
