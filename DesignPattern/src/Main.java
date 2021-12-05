import singleton.ClassA;
import singleton.ClassB;
import singleton.SocketClient;

public class Main {

    public static void main(String[] args)
    {
        // 1. Singleton Pattern
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        SocketClient aClient = classA.getSocketClient();
        SocketClient bClient = classB.getSocketClient();

        System.out.println("aClient 와 bClient 가 동일한가?");
        System.out.println(aClient.equals(bClient));

    }
}
