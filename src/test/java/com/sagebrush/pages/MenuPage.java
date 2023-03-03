package com.sagebrush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{
    protected WebDriver driver;
    public final static  String MENUS_URL= BASE_URL +"menus";
    @FindBy (xpath = "/html/body/header/div[1]/div[1]/nav/ul/li[4]/a")
    private WebElement menusButton;
    @FindBy (id = "tab-desserts")
    private WebElement desertsButton;
    @FindBy(xpath = "//*[@id=\"yext-widget-300467\"]/div/div/div/ul[2]/li[1]/div/div/span[1]")
    private WebElement peachCobbler;

    public MenuPage(WebDriver driver) {
        super(driver);
    }
    public void clickMenusButton(){
        menusButton.click();
    }
    public void clickDesertsButton(){
        desertsButton.click();
    }
    public boolean checkIfPeachDesertIsDisplayd(){
        return peachCobbler.isDisplayed();
    }
    public String getDesertTitle(){
        return peachCobbler.getText();
    }
}
