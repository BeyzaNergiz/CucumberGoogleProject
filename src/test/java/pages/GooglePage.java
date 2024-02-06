package pages;

import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import static utilities.ReusableMethods.*;

public class GooglePage {

    public GooglePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@role='combobox']")
    public WebElement googleSearchBox;

    public void searchesGoogle(String searchWord){


        highlightElement(Driver.getDriver(), googleSearchBox);
        googleSearchBox.click();
        googleSearchBox.sendKeys(searchWord+ Keys.ENTER);
    }

    public void verifySearchWords(String searchWord) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(searchWord));
    }
}
