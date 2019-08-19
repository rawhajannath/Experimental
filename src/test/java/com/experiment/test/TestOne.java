package com.experiment.test;

import com.experiment.assertions.Verify;
import com.experiment.config.Configuration;
import com.experiment.pages.Home;
import org.testng.annotations.Test;

public class TestOne extends Configuration {

    @Test
    public  void testA(){
        Home home = new Home(driver);
        if(driver != null){
            System.out.println("DRIVER");
        }
        home.clickOnCreateAccount();
        Verify.verifyTrue(true);
        home.sleep(5000);
    }

}
