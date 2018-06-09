package com.bitsane.autotests.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static java.lang.Math.random;

public class Page {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String production = "https://bitsane.com";
    protected String stage = "https://test";
    protected String site = production;

    double uniqueIndexDoub = random();
    int uniqueIndex = (int)(uniqueIndexDoub*100000);

    public Page(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void takeScreenshot (){

        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("test-output\\screenshot"+uniqueIndex+".png").getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
