package org.example.mvcjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
public class YoilTellerMVC
{
    @ExceptionHandler(Exception.class)
    public String catcher(Exception ex)
    {
        ex.printStackTrace();

        return "yoilError";
    }

    @RequestMapping("/getYoilMvc")
    public String main(@RequestParam int year, int month, int day, Model model)
    {
        if(!isValid(year, month, day))
            return "yoilError";

        char yoil = getYoil(year, month, day);

        model.addAttribute("year", year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);
        model.addAttribute("yoil", yoil);

        return "yoil";
    }

    private boolean isValid(int year, int month, int day)
    {
    	if(year==-1 || month==-1 || day==-1)
    		return false;

    	return (1<=month && month<=12) && (1<=day && day<=31); // 간단히 체크
    }

    private char getYoil(int year, int month, int day)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return " 일월화수목금토".charAt(dayOfWeek);
    }

}
