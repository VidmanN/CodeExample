package com.bitsane.autotests.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Timestamp;
import java.util.regex.*;
import java.util.List;

public class API extends Page{

    public API(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(site+"/help/api");
    }

    @FindBy(css = "div.accordion-item.api-public-item")
    private WebElement api_public;

    @FindBy(css = "div.accordion-item.api-public-item div.mCS_destroyed")
    private WebElement api_public_description;

    @FindBy(css = "div.accordion-item:nth-child(2)")
    private WebElement Ticker;

    @FindBy(xpath = "//*[span[contains(text(),'/api/public/ticker')]]")
    private WebElement Ticker_api_public_ticker;

    @FindBy(css = "div.api-info-content._mCS_3 input")
    private WebElement Ticker_api_public_ticker_value;

    @FindBy(xpath = "//*[@id='mCSB_3_container']/div[2]/pre[contains(text(),'last')]")
    private WebElement Ticker_api_public_ticker_result;

    @FindBy(css = "div.accordion-item:nth-child(3)")
    private WebElement Orders_Book;

    @FindBy(xpath = "//*[span[contains(text(),'/api/public/orderbook')]]")
    private WebElement Orders_Book_api_public_orderbook;

    @FindBy(css = "div.api-info-content._mCS_4 input")
    private List<WebElement> Orders_Book_api_public_orderbook_values;

    @FindBy(xpath = "//*[@id='mCSB_4_container']/div[2]/pre[contains(text(),'statusText')]")
    private WebElement Orders_Book_api_public_orderbook_result;

    @FindBy(css = "div.accordion-item:nth-child(4)")
    private WebElement Trades;

    @FindBy(xpath = "//*[span[contains(text(),'/api/public/trades')]]")
    private WebElement Trades_api_public_trades;

    @FindBy(css = "div.api-info-content._mCS_5 input")
    private List<WebElement> Trades_api_public_trades_values;

    @FindBy(xpath = "//*[@id='mCSB_5_container']/div[2]/pre[contains(text(),'statusText')]")
    private WebElement Trades_api_public_trades_result;

    @FindBy(css = "div.accordion-item:nth-child(5)")
    private WebElement Assets;

    @FindBy(css = "#mCSB_6_container button")
    private WebElement Assets_currencies_Submit;

    @FindBy(css = "#mCSB_7_container button")
    private WebElement Assets_pairs_Submit;

    @FindBy(xpath = "//*[span[contains(text(),'/api/public/assets/currencies')]]")
    private WebElement Assets_api_public_assets_currencies;

    @FindBy(xpath = "//*[@id='mCSB_6_container']/div[2]/pre")//[contains(text(),'full_name')]")
    private WebElement Assets_api_public_assets_currencies_result;

    @FindBy(xpath = "//*[span[contains(text(),'/api/public/assets/pairs')]]")
    private WebElement Assets_api_public_assets_pairs;

    @FindBy(xpath = "//*[@id='mCSB_7_container']/div[2]/pre[contains(text(),'base')]")
    private WebElement Assets_api_public_assets_pairs_result;

    @FindBy(css = "div.accordion-item:nth-child(7)")
    private WebElement Funds;

    @FindBy(xpath = "//*[span[contains(text(),'/api/private/balances')]]")
    private WebElement Funds_api_private_balances;

    @FindBy(xpath = "//*[@id='mCSB_10_container']/div[2]/pre")//[contains(text(),'Success')]")
    private WebElement Funds_api_private_balances_result;

    @FindBy(xpath = "//*[span[contains(text(),'/api/private/deposit/address')]]")
    private WebElement Funds_api_private_deposit_address;

    @FindBy(xpath = "//*[span[contains(text(),'/api/private/transactions/history')]]")
    private WebElement Funds_api_private_transactions_history;

    @FindBy(xpath = "//*[span[contains(text(),'/api/private/vouchers')]]")
    private WebElement Funds_api_private_vouchers;

