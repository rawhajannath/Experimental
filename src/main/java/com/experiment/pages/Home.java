package com.experiment.pages;

import com.experiment.core.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Home extends CommonActions {

    @FindBy(id = "topnavitem_signup")
    @CacheLookup
    public WebElement btn_createAccount;

    public Home(WebDriver driver){
        this.driver = driver;
        initElement();
    }

    public void clickOnCreateAccount(){
        clickOnElement(btn_createAccount);
    }


}
