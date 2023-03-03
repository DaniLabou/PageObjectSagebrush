package com.sagebrush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CateringPage extends BasePage{
    protected WebDriver driver;
    public final static  String CATERING_URL= BASE_URL +"catering";
//    @FindBy (xpath = "/html/body/header/div[1]/div[1]/nav/ul/li[5]/a")
//    private WebElement cateringButton;
    @FindBy (xpath = "//*[@id=\"intro\"]/button") private WebElement inquireNowButton;
    @FindBy (id = "104218") private WebElement emailBox;
    @FindBy (id = "104219") private WebElement firstNameInput;
    @FindBy (id = "104220") private WebElement lastNameInput;
    @FindBy (id = "104221") private WebElement phoneNumber;
    @FindBy (id = "104222") private WebElement companyName;
    @FindBy (id = "502475") private WebElement adress;
    @FindBy (id = "502477") private WebElement city;
    @FindBy (id = "502478") private WebElement state;
    @FindBy (id = "502479") private WebElement zipCode;
    @FindBy (id = "104223") private WebElement eventDate;
    @FindBy (id = "104224") private WebElement startTime;
    Select select=new Select(startTime);
    @FindBy (id = "502480") private WebElement endTime;
    Select select1=new Select(endTime);
    @FindBy (id = "104225") private WebElement tipeOfEvent;
    Select select2=new Select(tipeOfEvent);
    @FindBy (id = "104226") private WebElement numberOfPeople;
    @FindBy (id = "104227") private WebElement aditionalInformation;
    @FindBy (xpath = "//*[@id=\"popup-catering-form\"]/form/div[5]/button")
    private WebElement submitButton;

    public CateringPage(WebDriver driver) {
        super(driver);
    }
    public void inquireButton(){
        inquireNowButton.click();
    }
    public void enterEmail(String email){
        emailBox.sendKeys(email);
    }
    public void enterFirstAndLastName(String firstName, String lastName){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
    }
    public void enterPhoneNumber(){
        phoneNumber.click();
        phoneNumber.sendKeys("9704731169");
    }
    public void enterCompanyName(){
        companyName.sendKeys("Sagebrush Tests");
    }
    public void enterAdress(){
        adress.sendKeys("1101 Grand Ave");
    }
    public void enterCity(){
        city.sendKeys("Grand Lake");
    }
    public void enterState(){
        state.sendKeys("Colorado");
    }
    public void enterZipCode(){
        zipCode.sendKeys("80447");
    }
    public void enterEventDate(){
        eventDate.sendKeys("03/30/2023");
    }
    public void enterStartTime(){
        select.selectByVisibleText("7:00 PM");
    }
    public void enterEndTime(){
        select1.selectByVisibleText("9:00 PM");
    }
    public void enterTipeOfEvent(){
        select2.selectByValue("Graduation");
    }
    public void enterNumberOfPeople(){
        numberOfPeople.sendKeys("20");
    }
    public void enterAditionalInformation(){
        aditionalInformation.sendKeys("This is a test. Sorry and thank you!");
    }
    public void clickSubmit(){
        submitButton.click();
    }
}
