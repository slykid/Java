package com.java.kilhyun.OOP;

import java.util.LinkedList;
import java.util.Queue;

public class ex24_18_QueueTest {

    public static void main(String[] args)
    {
        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("Send Mail", "홍길동"));
        messageQueue.offer(new Message("Send SMS", "유재석"));
        messageQueue.offer(new Message("Send Kakaotalk", "송지효"));

        while(!messageQueue.isEmpty())
        {
            Message message = messageQueue.poll();
            switch (message.command)
            {
                case "Send Mail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "Send SMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "Send Kakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }

        }

    }

}
