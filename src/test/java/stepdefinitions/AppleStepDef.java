package stepdefinitions;


import io.cucumber.java.en.Given;
import logger.Log;
import org.apache.log4j.Logger;
import pages.ApplePage;


public class AppleStepDef {


    Logger log = Log.getLogger(AppleStepDef.class);
    ApplePage applePage = new ApplePage();


    @Given("Click on Apple")
    public void click_on_apple() {

        log.info("Click on Apple");
        applePage.clickOnAppleSite();
    }
    @Given("It is tested that the titles of the Apple homepage are displayed")
    public void ıt_is_tested_that_the_titles_of_the_apple_homepage_are_displayed() {

        log.info("Headers elements prints with Lambda");
        applePage.headerDisplayTest();
    }

    @Given("Macbook Air buy and verify that Macbook Air buy")
    public void macbook_air_buy_and_verify_that_macbook_air_buy() {

        log.info("Buy a macbook air and verify that add to cart");
        applePage.macAirBuy();
    }
}
