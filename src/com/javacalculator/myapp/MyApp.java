package com.javacalculator.myapp;

import java.math.BigDecimal;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args){
        while(true){
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("What is your first number: ");
        BigDecimal x = MyScanner.nextBigDecimal();
        System.out.println("What is your operand?");
        String operand = MyScanner.next();
        System.out.println("What is your second number?");
        BigDecimal y = MyScanner.nextBigDecimal();
        MyApp.Calculate(x, operand, y);
        }
    }

    private static void Calculate(BigDecimal x, String operand, BigDecimal y){

        switch(operand){
            case "+":
                BigDecimal add = x.add(y);
                System.out.println("x + y = " + add);
                return;
            case "-":
                BigDecimal subtract = x.subtract(y);
                System.out.println("x - y = " + subtract);
                return;
            case "*":
                BigDecimal multiply = x.multiply(y);
                System.out.println("x * y = " + multiply);
                return;
            case "/":
                BigDecimal divide = x.divide(y);
                System.out.println("x / y = " + divide);
                return;
            case "^":
                BigDecimal pow = x.pow(y.intValue());
                System.out.println("x^y =" + pow);
                return;
            default:
                System.out.println("Looks like you didn't enter a valid operand, let's try that again.");
        }
    }
}
