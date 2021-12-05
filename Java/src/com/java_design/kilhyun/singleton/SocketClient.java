package com.java_design.kilhyun.singleton;

public class SocketClient {
    /*
     - step 1. default ������ ����
     - step 2. getInstance() �޼ҵ忡 �� ���� ������ �� �ֵ��� �Ű������� �Ѿ�� ��ü�� null ����, �ƴ��� Ȯ��
               ���� null �� �����, ��ü�� ���� / �ƴ϶��, ������ �Ű������� �Ѿ�� ��ü�� ���
    */

    private static SocketClient socketClient = null;

    // ���� ��
    // private SocketClient() {
    //
    // }

    // ���� ��
    public SocketClient() {}

    public static SocketClient getInstance() {

        if(socketClient == null) {
            socketClient = new SocketClient();
        }

        return socketClient;
    }

    public void connect() {
        System.out.println("Connect");
    }

}
