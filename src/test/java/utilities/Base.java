package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static utilities.Driver.driver;

public class Base {

    DesiredCapabilities cap = new DesiredCapabilities();

    static String hubURL = "http://192.168.1.36:4444/";

    public WebDriver setDriver(WebDriver driver, String browser) {

        if (browser == "chrome") {

            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.ANY);

            ChromeOptions optionsChrome = new ChromeOptions();
            optionsChrome.merge(cap);
        }

        if (browser == "firefox") {

            cap.setBrowserName("firefox");
            cap.setPlatform(Platform.ANY);

            EdgeOptions optionsEdge = new EdgeOptions();
            optionsEdge.merge(cap);

        }

        try {
            driver = new RemoteWebDriver(new URL(hubURL), cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }


}