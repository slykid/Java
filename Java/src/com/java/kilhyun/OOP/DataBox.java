package com.java.kilhyun.OOP;

public class DataBox {

    private String data;

    public synchronized String getData()
    {
        if(this.data == null)
        {
            try {
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        String returnValue = data;
        System.out.println("ConsummerThread �� ���� ������: " + returnValue);

        data = null;
        notify();

        return returnValue;
    }

    public synchronized void setData(String data)
    {
        if(this.data != null)
        {
            try {
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.data = data;
        System.out.println("ProducerThread �� ������ ������: " + data);
        notify();
    }

}
