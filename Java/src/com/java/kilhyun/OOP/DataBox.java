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
        System.out.println("ConsummerThread 가 읽은 데이터: " + returnValue);

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
        System.out.println("ProducerThread 가 생성한 데이터: " + data);
        notify();
    }

}
