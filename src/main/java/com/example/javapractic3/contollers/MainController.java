package com.example.javapractic3.contollers;

import com.example.javapractic3.dao.NumberDAO;
import com.example.javapractic3.models.Number;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {
    private NumberDAO numberDAO;

    @GetMapping("/calculator")
    public String getResult(@RequestParam int a, @RequestParam int b, @RequestParam String action){
        Number number = new Number(a,b,action);
        number.ChoseMove();
        numberDAO.save(number);
        return (number.getNumber1() + " + " + number.getNumber2() + " = " + number.getResult());
    }
}
