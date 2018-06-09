package com.bitsane.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Gmail extends Page {

    public Gmail (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://www.google.com/intl/ru/gmail/about/");
    }

    //---------------------------------------Sign In to Gmail------------------------
    @FindBy(css = "a[data-g-label^=Sign]")
    public WebElement SignIn;

    @FindBy(id = "identifierId")
    private WebElement InputEmail;

    @FindBy(id = "identifierNext")
    private WebElement ButtonLogInNext;

    @FindBy(name = "password")
    private WebElement InputPassword;

    @FindBy(id = "passwordNext")
    private WebElement ButtonPassNext;
    //---------------------------------------End---------------------------------------

    //---------------------------------------Letters-----------------------------------
    @FindBy (css = "tr.zA")
    private List<WebElement> Letters;
    //---------------------------------------End---------------------------------------

    public void logInToGmail(String email, String password) {
        this.open();
        SignIn.click();
        InputEmail.click();
        InputEmail.sendKeys(email);
        ButtonLogInNext.click();
        wait.until(ExpectedConditions.visibilityOf(InputPassword));
        InputPassword.sendKeys(password);
        ButtonPassNext.click();
    }

    public void activationByLetter (){
        List<WebElement> aInLetter = driver.findElements(By.cssSelector("td > a"));
        int size = aInLetter.size();
        for (int i = 0; i < size; i++){
            if (aInLetter.get(i).getText().equals("Verify my email address")){
                aInLetter.get(i).click();
                i = size;
            }
        }
    }

    public void findLetter(String senderName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td.a4g")));
        int size = Letters.size();
        for (int i=0;i<size;i++){
           if ( Letters.get(i).getText().contains(senderName) && Letters.get(i).getText().contains("Activation") ){
               Letters.get(i).click();
               i = size;
           }
        }
        activationByLetter();
    }
}
