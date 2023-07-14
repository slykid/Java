package com.example.springcalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Calculator 클래스에서 minus 메소드에 대한 RequestMapping 어노테이션을 @PostMapping 으로 변경한 후에 사용가능함
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Req {

    private int x;
    private int y;

}
