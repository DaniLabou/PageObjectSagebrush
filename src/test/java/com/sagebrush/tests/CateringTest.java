package com.sagebrush.tests;

import com.sagebrush.pages.CateringPage;
import com.sagebrush.pages.ConfirmationCateringPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.sagebrush.pages.CateringPage.CATERING_URL;

public class CateringTest extends BaseTest{
    @Parameters({"emailB","FName","LName"})
    @Test
    public void orderCatering(String emailB,String FName,String LName){
        driver= new ChromeDriver();
        driver.get(CATERING_URL);
        CateringPage cateringPage=new CateringPage(driver);
        cateringPage.inquireButton();
        cateringPage.enterEmail(emailB);
        cateringPage.enterFirstAndLastName(FName,LName);
        cateringPage.enterPhoneNumber();
        cateringPage.enterCompanyName();
        cateringPage.enterAdress();
        cateringPage.enterCity();
        cateringPage.enterState();
        cateringPage.enterZipCode();
        cateringPage.enterEventDate();
        cateringPage.enterStartTime();
        cateringPage.enterEndTime();
        cateringPage.enterTipeOfEvent();
        cateringPage.enterNumberOfPeople();
        cateringPage.enterAditionalInformation();
        cateringPage.clickSubmit();
        waitFor(2000);
        ConfirmationCateringPage confirmationCateringPage=new ConfirmationCateringPage(driver);
        waitFor(2000);
        Assert.assertTrue(confirmationCateringPage.checkIfCloseButtonIsDisplayd());
        //Assert.assertTrue(confirmationCateringPage.getMessageText().contains("Contact Us About Your Catering Inquir"));


    }
}
