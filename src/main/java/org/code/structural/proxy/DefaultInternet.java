package org.code.structural.proxy;

public class DefaultInternet implements  Internet{
    @Override
    public void connectToHost(String serverHost) throws Exception {
        System.out.println("Connecting to " + serverHost);
    }
}
