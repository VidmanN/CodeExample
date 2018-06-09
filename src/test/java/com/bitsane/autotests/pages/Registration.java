package com.bitsane.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Registration extends Page {

    public Registration(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(site);
    }

    @FindBy(css = "a.authorization-btn[href='/signup']")
    private WebElement SignUp;

    @FindBy(name = "email")
    private WebElement InputEmail;

    @FindBy(css = "div#signup input.custom[name='password']")
    private WebElement InputPassword;

    @FindBy(name = "confirm_password")
    private WebElement InputConfirmPassword;

    @FindBy(css = "select.selectpicker")
    private WebElement SelectCountry;

    @FindBy(css = "div.form-capch")
    private WebElement Captcha;

    @FindBy(css = "iframe[title='проверка recaptcha']")
    private WebElement CaptchaImg;

    @FindBy(css = "i.icon-checkbox")
    private WebElement Agree;

    @FindBy(css = "input#submitbutton")
    private WebElement Submit;

    @FindBy(css = "h1.title")
    private WebElement SuccessfulRegistration;


    public void clickSignUp(){
        SignUp.click();    }

    public  void countrySelect(String CountryName) {
        Select drop = new Select(SelectCountry);
        drop.selectByValue(CountryName);
    }
    public void fillingRegistrationForm(String email, String password, String country) {
        wait.until(ExpectedConditions.visibilityOf(InputEmail));
        InputEmail.click();
        InputEmail.sendKeys(email);
        InputPassword.click();
        InputPassword.sendKeys(password);
        InputConfirmPassword.click();
        InputConfirmPassword.sendKeys(password);
        countrySelect(country);
        Captcha.click();
        wait.until(ExpectedConditions.visibilityOf(CaptchaImg));
        while (CaptchaImg.isDisplayed()) {
        }
        wait.until(ExpectedConditions.visibilityOf(Agree));
        Agree.click();
        Submit.click();
    }
}
