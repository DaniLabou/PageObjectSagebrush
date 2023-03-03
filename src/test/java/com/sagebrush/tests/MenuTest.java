package com.sagebrush.tests;

import com.sagebrush.pages.MenuPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sagebrush.pages.MenuPage.MENUS_URL;

public class MenuTest extends BaseTest{
    @Test
    public void desertsTest() {
        driver = new ChromeDriver();
        driver.get(MENUS_URL);
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickMenusButton();
        menuPage.clickDesertsButton();
        waitFor(2000);
        Assert.assertTrue(menuPage.checkIfPeachDesertIsDisplayd());
        Assert.assertTrue(menuPage.getDesertTitle().contains("Peach Cobbler"));
    }
}
