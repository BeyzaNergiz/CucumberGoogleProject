package stepdefinitions;


import io.cucumber.java.en.Given;
import pages.ApplePage;


public class AppleStepDef {



    ApplePage applePage = new ApplePage();
   // public static Logger logger = LogManager.getLogger(GoogleStepDef.class);

    @Given("Click on Apple")
    public void click_on_apple() {

        applePage.clickOnAppleSite();
    }
    @Given("It is tested that the titles of the Apple homepage are displayed")
    public void ıt_is_tested_that_the_titles_of_the_apple_homepage_are_displayed() {

        //logger.info("Headers elements prints with Lambda");
        applePage.headerDisplayTest();
    }

    @Given("Macbook Air buy and verify that Macbook Air buy")
    public void macbook_air_buy_and_verify_that_macbook_air_buy() {
        applePage.macAirBuy();
    }
}
