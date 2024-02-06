package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import logger.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.GooglePage;
import utilities.Base;
import utilities.ConfigReader;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;


public class GoogleStepDef {

    GooglePage googlePage = new GooglePage();
    WebDriver driver;
    Base base = new Base();

    Logger log = Log.getLogger(GoogleStepDef.class);


    @Then("Searches {string} on Google")
    public void google_da_icin_arama_yapar(String searchWord) {

        log.info("Searches words on Google searchbox");
        googlePage.searchesGoogle(searchWord);


    }
    @Then("Google tests whether search results contain {string}")
    public void google_arama_sonuclarinin_icerdigini_test_eder(String searchWord) {

        log.info("Google tests whether search results contain words");
        googlePage.verifySearchWords(searchWord);


    }

    @Given("User goes to {string}")
    public void kullaniciAnasayfayaGider(String url) {

       log.info("User goes to Url");
        driver = base.setDriver(driver,"chrome");
        Driver.getDriver().get(ConfigReader.getProperty(url));


    }

    @And("Close the browser")
    public void sayfayiKapatir() {

       log.info("Close the browser");
        Base.quitDriver();
    }


}
