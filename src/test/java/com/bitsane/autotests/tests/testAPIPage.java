package com.bitsane.autotests.tests;

import com.bitsane.autotests.TestBase;
import com.bitsane.autotests.models.Customer;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.assertTrue;

public class testAPIPage extends TestBase {
    @Test(dataProvider = "userWithCurrencies", dataProviderClass=DataProviders.class)
    public void click(Customer customer){
        assertTrue("API - links are failed", app.apiMainLinks(customer));
    }

    @Test(dataProvider = "userWithCurrencies", dataProviderClass=DataProviders.class)
    public void newOrder(Customer customer) {
        assertTrue("API is failed", app.apiNewOrder(customer));
    }

    @Test(dataProvider = "userWithCurrencies", dataProviderClass=DataProviders.class)
    public void full(Customer customer){
        assertTrue("API - tests are failed", app.apiFull(customer));
    }
}