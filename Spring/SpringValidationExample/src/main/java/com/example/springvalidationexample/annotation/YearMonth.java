package com.example.springvalidationexample.annotation;


import com.example.springvalidationexample.validator.YearMonthValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {YearMonthValidator.class})  // Validation 에 이용할 클래스
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR,ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface YearMonth {

    // 에러 시, 출력할 문구
    String message() default "yyyyMM 의 형식에 맞지 않습니다.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    // Validation 에 만족할 패턴 및 기본값 설정
    String pattern() default "yyyyMMdd";
}
