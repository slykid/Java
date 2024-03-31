package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder implements IEncoder{

    private IEncoder iEncdoer;

    public Encoder(@Qualifier("urlEncoder") IEncoder iEncoder) {
        this.iEncdoer = iEncoder;
    }

    public void setiEncdoer(IEncoder iEncoder) {
        this.iEncdoer = iEncoder;
    }

    public String encode(String message)
    {
        return iEncdoer.encode(message);
    }

}
