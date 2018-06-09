package com.bitsane.autotests.tests;

import com.bitsane.autotests.models.Customer;
import org.testng.annotations.DataProvider;


public class DataProviders {

    private static String[] pairs = {"ICN_BCH","XRP_BCH","DASH_BCH","BCH_BTC","BCH_EUR","BCH_USD","ETH_BCH","LTC_BCH","BTC_USD",
            "BTC_EUR","LTC_BTC","ETH_BTC","ICN_BTC","DASH_BTC","XRP_BTC","BTG_BTC","BTG_EUR","ICN_DASH","DASH_ETH","DASH_EUR",
            "LTC_DASH","DASH_USD","XRP_DASH","ETH_USD","ETH_EUR","ICN_ETH","LTC_ETH","XRP_ETH","LTC_EUR","ICN_EUR","XRP_EUR",
            "ICN_LTC","ICN_USD","ICN_XRP","LTC_USD","XRP_LTC","XRP_USD"};
    private static String[][] currencies = {{"ETH","LTC","BTC","USD","EUR","DASH","ICN","XRP","BCH","EOS","ETC","VRC","SMS","SANE"},{"Ethereum","Litecoin","Bitcoin","US Dollar","Euro","Dash","Iconomi","Ripple","Bitcoin Cash","EOS","Ethereum Classic","Vericoin","SMS Coin","Sane token"}};

    @DataProvider
    public static Object[][] userWithCurrencies() {

        return new Object[][]{
                {Customer.newEntity()
                        .withEmail("test.polaz1@gmail.com").withPassword("tEsT123456")
                        .withApiKey("26F11837B3AB351C6A127EC41E3E8B194C33BE1EB4B12CAF209D4A49A58435BE")
                        .withPrivateKey("2462B19184393AAF1C98182D2996159E0AC28FFB932CFEA32108A7EC341297FD")
                        .withCurrencies(currencies)
                        .withPairs(pairs).build()
                }

        };
    }
}


