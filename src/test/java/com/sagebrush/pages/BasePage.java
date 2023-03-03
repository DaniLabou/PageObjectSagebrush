package com.sagebrush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    final static String BASE_URL = "https://www.sagebrushbbq.com/";


    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
