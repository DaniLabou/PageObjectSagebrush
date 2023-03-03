package com.sagebrush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage extends BasePage{
    protected WebDriver driver;
    public final static String RESERVATIONS_URL=BASE_URL+"reservations";
    @FindBy(xpath = "/html/body/header/div[1]/div[1]/nav/ul/li[1]/a")
    private WebElement reservationsButton;
    @FindBy(xpath = "/html/body/div[1]/main/div/center/div/div/button")
    private WebElement bookReservation;
    @FindBy(id = "sn-modal-container") private WebElement reservationContainer;
//    @FindBy(id = "sn-reservationSelectorPartySize")
//    private WebElement partySizeBox;
//    Select select=new Select(partySizeBox);
//
////    @FindBy(xpath = "//*[@id=\"sn-reservationContainer\"]/div[1]/div[2]/div/input[2]")
////    private WebElement dateOfReservation;
//    @FindBy(xpath = "//*[@id=\"sn-reservationSelectorTimes\"]/table/tbody/tr[3]/td[3]/button")
//    private WebElement hourOfReservation;
//    @FindBy(id = "sn-formFirstName")
//    private WebElement firstNameR;
//    @FindBy(id = "sn-formLastName")
//    private WebElement lastNameR;
//    @FindBy(id = "sn-formPhoneNumber")
//    private WebElement phoneNumberR;
//    @FindBy(id = "sn-formEmail")
//    private WebElement emailR;
//    @FindBy(xpath = "//*[@id=\"sn-partyFlags\"]/div[7]/label/span/span")
//    private WebElement selectDetails;
//    @FindBy(id = "sn-submitFormButton")
//    private WebElement submitButtonR;



    public ReservationPage(WebDriver driver) {
        super(driver);
    }
    public void clickReservationButton(){
        reservationsButton.click();
    }
    public void clickOnBookReservation(){
        bookReservation.click();
    }
//    public void  numberOfPeople(){
//        select .selectByVisibleText("4");
//    }
////    public void setDateOfReservation(){
////        dateOfReservation.click();
////    }
//    public void chooseReservationHour(){
//        hourOfReservation.click();
//    }
//    public void enterFirstNameR(){
//        firstNameR.sendKeys("DaniTest");
//    }
//    public void enterLastNameR(){
//        lastNameR.sendKeys("LabouTest");
//    }
//    public void enterPhoneNumberR(){
//        phoneNumberR.sendKeys("9704731169");
//    }
//    public void enterEmailR(){
//        emailR.sendKeys("danylabou116@gmail.com");
//    }
//    public void clickSelectDelails(){
//        selectDetails.click();
//    }
//    public void cliclSubmitButton(){
//        submitButtonR.click();
//    }
    public boolean checkIfReservationContainerIsDisplayd(){
        return reservationContainer.isDisplayed();
    }
}