    @FindBy(xpath = "//*[span[contains(text(),'/api/private/vouchers/create')]]")
    private WebElement Funds_api_private_vouchers_create;

    @FindBy(xpath = "//*[span[contains(text(),'/api/private/vouchers/redeem')]]")
    private WebElement Funds_api_private_vouchers_redeem;

    @FindBy(xpath = "//*[span[contains(text(),'/api/private/withdraw')]]")
    private WebElement Funds_api_private_withdraw;

    @FindBy(xpath = "//*[span[contains(text(),'/api/private/withdrawal/status')]]")
    private WebElement Funds_api_private_withdrawal_status;

    @FindBy(css = "div.accordion-item:nth-child(8)")
    private WebElement Orders_and_Trades;

    @FindBy(css = "div.accordion-item.api-private-item")
    private WebElement api_private;

    @FindBy(css = "input#api_nonce.api-input")
    private WebElement api_nonce;

    @FindBy(css = "input#api_key.api-input")
    private WebElement Api_Key;

    @FindBy(css = "input#api_secret.api-input")
    private WebElement Private_Key;

    @FindBy(css = "div.accordion-item.open > div.accordion-content > div:nth-child(2) > div.api-info-header")
    private WebElement POST_api_private_order_new;

    @FindBy(css = "div#mCSB_19_container input.api-input[name='pair']")
    private WebElement pair;

    @FindBy(css = "div#mCSB_19_container input.api-input[name='amount']")
    private WebElement amount;

    @FindBy(css = "div#mCSB_19_container input.api-input[name='price']")
    private WebElement price;

    @FindBy(css = "div#mCSB_19_container input.api-input[name='side']")
    private WebElement side;

    @FindBy(css = "div#mCSB_19_container input.api-input[name='type']")
    private WebElement type;

    @FindBy(css = "div#mCSB_19_container input.api-input[name='hidden']")
    private WebElement hidden;

    @FindBy(xpath = "//*[@id='mCSB_19_container']/div[2]/pre[contains(text(),'statusText')]")
    private WebElement result_block;

    @FindBy(css = "pre._mCS_37")
    private WebElement result_text;

    @FindBy(css = "button.btn.elastic.api-submit")
    private List<WebElement> buttonSubmit;

    public void clickMainLinks(){
        api_public.click();
        wait.until(ExpectedConditions.elementToBeClickable(Ticker));
        Ticker.click();
        wait.until(ExpectedConditions.elementToBeClickable(Orders_Book));
        Orders_Book.click();
        wait.until(ExpectedConditions.elementToBeClickable(Trades));
        Trades.click();
        wait.until(ExpectedConditions.elementToBeClickable(Assets));
        Assets.click();
        wait.until(ExpectedConditions.elementToBeClickable(api_private));
        api_private.click();
        wait.until(ExpectedConditions.elementToBeClickable(Funds));
        Funds.click();
        wait.until(ExpectedConditions.elementToBeClickable(Orders_and_Trades));
        Orders_and_Trades.click();
    }

    public boolean checkSearchInTicker(){
        Ticker.click();
        wait.until(ExpectedConditions.elementToBeClickable(Ticker_api_public_ticker));
        Ticker_api_public_ticker.click();
        wait.until(ExpectedConditions.elementToBeClickable(Ticker_api_public_ticker_value));
        Ticker_api_public_ticker_value.click();
        Ticker_api_public_ticker_value.sendKeys("BTC_EUR");
        Ticker_api_public_ticker_value.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(Ticker_api_public_ticker_result));
        String ifSuccess = Ticker_api_public_ticker_result.getText();
        boolean pass = ifSuccess.contains("BTC_EUR");

