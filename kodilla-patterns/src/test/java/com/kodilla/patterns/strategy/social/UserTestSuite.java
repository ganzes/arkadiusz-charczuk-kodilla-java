package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
    //Given
        User allBundy = new Millenials("All Bundy");
        User pumpkin = new YGeneration("Kelly Bundy");
        User masterB = new ZGeneration("Bud Bundy");

    //When
        String allPublishOn = allBundy.sharePost();
        System.out.println("All will be sharing this on: " + allPublishOn);

        String pumpkinPublishOn = pumpkin.sharePost();
        System.out.println("Kelly will be sharing this on: " + pumpkinPublishOn);

        String masterBWillPublishOn = masterB.sharePost();
        System.out.println("Bud will be sharing this on: " + masterBWillPublishOn);

    //Then
        Assert.assertEquals("[Facebook]", allPublishOn);
        Assert.assertEquals("[Twitter]", pumpkinPublishOn);
        Assert.assertEquals("[Snapchat]", masterBWillPublishOn);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User allBundy = new Millenials("All Bundy");

        //When
        String allWillBeSharingThisOn = allBundy.sharePost();
        System.out.println("All is sharing this on " + allWillBeSharingThisOn);

        allBundy.setSharingOnMedia(new SnapchatPublisher());
        allWillBeSharingThisOn = allBundy.sharePost();
        System.out.println("All is now sharing this on "+ allWillBeSharingThisOn);

        //Then
        Assert.assertEquals("[Snapchat]", allWillBeSharingThisOn);
    }
}
