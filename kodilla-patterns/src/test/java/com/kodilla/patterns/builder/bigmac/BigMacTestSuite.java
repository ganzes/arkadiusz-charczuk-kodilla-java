package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuild(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("bun with sesame")
                .burgers(2)
                .sauc("garlic")
                .sauc("Jack Daniels BBQ")
                .ingredient("onion")
                .ingredient("tomato")
                .ingredient("cheese")
                .build();
        System.out.println(bigMac);
        //When
        int howManySauce = bigMac.getSauce().size();
        String whatKindOfBun = bigMac.getBun();
        int howManyIngredients = bigMac.getIngredients().size();
        int howManyBurgers = bigMac.getBurgers();
        //Then
        Assert.assertEquals(2,howManySauce);
        Assert.assertEquals("bun with sesame",whatKindOfBun);
        Assert.assertEquals(3,howManyIngredients);
        Assert.assertEquals(2,howManyBurgers);

    }
}
