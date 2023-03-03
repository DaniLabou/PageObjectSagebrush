package com.sagebrush.tests;

import com.sagebrush.pages.ReservationPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sagebrush.pages.ReservationPage.RESERVATIONS_URL;

public class ReservationTest extends BaseTest{
    @Test
    public void bookReservation(){
        driver=new ChromeDriver();
        driver.get(RESERVATIONS_URL);
        ReservationPage reservationPage=new ReservationPage(driver);
        reservationPage.clickReservationButton();
        reservationPage.clickOnBookReservation();
        waitFor(2000);
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        reservationPage.numberOfPeople();
//        //reservationPage.setDateOfReservation();
//        reservationPage.enterFirstNameR();
//        reservationPage.enterLastNameR();
//        reservationPage.enterPhoneNumberR();
//        reservationPage.enterEmailR();
//        reservationPage.clickSelectDelails();
//        reservationPage.cliclSubmitButton();
        Assert.assertTrue(reservationPage.checkIfReservationContainerIsDisplayd());

    }
}
