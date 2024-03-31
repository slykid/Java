package com.example.ioc;

public class Encoder implements IEncoder{

    private IEncoder iEncdoer;

    public Encoder(IEncoder iEncoder) {
        this.iEncdoer = iEncoder;
    }

    public String encode(String message)
    {
        return iEncdoer.encode(message);
    }

}
