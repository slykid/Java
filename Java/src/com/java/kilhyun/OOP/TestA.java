package com.java.kilhyun.OOP;

import java.io.Serializable;

public class TestA implements Serializable {

    int field1;                     // ����ȭ
    TestB field2 = new TestB();     // ����ȭ
    static int field3;              // ����ȭ x
    transient int field4;           // ����ȭ x
}
