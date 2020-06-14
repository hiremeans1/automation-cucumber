package com.hiremeans.stepdefinition;

import com.hiremeans.utils.OsUtils;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class EpaSteps {

    {
        OsUtils osUtils = new OsUtils();

        if (osUtils.isMacOs()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver-mac-83");
        } else if (osUtils.isWindowsOS()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver-windows-83.exe");
        }
    }

    CommonSteps commonSteps = new CommonSteps();
    WebDriver driver = commonSteps.getDriver();
    @FindBy(how = How.XPATH, using = "//input[@id='search-box']")
    private WebElement searchBar;
    @FindBy(how = How.XPATH, using = "//button[@class='epa-search-button']")
    private WebElement searchButton;



    public EpaSteps() {
        // no args const
    }

    @Given("^I am on EPA site as user$")
    public void iAmOnEPASiteAsUser() {
        driver.get("https://www.epa.gov/statelocalenergy/state-inventory-and-projection-tool/");
    }

    @Then("^\"([^\"]*)\" is displayed$")
    public void isDisplayed(String arg0) throws Throwable {
        assertTrue(driver.findElement(By.tagName("body")).getText().contains(arg0));
    }

    @And("^I click on a \"([^\"]*)\"$")
    public void iClickOnA(String arg0) throws Throwable {
        commonSteps.iClickOnA(arg0);
    }

    @And("^I shall see text with \"([^\"]*)\"$")
    public void iShallSeeTextWith(String arg0) throws Throwable {
       assertTrue(driver.findElement(By.tagName("body")).getText().contains(arg0));


       //System.out.println(">>>>> tag name is :"+driver.findElement(By.xpath("//input[@id='search-box']")));
       //assertEquals("input",driver.findElement(By.xpath("//input[@id='search-box']")));

    }

    @After
    public void quitDriver() {
        commonSteps.quitDriver();
    }

    @Then("^\"([^\"]*)\" is entered in search bar$")
    public void isEnteredInSearchBar(String arg0) throws Throwable {
        //commonSteps.webDriverWait.until(ExpectedConditions.visibilityOf(searchBar)).sendKeys("United States Environment Protection measures");
        driver.findElement(By.xpath("//input[@id='search-box']")).sendKeys(arg0);
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {

        //commonSteps.webDriverWait.until(ExpectedConditions.visibilityOf(searchButton)).click();
        driver.findElement(By.xpath("//button[@class='epa-search-button']")).click();
    }
}
