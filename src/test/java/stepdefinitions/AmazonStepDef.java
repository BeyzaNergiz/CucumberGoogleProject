package stepdefinitions;

import io.cucumber.java.en.Given;
import logger.Log;
import org.apache.log4j.Logger;
import pages.AmazonPage;

public class AmazonStepDef {

    AmazonPage amazonPage = new AmazonPage();
    Logger log = Log.getLogger(AmazonStepDef.class);

    @Given("User selects {string} as the category")
    public void user_selects_as_the_category(String category) {

        log.info("Select the wanted category");
        amazonPage.chooseCategory(category);
    }
    @Given("User types {string} in the search box")
    public void user_types_in_the_search_box(String product) {

        log.info("Print that wanted product in search text box");
        amazonPage.wantedProductPrint(product);

    }
    @Given("User performs calculations to find the best product")
    public void user_performs_calculations_to_find_the_best_product() {
        log.info("Performs calculations to find the best product");
        amazonPage.optimizeProductCalculate();
    }

    @Given("The user writes the best product to the console")
    public void the_user_writes_the_best_product_to_the_console() {

        log.info("Print that the best product to the console");
        amazonPage.optimizeProductPrintConsole();
    }

}
