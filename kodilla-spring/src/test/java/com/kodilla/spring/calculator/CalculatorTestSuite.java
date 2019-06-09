package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double resultAdd = calculator.add(1.0,2.0);
        Double resultSub = calculator.sub(2.0, 1.0);
        Double resultMul = calculator.mul(2.0,2.0);
        Double resultDiv = calculator.div(2.0,2.0);

        //Then
        Assert.assertEquals(3.0, resultAdd, 0.1);
        Assert.assertEquals(1.0, resultSub, 0.1);
        Assert.assertEquals(4.0, resultMul, 0.1);
        Assert.assertEquals(1.0, resultDiv, 0.1);
    }
}