        //Checking "Filter by pairs comma separated"
        Ticker_api_public_ticker_value.click();
        Ticker_api_public_ticker_value.clear();
        Ticker_api_public_ticker_value.sendKeys("BTC_EUR,BTC_USD");
        Ticker_api_public_ticker_value.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(Ticker_api_public_ticker_result));
        ifSuccess = Ticker_api_public_ticker_result.getText();
        pass = pass && (ifSuccess.contains("BTC_EUR") && ifSuccess.contains("BTC_USD"));
        return pass;
    }

    public boolean checkSearchInOrdersBook(){
        int bids = 5,asks = 5;
        String pair = "BTC_USD";

        Orders_Book.click();
        wait.until(ExpectedConditions.elementToBeClickable(Orders_Book_api_public_orderbook));
        Orders_Book_api_public_orderbook.click();
        wait.until(ExpectedConditions.visibilityOf(Orders_Book_api_public_orderbook_values.get(0)));
        Orders_Book_api_public_orderbook_values.get(0).click();
        Orders_Book_api_public_orderbook_values.get(0).sendKeys(pair);
        Orders_Book_api_public_orderbook_values.get(1).click();
        Orders_Book_api_public_orderbook_values.get(1).sendKeys(""+bids);
        Orders_Book_api_public_orderbook_values.get(2).click();
        Orders_Book_api_public_orderbook_values.get(2).sendKeys(""+asks);
        Orders_Book_api_public_orderbook_values.get(2).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(Orders_Book_api_public_orderbook_result));
        String ifSuccess = Orders_Book_api_public_orderbook_result.getText();
        int count_of_prices = (ifSuccess + "\0").split("price").length - 1;
        boolean pass = ifSuccess.contains("Success") && count_of_prices <= bids+asks;

        //check that default value for bids & asks = 50
        Orders_Book_api_public_orderbook_values.get(1).click();
        Orders_Book_api_public_orderbook_values.get(1).clear();
        Orders_Book_api_public_orderbook_values.get(2).click();
        Orders_Book_api_public_orderbook_values.get(2).clear();
        Orders_Book_api_public_orderbook_values.get(2).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(Orders_Book_api_public_orderbook_result));
        ifSuccess = Orders_Book_api_public_orderbook_result.getText();
        count_of_prices = (ifSuccess + "\0").split("price").length - 1;
        pass = pass && ifSuccess.contains("Success") && count_of_prices <= 100;

        return pass;
    }

    public boolean checkSearchInTrades(){
        Timestamp yesterday = new Timestamp(System.currentTimeMillis()-24*60*60*1000); //yesterday data
        long since = yesterday.getTime()/1000;
        int limit = 1050;
        String pair = "BTC_EUR";

        Trades.click();
        wait.until(ExpectedConditions.elementToBeClickable(Trades_api_public_trades));
        Trades_api_public_trades.click();
        wait.until(ExpectedConditions.visibilityOf(Trades_api_public_trades_values.get(0)));
        Trades_api_public_trades_values.get(0).click();
        Trades_api_public_trades_values.get(0).sendKeys(pair);
        Trades_api_public_trades_values.get(1).click();
        Trades_api_public_trades_values.get(1).sendKeys(""+since);
        Trades_api_public_trades_values.get(2).click();
        Trades_api_public_trades_values.get(2).sendKeys(""+limit);
        Trades_api_public_trades_values.get(2).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(Trades_api_public_trades_result));
        String ifSuccess = Trades_api_public_trades_result.getText();
        int count_of_prices = (ifSuccess + "\0").split("price").length - 1;
        boolean pass = ifSuccess.contains("Success") && count_of_prices <= 1000; // check that count of results <= than "max 1000"

        //check that the timestamp of results > than "since"
        Pattern pat = Pattern.compile("[0-9]{10}");
        Matcher matcher = pat.matcher(ifSuccess);
        while (matcher.find()) {
            pass = pass && Integer.parseInt(matcher.group()) >= since;
        }
        return pass;
    }

    public boolean checkInformationInAssets(String[][] currencies, String[] pairs){
        boolean pass = true;
        String ifSuccess;

        Assets.click();
        wait.until(ExpectedConditions.elementToBeClickable(Assets_api_public_assets_currencies));
        Assets_api_public_assets_currencies.click();
        wait.until(ExpectedConditions.elementToBeClickable(Assets_currencies_Submit));
        Assets_currencies_Submit.click();
        wait.until(ExpectedConditions.visibilityOf(Assets_api_public_assets_currencies_result));
        wait.until(ExpectedConditions.attributeContains(Assets_api_public_assets_currencies_result,"textContent","BTC"));
        ifSuccess = Assets_api_public_assets_currencies_result.getText();

        for(String i:currencies[0]){
            pass = pass && ifSuccess.contains(i);
        }

        Assets_api_public_assets_pairs.click();
        wait.until(ExpectedConditions.elementToBeClickable(Assets_pairs_Submit));
        Assets_pairs_Submit.click();
        wait.until(ExpectedConditions.visibilityOf(Assets_api_public_assets_pairs_result));
        ifSuccess = Assets_api_public_assets_pairs_result.getText();
        for(String i:pairs){
            pass = pass && ifSuccess.contains(i);
        }
        return pass;
    }

    public void inputAPIKeys(String ApiKey,String PrivateKey){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        api_private.click();
        js.executeScript("window.scrollBy(0,1000);");
        wait.until(ExpectedConditions.visibilityOf(api_nonce));
        Api_Key.click();
        Api_Key.sendKeys(ApiKey);
        Private_Key.click();
        Private_Key.sendKeys(PrivateKey);
        Private_Key.sendKeys(Keys.ENTER);
    }

    public boolean checkInformationInFunds(String ApiKey,String PrivateKey, String[][] currencies){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        boolean pass = true;
        String ifSuccess;
        inputAPIKeys(ApiKey,PrivateKey);
        js.executeScript("window.scrollBy(0,1000);");
        Funds.click();

        //POST /api/private/balances
        wait.until(ExpectedConditions.elementToBeClickable(Funds_api_private_balances));
        Funds_api_private_balances.click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonSubmit.get(5)));
        buttonSubmit.get(5).click();
        wait.until(ExpectedConditions.visibilityOf(Funds_api_private_balances_result));
        wait.until(ExpectedConditions.attributeContains(Funds_api_private_balances_result,"textContent","BTC"));
        ifSuccess = Funds_api_private_balances_result.getText();

        for(String i:currencies[0]){
            pass = pass && ifSuccess.contains(i);
        }

        //POST /api/private/deposit/address
        js.executeScript("window.scrollBy(0,1000);");
        Funds_api_private_deposit_address.click();
        /*Funds_api_private_transactions_history.click();
        Funds_api_private_vouchers.click();
        Funds_api_private_vouchers_redeem.click();
        Funds_api_private_withdraw.click();
        Funds_api_private_withdrawal_status.click();*/
        return pass;
    }

    public boolean openNewOrder(String ApiKey,String PrivateKey){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        api_private.click();
        js.executeScript("window.scrollBy(0,1000);");
        wait.until(ExpectedConditions.visibilityOf(api_nonce));
        Api_Key.click();
        Api_Key.sendKeys(ApiKey);
        Private_Key.click();
        Private_Key.sendKeys(PrivateKey);
        Private_Key.sendKeys(Keys.ENTER);

        Orders_and_Trades.click();
        js.executeScript("window.scrollBy(0,500);");

        wait.until(ExpectedConditions.visibilityOf(POST_api_private_order_new));
        POST_api_private_order_new.click();
        js.executeScript("window.scrollBy(0,500);");

        pair.click();
        pair.sendKeys("BTC_EUR");
        amount.click();
        amount.sendKeys("1");
        price.click();
        price.sendKeys("1");
        side.click();
        side.sendKeys("buy");
        type.click();
        type.sendKeys("limit");
        hidden.click();
        hidden.sendKeys("1");
        hidden.sendKeys(Keys.ENTER);
        js.executeScript("window.scrollBy(0,500);");

        wait.until(ExpectedConditions.visibilityOf(result_block));
        String ifSuccess = result_text.getText();

        return ifSuccess.contains("Success");
    }
}
