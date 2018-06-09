package com.bitsane.autotests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Balances extends Page {

    public Balances(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(site+"/balances");
    }

    @FindBy(css = "a[href='/balances/wallets']")
    private WebElement Wallets;

    @FindBy(css = "a[href='/balances/transactions']")
    private WebElement Transactions;

    @FindBy(css = "a[href='/balances/orders']")
    private WebElement Orders;

    @FindBy(css = "a[href='/balances/vouchers']")
    private WebElement Vouchers;

    @FindBy(css = "a[href='/balances/invoicing']")
    private WebElement Invoicing;

    @FindBy(css = "div.row.balances-box")
    private List<WebElement> BalancesBow;

    public void walletsBalancesBox() {
        Wallets.click();

        int elementsCount = BalancesBow.size();
        for (int i = 0; i < elementsCount; i++) {
            List<WebElement> elementsBalancesBox = BalancesBow;
            String amount = elementsBalancesBox.get(i).findElement(By.cssSelector("div.info-available-amount")).getText();
            if (!amount.regionMatches(0,"0.0", 0,3)){
                switch (elementsBalancesBox.get(i).findElement(By.cssSelector("span.currency-name")).getText()) {
                    case "Euro":
                        System.out.println("Euro");
                        break;
                    case "US Dollar":
                        System.out.println("Dollar");
                        break;
                    case "Bitcoin":
                        System.out.println("Bitcoin");
                        break;
                    default:
                        System.out.println("Other");
                        break;
                }
            }
        }
    }
}
