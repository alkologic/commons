package com.alkologic.commons;

import java.io.IOException;
import java.net.ServerSocket;
import com.alkologic.commons.exceptions.AlreadyRunnningException;

public class SingleInstance {

  // private port range 49152-65535
  public static void exitIfRunning(int port) {
    try {
      ServerSocket socket = new ServerSocket(port);

      Runnable closeSocket = () -> {
        try {
          socket.close();
        } catch (IOException e) {
        }
      };

      Runtime.getRuntime()
          .addShutdownHook(new Thread(closeSocket));
    } catch (IOException e) {
      throw new AlreadyRunnningException();
    }
  }
}
