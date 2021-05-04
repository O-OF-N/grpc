package com.ecommerce;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: product.proto")
public final class ProductResourceGrpc {

  private ProductResourceGrpc() {}

  public static final String SERVICE_NAME = "server.ecommerce.ProductResource";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecommerce.ProductId,
      com.ecommerce.Product> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProduct",
      requestType = com.ecommerce.ProductId.class,
      responseType = com.ecommerce.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecommerce.ProductId,
      com.ecommerce.Product> getGetProductMethod() {
    io.grpc.MethodDescriptor<com.ecommerce.ProductId, com.ecommerce.Product> getGetProductMethod;
    if ((getGetProductMethod = ProductResourceGrpc.getGetProductMethod) == null) {
      synchronized (ProductResourceGrpc.class) {
        if ((getGetProductMethod = ProductResourceGrpc.getGetProductMethod) == null) {
          ProductResourceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<com.ecommerce.ProductId, com.ecommerce.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecommerce.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecommerce.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductResourceMethodDescriptorSupplier("getProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecommerce.Product,
      com.ecommerce.ProductId> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProduct",
      requestType = com.ecommerce.Product.class,
      responseType = com.ecommerce.ProductId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecommerce.Product,
      com.ecommerce.ProductId> getAddProductMethod() {
    io.grpc.MethodDescriptor<com.ecommerce.Product, com.ecommerce.ProductId> getAddProductMethod;
    if ((getAddProductMethod = ProductResourceGrpc.getAddProductMethod) == null) {
      synchronized (ProductResourceGrpc.class) {
        if ((getAddProductMethod = ProductResourceGrpc.getAddProductMethod) == null) {
          ProductResourceGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<com.ecommerce.Product, com.ecommerce.ProductId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecommerce.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecommerce.ProductId.getDefaultInstance()))
              .setSchemaDescriptor(new ProductResourceMethodDescriptorSupplier("addProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductResourceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductResourceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductResourceStub>() {
        @java.lang.Override
        public ProductResourceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductResourceStub(channel, callOptions);
        }
      };
    return ProductResourceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductResourceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductResourceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductResourceBlockingStub>() {
        @java.lang.Override
        public ProductResourceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductResourceBlockingStub(channel, callOptions);
        }
      };
    return ProductResourceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductResourceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductResourceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductResourceFutureStub>() {
        @java.lang.Override
        public ProductResourceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductResourceFutureStub(channel, callOptions);
        }
      };
    return ProductResourceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductResourceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProduct(com.ecommerce.ProductId request,
        io.grpc.stub.StreamObserver<com.ecommerce.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    public void addProduct(com.ecommerce.Product request,
        io.grpc.stub.StreamObserver<com.ecommerce.ProductId> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ecommerce.ProductId,
                com.ecommerce.Product>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            getAddProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ecommerce.Product,
                com.ecommerce.ProductId>(
                  this, METHODID_ADD_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductResourceStub extends io.grpc.stub.AbstractAsyncStub<ProductResourceStub> {
    private ProductResourceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductResourceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductResourceStub(channel, callOptions);
    }

    /**
     */
    public void getProduct(com.ecommerce.ProductId request,
        io.grpc.stub.StreamObserver<com.ecommerce.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProduct(com.ecommerce.Product request,
        io.grpc.stub.StreamObserver<com.ecommerce.ProductId> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductResourceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductResourceBlockingStub> {
    private ProductResourceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductResourceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductResourceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecommerce.Product getProduct(com.ecommerce.ProductId request) {
      return blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecommerce.ProductId addProduct(com.ecommerce.Product request) {
      return blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductResourceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductResourceFutureStub> {
    private ProductResourceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductResourceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductResourceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecommerce.Product> getProduct(
        com.ecommerce.ProductId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecommerce.ProductId> addProduct(
        com.ecommerce.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT = 0;
  private static final int METHODID_ADD_PRODUCT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductResourceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductResourceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((com.ecommerce.ProductId) request,
              (io.grpc.stub.StreamObserver<com.ecommerce.Product>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.ecommerce.Product) request,
              (io.grpc.stub.StreamObserver<com.ecommerce.ProductId>) responseObserver);
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

  private static abstract class ProductResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductResourceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecommerce.ProductProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductResource");
    }
  }

  private static final class ProductResourceFileDescriptorSupplier
      extends ProductResourceBaseDescriptorSupplier {
    ProductResourceFileDescriptorSupplier() {}
  }

  private static final class ProductResourceMethodDescriptorSupplier
      extends ProductResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductResourceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductResourceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductResourceFileDescriptorSupplier())
              .addMethod(getGetProductMethod())
              .addMethod(getAddProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
