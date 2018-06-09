package com.bitsane.autotests.applications;

import com.bitsane.autotests.models.Customer;
import com.bitsane.autotests.pages.Gmail;
import com.bitsane.autotests.pages.LogIn;
import com.bitsane.autotests.pages.Registration;
import com.bitsane.autotests.pages.API;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;*/

public class User {
    private WebDriver driver;

    private Registration registration;
    private Gmail gmail;
    private LogIn login;
    private API APIPage;

    public User() {
        /*DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WINDOWS);//LINUX);
        try {
            String hub = "http://172.21.128.1:4444/wd/hub";//local work
            URL url = new URL(hub);
            this.driver = new RemoteWebDriver(url, capability);
            } catch (MalformedURLException e) {
            e.printStackTrace();
        }*/

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        registration = new Registration(driver);
        gmail = new Gmail(driver);
        login = new LogIn(driver);
        APIPage = new API(driver);
    }

    public void quit() {
        driver.quit();
    }

    public boolean apiMainLinks(Customer customer) {
        login.open();
        login.logIn(customer.getEmail(), customer.getPassword());
        login.logInPassed();
        APIPage.open();
        APIPage.clickMainLinks();
        login.logout();
        return true;
    }

    public boolean apiFull(Customer customer) {
        login.open();
        login.logIn(customer.getEmail(), customer.getPassword());
        login.logInPassed();
        APIPage.open();
        boolean pass = true;
        pass = pass && APIPage.checkSearchInTicker();
        pass = pass && APIPage.checkSearchInOrdersBook();
        pass = pass && APIPage.checkSearchInTrades();
        pass = pass && APIPage.checkInformationInAssets(customer.getCurrencies(), customer.getPairs());
        pass = pass && APIPage.checkInformationInFunds(customer.getApiKey(),customer.getPrivateKey(), customer.getCurrencies());
        login.logout();
        return pass;
    }

    public boolean apiNewOrder(Customer customer) {
        login.open();
        login.logIn(customer.getEmail(), customer.getPassword());
        login.logInPassed();
        APIPage.open();
        boolean pass = APIPage.openNewOrder(customer.getApiKey(),customer.getPrivateKey());
        login.logout();
        return pass;
    }

}
