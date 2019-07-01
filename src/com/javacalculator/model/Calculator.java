package com.javacalculator.model;

import java.math.BigDecimal;

public class Calculator {
    String operand;
    BigDecimal y;
    BigDecimal x;

    public Calculator(BigDecimal x, String operand, BigDecimal y){
        this.x=x;
        this.y=y;
        this.operand=operand;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }


    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }





}
