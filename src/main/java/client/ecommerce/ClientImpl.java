package client.ecommerce;

import com.server.ecommerce.Product;
import com.server.ecommerce.ProductId;
import com.server.ecommerce.ProductResourceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientImpl {
  public static void main(String[] args) {
    ManagedChannel channel =
        ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
    ProductResourceGrpc.ProductResourceBlockingStub stub =
        ProductResourceGrpc.newBlockingStub(channel);
    ProductId productId =
        stub.addProduct(Product.newBuilder().setName("name").setDescription("desc").build());
    System.out.println(productId.getValue());
    Product product = stub.getProduct(productId);
    System.out.println(product.getName());
    channel.shutdown();
  }
}
