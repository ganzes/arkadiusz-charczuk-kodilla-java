package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired//pobieram z kontenera Springowego
            Display display;

    public Double add(double a, double b) {
        Double addSum = a + b;
        display.displayValue(addSum);
        return addSum;
    }

    public Double sub(double a, double b) {
        Double subSum = a - b;
        display.displayValue(subSum);
        return subSum;

    }

    public Double mul(double a, double b) {
        Double mulSum = a * b;
        display.displayValue(mulSum);
        return mulSum;
    }

    public Double div(double a, double b) {
        Double divSum = a / b;
        display.displayValue(divSum);
        return divSum;
    }

}
