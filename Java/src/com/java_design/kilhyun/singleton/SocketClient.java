package com.java_design.kilhyun.singleton;

public class SocketClient {
    /*
     - step 1. default 생성자 생성
     - step 2. getInstance() 메소드에 한 번만 생성할 수 있도록 매개변수로 넘어온 객체가 null 인지, 아닌지 확인
               만약 null 인 경우라면, 객체를 생성 / 아니라면, 기존에 매개변수로 넘어온 객체를 사용
    */

    private static SocketClient socketClient = null;

    // 변경 전
    // private SocketClient() {
    //
    // }

    // 변경 후
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
