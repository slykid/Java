package com.example.springcalculator.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;

@SpringBootTest // SpringBoot 에서 관리 중인 모든 객체를 주입하고자 할 때는 @SpringBootTest 어노테이션을 사용
//@Import({MarketApi.class, DollarCalculator.class})  // 특정 객체만 주입하고자 할 때는 @Import 어노테이션을 사용
public class DollarCalculatorTest {


    // Mocking 처리하고자 하는 MarketApi 가 Bean으로 관리되고 있기 때문에 @MockBean 어노테이션을 사용함
    @MockBean
    private MarketApi marketApi;

    @Autowired
    private Calculator calculator;

    @Test
    public void dollarCalculatorTest() {

        Mockito.when(marketApi.connect()).thenReturn(3000);

        int sum = calculator.sum(10 ,10);
        int minus = calculator.minus(10, 10);

        Assertions.assertEquals(60000, sum);
        Assertions.assertEquals(0, minus);
    }

}



