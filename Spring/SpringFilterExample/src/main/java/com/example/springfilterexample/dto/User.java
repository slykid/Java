package com.example.springfilterexample.dto;

import lombok.*;

@Data                // lombok 활용 시, 모든 생성자 및 메소드 생성을 의미함
//@Getter              // lombok 활용 시, Getter 메소드의 생성을 의미함
//@Setter              // lombok 활용 시, Setter 메소드의 생성을 의미함
@NoArgsConstructor   // lombok 활용 시, 기본 생성자를 의미함
@AllArgsConstructor  // lombok 활용 시, 전체 생성자를 의미함
public class User {

    private String name;
    private int age;

}
