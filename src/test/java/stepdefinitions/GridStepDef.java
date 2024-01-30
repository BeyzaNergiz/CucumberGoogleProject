package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDef {
    WebDriver driver;

    Base base =new Base();

    @Before
    public void grid(){

        driver = base.setDriver(driver,"chrome");
    }


    @Given("User goes to url with Grid")
    public void user_goes_to_with_grid() throws MalformedURLException {


        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }
    @Given("Verify that expected title and url")
    public void verify_that_expected_title_and_url() {
        String expTitle = "Google";
        String actualTitle = driver.getTitle();
        String expUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expTitle,actualTitle);
        Assert.assertEquals(expUrl,actualUrl);

    }
}
