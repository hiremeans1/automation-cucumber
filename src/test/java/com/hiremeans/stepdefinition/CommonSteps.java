package com.hiremeans.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSteps {


    public WebDriver driver = new ChromeDriver();
    public WebDriverWait webDriverWait = new WebDriverWait(this.driver, 10);

    public WebDriver getDriver() {
        return this.driver;
    }


    public void iClickOnA(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'" + arg0 + "')]")))).click();
    }

    public void quitDriver() {
        this.driver.quit();
    }


}
