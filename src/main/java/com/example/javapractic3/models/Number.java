package com.example.javapractic3.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Number {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number1;
    private int number2;
    private String action;
    private int result;

    public Number(int number1, int number2, String action) {
        this.number1 = number1;
        this.number2 = number2;
        this.action = action;
    }

    public void ChoseMove(){
        if (action.equals("add")) this.result = number1 + number2;
        if (action.equals("minus")) this.result = number1 - number2;
    }

}
