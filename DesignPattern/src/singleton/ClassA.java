package singleton;

public class ClassA {

    private SocketClient socketClient;

    public ClassA() {
//        this.socketClient = SocketClient.getInstance();  // 비교 시, true 로 나옴
        this.socketClient = new SocketClient();  // SocketClient 의 생성자는 public으로 해제 후, 비교 진행할 것
                                                 // 비교 시, false 로 나옴
    }

    public SocketClient getSocketClient() {
        return  this.socketClient;
    }

}
