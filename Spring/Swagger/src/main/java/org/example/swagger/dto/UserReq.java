package org.example.swagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReq  {

    @Schema(description="사용자의 이름", example="slykid", required = true)
    private String name;

    @Schema(description="사용자의 나이", example="30", required = true)
    private int age;

}
