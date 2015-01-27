package com.example.service;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class HelloWorldHttpServer {
  private final Server server;

  public HelloWorldHttpServer() {
    server = new Server(8080);
  }

  public void start() throws Exception {
    WebAppContext webAppContext = new WebAppContext();
    webAppContext.setContextPath("/");
    webAppContext.setWar("config/webapp");
    server.setHandler(webAppContext);
    server.start();
  }

  public void stop() {
    try {
      server.stop();
    } catch (Exception e) {
      System.out.println("Http server stopped failed" + e);
    }
  }

  public static void main(String[] args) throws Exception {
    HelloWorldHttpServer httpServer = new HelloWorldHttpServer();
    httpServer.start();
  }
}
