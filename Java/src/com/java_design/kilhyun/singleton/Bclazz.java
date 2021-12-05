package com.java_design.kilhyun.singleton;

public class Bclazz {

    private SocketClient socketClient;

    public Bclazz() {
        this.socketClient = SocketClient.getInstance();  // º¯°æ Àü
        // this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
