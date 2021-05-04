package server.ecommerce;

import com.server.ecommerce.Product;
import com.server.ecommerce.ProductId;
import com.server.ecommerce.ProductResourceGrpc.ProductResourceImplBase;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductInfoImpl extends ProductResourceImplBase {

  private Map<String, Product> productMap = new HashMap<>();

  @Override
  public void addProduct(Product request, StreamObserver<ProductId> responseObserver) {
    UUID uuid = UUID.randomUUID();
    String uuidStr = uuid.toString();
    productMap.put(uuidStr, request);
    responseObserver.onNext(ProductId.newBuilder().setValue(uuidStr).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getProduct(ProductId request, StreamObserver<Product> responseObserver) {
    String productId = request.getValue();
    if (productMap.containsKey(productId)) {
      Product product = productMap.get(productId);
      responseObserver.onNext(product);
      responseObserver.onCompleted();
    } else {
      responseObserver.onError(new StatusException(Status.NOT_FOUND));
    }
  }
}
