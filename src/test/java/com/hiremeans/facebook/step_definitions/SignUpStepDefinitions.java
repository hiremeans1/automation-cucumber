package com.hiremeans.facebook.step_definitions;

import com.hiremeans.utils.OsUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpStepDefinitions {



    {
        OsUtils osUtils = new OsUtils();

        if (osUtils.isMacOs()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver-mac");
        } else if (osUtils.isWindowsOS()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver-windows.exe");
        }
    }

    WebDriver driver = new ChromeDriver();


    public SignUpStepDefinitions() {

    }

    @Given("fill up all the required fields to create an account")
    public void fillUpAllTheRequiredFieldsToCreateAnAccount() {


        driver.get("https://www.facebook.com/"); // Facebook site
        //firstName
        driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Hire");
        //lastName
        driver.findElement(By.cssSelector("#u_0_o")).sendKeys("Means");
        //email
        driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("somename@hiremeans.com");
        //re-enter email
        driver.findElement((By.cssSelector("#u_0_u"))).sendKeys("somename@hiremeans.com");
        //password
        driver.findElement(By.cssSelector("#u_0_w")).sendKeys("Welcome12");
        //month
        WebElement monthElement = driver.findElement(By.cssSelector("#month"));
        Select monthSelector = new Select(monthElement);
        monthSelector.selectByValue("8");

        WebElement dayElement = driver.findElement(By.cssSelector("#day"));
        Select daySelector = new Select(dayElement);
        daySelector.selectByValue("10");

        WebElement yearElement = driver.findElement(By.cssSelector("#year"));
        Select yearSelector = new Select(yearElement);
        yearSelector.selectByValue("1985");

        //selecting the gender radio
        driver.findElement(By.cssSelector("#u_0_z > span:nth-child(2) > label")).click();


    }

    @When("click on the sign up button")
    public void clickOnTheSignUpButton() {

        // Write code here that turns the phrase above into concrete actions
        //sign up
        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
        //WebElement firstResult = wait.until(presenceOfElementLocated(By.id("yui_3_10_0_1_1588433605258_242")));
        // System.out.println(firstResult);
        // driver.findElement(By.xpath("//*[@id=\"yui_3_10_0_1_1588433605258_240\"]/li[6]/div/div[1]/h3/a")).click();

    }

    @Then("should goto facebook account")
    public void shouldGotoFacebookAccount() {
        // Write code here that turns the phrase above into concrete actions
        //sign up
        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
        //WebElement firstResult = wait.until(presenceOfElementLocated(By.id("yui_3_10_0_1_1588433605258_242")));
        // System.out.println(firstResult);
        // driver.findElement(By.xpath("//*[@id=\"yui_3_10_0_1_1588433605258_240\"]/li[6]/div/div[1]/h3/a")).click();

    }

}
