package pages;

import io.cucumber.java.Before;
import logger.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.highlightElement;

public class ApplePage {

    public ApplePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy (xpath = "//*[@id='globalnav-list']")
    List<WebElement> headerElements;

    public void headerDisplayTest(){

        List<WebElement> headers = headerElements;
        System.out.println("Baslıkları Lambda ile Akışta Yazdırma : ");
        headers.stream().map(WebElement::getText).sorted().distinct().forEach(t -> System.out.print(t + " "));
        bekle(3);

    }

    @FindBy (xpath = "(//*[@class='LC20lb MBeuO DKV0Md'])[1]")
    WebElement appleWebSite;

    public void clickOnAppleSite(){

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", appleWebSite);
        bekle(1);
        highlightElement(Driver.getDriver(), appleWebSite);
        jse.executeScript("arguments[0].click();", appleWebSite);
        bekle(1);
    }

    @FindBy (xpath = "(//*[@class='globalnav-link-text-container'])[2]")
    WebElement macElement;

    @FindBy (xpath = "(//*[@class='chapternav-label'])[1]")
    WebElement macbookAir;

    @FindBy (xpath = "(//a[@class='button'])[1]")
    WebElement buyButton;

    @FindBy (xpath = "(//*[@class='button button-block'])[4]")
    WebElement chooseButton;

    @FindBy (xpath = "//*[@class='button button-block']")
    WebElement addToCart;

    @FindBy (xpath = "//*[@value='proceed']")
    WebElement proceedButton;

    @FindBy (xpath = "//h1[@class='rs-bag-header']")
    WebElement resultText;


    public void macAirBuy(){

        highlightElement(Driver.getDriver(), macElement);
        macElement.click();
        bekle(1);
        highlightElement(Driver.getDriver(), macbookAir);
        macbookAir.click();
        bekle(1);
        highlightElement(Driver.getDriver(), buyButton);
        buyButton.click();
        bekle(1);
        highlightElement(Driver.getDriver(), chooseButton);
        chooseButton.click();
        bekle(1);
        highlightElement(Driver.getDriver(), addToCart);
        addToCart.click();
        bekle(1);
        highlightElement(Driver.getDriver(), proceedButton);
        proceedButton.click();
        bekle(1);
        highlightElement(Driver.getDriver(), resultText);
        System.out.println(resultText.getText());
        bekle(1);
        Assert.assertTrue(resultText.isDisplayed());

    }
}
