package com.experiment.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommonActions {
    protected WebDriver driver;

    public void initElement() {
        PageFactory.initElements(driver, this);
    }

    protected  void navigateToUrl(String pageUrl){
        driver.get(pageUrl);
    }
    protected void clickOnElement(WebElement element){
        element.click();
    }


    public void sleep(int inMilliSec){
        try {
            Thread.sleep(inMilliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
