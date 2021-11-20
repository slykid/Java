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

        System.out.println("aClient �� bClient �� �����Ѱ�?");
        System.out.println(aClient.equals(bClient));

    }
}
