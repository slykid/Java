package com.java.kilhyun.OOP;

public class ex30_10_WaitNotifyTest2 {

    public static void main(String[] args)
    {
        DataBox dataBox = new DataBox();

        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);

        producerThread.start();
        consumerThread.start();
    }
}
