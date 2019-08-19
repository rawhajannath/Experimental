package com.experiment.assertions;

import org.testng.Assert;

public class Verify {
    public static void verifyTrue(boolean isTrue){
        Assert.assertTrue(isTrue);
    }

    public static void verifyTrue(boolean isTrue, String message){
        Assert.assertTrue(isTrue, message);
    }

    public static void verifyEqual(String actual, String expected){
        Assert.assertEquals(actual, expected);
    }

    public static void verifyEqual(String actual, String expected, String message){
        Assert.assertEquals(actual, expected, message);
    }
}
