package com.bitsane.autotests.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogIn extends Page{

    public LogIn(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(site);
    }

    @FindBy(css = "a.authorization-btn[href='/login']") //.authorization-btn
    private WebElement LogIn;

    @FindBy(name = "login")
    private WebElement Email;

    @FindBy(css = "div#signin input.custom[name='password']")
    private WebElement Password;

    @FindBy(css = "input#submit_button")
    private WebElement Submit;

    @FindBy(css = "div.main-navigation a[href='/user/logout']")
    private WebElement LogOut;

    @FindBy(css = "a.navbar-brand")
    private WebElement icon;

    public void logIn(String email, String password) {
        wait.until(ExpectedConditions.visibilityOf(LogIn));
        wait.until(ExpectedConditions.elementToBeClickable(LogIn));
        LogIn.click();
        Email.click();
        Email.sendKeys(email);
        Password.click();
        Password.sendKeys(password);
        Submit.click();
    }

    public boolean logInPassed(){
        wait.until(ExpectedConditions.elementToBeClickable(LogOut));
        takeScreenshot();
        return LogOut.isDisplayed();
    }

    public void logout(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,-2000);");
        wait.until(ExpectedConditions.elementToBeClickable(LogOut));
        LogOut.click();
        wait.until(ExpectedConditions.elementToBeClickable(LogIn));
    }
}
