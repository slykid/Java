package com.java_design.kilhyun.singleton;

public class Aclazz {

    private SocketClient socketClient;

    public Aclazz() {
        this.socketClient = SocketClient.getInstance();  // º¯°æ Àü
        // this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
