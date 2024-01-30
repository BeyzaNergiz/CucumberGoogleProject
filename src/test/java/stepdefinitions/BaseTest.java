package stepdefinitions;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import utilities.ConfigReader;
import utilities.Driver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {



    @BeforeAll
    public void setUp(String url){

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @AfterAll
    public void tearDown(){

        Driver.quitDriver();
    }

}