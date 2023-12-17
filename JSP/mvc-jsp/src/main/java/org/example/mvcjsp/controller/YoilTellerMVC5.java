package org.example.mvcjsp.controller;

import org.example.mvcjsp.dto.MyDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

@Controller
public class YoilTellerMVC5
{
    @ExceptionHandler(Exception.class)
    public String catcher(Exception ex)
    {
        ex.printStackTrace();

        return "yoilError";
    }

    @RequestMapping("/getYoilMvc5")
//    public String main(@ModelAttribute("myDate") MyDate date, Model model)
//    - @ModelAttribute: 적용대상을 Model 속성으로 자동 추가해주는 어노테이션, 반환타입 또는 컨트롤러 메소드의 매개변수에 적용가능
//    - 반드시 참조형 매개변수 앞에 붙여줘야 함 (생략 가능)
//
//    * 컨트롤러 매개변수
//    - 기본형, String 형인 경우: RequestParam 생략
//    - 참조형인 경우: ModelAttribute 생략
    public String main(@ModelAttribute MyDate date, Model model)
    {
        if(!isValid(date))
            return "yoilError";

        // YoilTellerMVC4 에 있었던 addAttribute 관련코드없이 실행 가능

        return "yoil";
    }

    private boolean isValid(MyDate date) {
        return isValid(date.getYear(), date.getMonth(), date.getDay());
    }

    private boolean isValid(int year, int month, int day)
    {
    	if(year==-1 || month==-1 || day==-1)
    		return false;

    	return (1<=month && month<=12) && (1<=day && day<=31); // 간단히 체크
    }


    private @ModelAttribute("yoil") char getYoil(MyDate date) {
        return getYoil(date.getYear(), date.getMonth(), date.getDay());
    }

    private char getYoil(int year, int month, int day)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return " 일월화수목금토".charAt(dayOfWeek);
    }

}
