package com.sagebrush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{
    protected WebDriver driver;

    public final static String CONTACT_URL=BASE_URL+"contact";
    @FindBy(xpath = "/html/body/header/div[1]/div[1]/nav/ul/li[8]/a") private WebElement contactUsButton;
    @FindBy (id = "104193") private WebElement nameContact;
    @FindBy (id = "104194") private WebElement emailBoxContact;
    @FindBy (id = "104195") private WebElement phoneNumberContact;
    @FindBy (id = "104197") private WebElement yourMessage;
    @FindBy (xpath = "/html/body/div[1]/main/div/form/div[5]/button") private WebElement sendButtonContact;
    @FindBy (xpath = "/html/body/div[1]/main/div/form/div[6]/span") private WebElement confirmationMessage;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void clickContactButton(){
        contactUsButton.click();
    }
    public void enterNameContact(){
        nameContact.sendKeys("Dani Test");
    }
    public void enterEmailContact(){
        emailBoxContact.sendKeys("danyiliutza@yahoo.com");
    }
    public void enterPhoneNumberContact(){
        phoneNumberContact.sendKeys("9704731169");
    }
    public void enterMessageContact(){
        yourMessage.sendKeys("This is a test. Sorry and thank you!");
    }
    public void clickSendButton(){
        sendButtonContact.click();
    }
    public boolean checkIfConfirmationMessageIsDisplayd(){
        return confirmationMessage.isDisplayed();
    }
    public String getMessageText(){
        return confirmationMessage.getText();
    }



}
