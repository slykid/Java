package com.java_design.kilhyun;

import com.java_design.kilhyun.singleton.Aclazz;
import com.java_design.kilhyun.singleton.Bclazz;
import com.java_design.kilhyun.singleton.SocketClient;

public class Singleton {

    public static void main(String[] args)
    {
        Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("�� ��ü�� �����Ѱ�?");
        System.out.println(aClient.equals(bClient));
    }

}
