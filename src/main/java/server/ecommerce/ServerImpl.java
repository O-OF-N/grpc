package server.ecommerce;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerImpl {

  public static void main(String[] args) throws IOException, InterruptedException {
    Integer port = 50051;
    Server server = ServerBuilder.forPort(port).addService(new ProductInfoImpl()).build().start();
    System.out.println("Running on port " + port);
    Runtime.getRuntime()
        .addShutdownHook(
            new Thread(
                () -> {
                  System.out.println("Shutting down");
                  if (server != null) server.shutdown();
                }));
    server.awaitTermination();
  }
}
