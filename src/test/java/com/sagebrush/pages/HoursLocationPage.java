package com.sagebrush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoursLocationPage extends BasePage{
    protected WebDriver driver;
    public final static  String LOCATION_URL= BASE_URL;
    @FindBy(xpath = "/html/body/header/div[1]/div[1]/nav/ul/li[2]/a")
    private WebElement button;
    @FindBy(xpath = "//*[@id=\"intro\"]/p[1]/a[1]")
    private WebElement adressLocation;
//    @FindBy(xpath = "/html/body/div[1]/main/section[3]/a")
//    private WebElement getDirectionButton;
    @FindBy(xpath = "//*[@id=\"intro\"]/p[4]")
    private WebElement hours;
//    @FindBy(linkText = "https://www.google.com/maps/place/1101+Grand+Ave,+Grand+Lake,+CO+80447,+Statele+Unite+ale+Americii/@40.2514909,-105.8177009,17z/data=!3m1!4b1!4m6!3m5!1s0x87698199fb53cd5b:0xc31a5d92689783be!8m2!3d40.2514909!4d-105.8177009!16s%2Fg%2F11c3q4zpct")
//    private WebElement landingurl;
//    @FindBy(css = "#yDmH0d > c-wiz > div > div > div > div.NIoIEf > div.G4njw > div.AIC7ge > div.CxJub > div.VtwTSb > form:nth-child(2) > div > div > button > div.VfPpkd-RLmnJb")
//    private WebElement respingeButton;

    public HoursLocationPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnAdressAndLocationButton(){
        button.click();
    }
    public boolean checkIfAdressIsDisplayd(){
        return adressLocation.isDisplayed();
    }
    public String adressOfRestaurant(){
        return adressLocation.getText();
    }
//    public void clickOnGetDirections(){
//        getDirectionButton.click();
//    }
    public boolean checkIfHoursOfWorkAreDisplayd(){
        return hours.isDisplayed();
    }
    public String hoursOfWork(){
        return hours.getText();
    }
//    public void clickRespingeButton(){
//        respingeButton.click();
//    }
//    public boolean checkIfMapsUrlISDisplayd (){
//        return landingurl.isDisplayed();
//    }
//    String landingurl "https://www.google.com/maps/place/1101+Grand+Ave,+Grand+Lake,+CO+80447,+Statele+Unite+ale+Americii/@40.2514909,-105.8177009,17z/data=!3m1!4b1!4m6!3m5!1s0x87698199fb53cd5b:0xc31a5d92689783be!8m2!3d40.2514909!4d-105.8177009!16s%2Fg%2F11c3q4zpct";
}
