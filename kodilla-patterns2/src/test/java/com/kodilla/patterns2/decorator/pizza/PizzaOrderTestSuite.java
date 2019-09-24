package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaWithPaprikaCheeseJoke(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PaprikaDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new JokeDecorator(theOrder);
        theOrder = new EndPizzaOrderDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(16), theCost);
        assertEquals("Pie is ready, adding topings: base, paprika, cheese, " +
                "with funny joke on box, and your order is ready!", description);
    }

    @Test
    public void testPizzaWithPaprikaTwoCheeseTwoJoke(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new PaprikaDecorator(theOrder);
        theOrder = new JokeDecorator(theOrder);
        theOrder = new JokeDecorator(theOrder);
        theOrder = new EndPizzaOrderDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        System.out.println(theOrder.getCost());
        //When
        String description = theOrder.getDescription();
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), theCost);
        assertEquals("Pie is ready, adding topings: base, cheese, cheese, paprika, " +
                "with funny joke on box, with funny joke on box, and your order is ready!", description);
    }

    @Test
    public void testPizzaWithAllOfIt(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new PaprikaDecorator(theOrder);
        theOrder = new PeperroniDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new JokeDecorator(theOrder);
        theOrder = new ExpressDeliveryDecorator(theOrder);
        theOrder = new EndPizzaOrderDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        System.out.println(theOrder.getCost());
        //When
        String description = theOrder.getDescription();
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
        assertEquals("Pie is ready, adding topings: base, cheese, paprika, peperroni, salami, " +
                "with funny joke on box, with express delivery, and your order is ready!", description);
    }
}
