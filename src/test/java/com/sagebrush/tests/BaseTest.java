package com.sagebrush.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

    protected static void waitFor(int miliseconds)  {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @BeforeMethod
    protected void setUp() {
        System.setProperty("webdriver.chrome.drive","src/main/resources/chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get("https://www.sagebrushbbq.com/");
        //driver.manage().window().maximize();
    }
    @AfterMethod
    protected void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
