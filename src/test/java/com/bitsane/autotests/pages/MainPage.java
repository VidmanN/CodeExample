package com.bitsane.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page {

    public MainPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.authorization-btn[href='/login']")
    public WebElement LogIn;

    @FindBy(css = "a.authorization-btn[href='/signup']")
    public WebElement SignUp;
}
