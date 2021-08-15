package com.java.kilhyun.OOP;

import java.io.Serializable;

public class TestA implements Serializable {

    int field1;                     // 직렬화
    TestB field2 = new TestB();     // 직렬화
    static int field3;              // 직렬화 x
    transient int field4;           // 직렬화 x
}
