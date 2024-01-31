package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.ReusableMethods.bekle;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    String bestProductName = "", bestProductPoint = "", bestProductNumber = "", bestProductPrice = "";

    @FindBy ( id = "twotabsearchtextbox" )
    public WebElement searchBox;

    @FindBy ( id = "searchDropdownBox")
    public WebElement catList;

    @FindBy ( css = "[data-component-type='s-search-result']")
    public List<WebElement> allProduct;

    public void chooseCategory(String category){
        Select select = new Select(catList);
        select.selectByVisibleText(category);
    }
    public void wantedProductPrint(String product){

        searchBox.sendKeys(product + Keys.ENTER);
    }

    public void optimizeProductCalculate() {
        int highest = 0;

        for (WebElement product : allProduct) {

            WebElement name = product.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
            WebElement price = product.findElement(By.xpath("//span[@class='a-price-whole']")); // "24"
            WebElement point = product.findElement(By.cssSelector("[aria-label~='stars']"));
            WebElement number = product.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));


            // 4.4 out of 5 stars
            String findPoint[] = point.getAttribute("aria-label").split(" out");
            int basePoint = (int) Float.parseFloat(findPoint[0]); // 4
            int numberOfReviews = Integer.parseInt(number.getText().replace(",", ""));
            int basePrice = Integer.parseInt(price.getText()); // 24

            int result = (basePoint * numberOfReviews) - (basePrice * 100);


            if (result > highest) {
                bestProductName = name.getText();
                bestProductPoint = "" + basePoint;
                bestProductNumber = "" + numberOfReviews;
                bestProductPrice = price.getText();
            }


        }
    }

    public void optimizeProductPrintConsole(){

        System.out.println("İsim : "+bestProductName);
        System.out.println("Puan : "+bestProductPoint);
        System.out.println("Fiyat : "+bestProductPrice);
        System.out.println("Sayı : "+bestProductNumber);
    }

}