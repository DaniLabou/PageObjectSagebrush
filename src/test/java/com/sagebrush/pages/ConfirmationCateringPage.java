package com.sagebrush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationCateringPage extends BasePage{
    @FindBy (xpath = "//*[@id=\"popup-catering-form\"]/form/div[3]/h2")
    private WebElement confirmationAlert;
    @FindBy (css = "#popup-catering-form > form > div.form-success-msg > button")
    private WebElement closeButton;

    public ConfirmationCateringPage(WebDriver driver) {
        super(driver);
    }
//    public boolean checkIfConfirmationAlertIsDisplayd(){
//        return confirmationAlert.isDisplayed();
//    }

    public boolean checkIfCloseButtonIsDisplayd(){
    return closeButton.isDisplayed();
    }
    public String getMessageText(){
        return confirmationAlert.getText();
    }

}
