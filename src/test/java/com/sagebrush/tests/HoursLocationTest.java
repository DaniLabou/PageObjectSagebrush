package com.sagebrush.tests;

import com.sagebrush.pages.HoursLocationPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sagebrush.pages.HoursLocationPage.LOCATION_URL;

public class HoursLocationTest extends BaseTest{
    @Test(testName = "Location Adress")
    public void locationOfRestaurant() {
        driver = new ChromeDriver();
        driver.get(LOCATION_URL);
        HoursLocationPage hoursLocationPage = new HoursLocationPage(driver);
        hoursLocationPage.clickOnAdressAndLocationButton();
        waitFor(2000);
        Assert.assertTrue(hoursLocationPage.checkIfAdressIsDisplayd());
        Assert.assertTrue(hoursLocationPage.adressOfRestaurant().contains("1101 Grand Ave"));
//        hoursLocationPage.clickOnGetDirections();
//        hoursLocationPage.clickRespingeButton();
//        String landingurl="https://www.google.com/maps/place/1101+Grand+Ave,+Grand+Lake,+CO+80447,+Statele+Unite+ale+Americii/@40.2514909,-105.8177009,17z/data=!3m1!4b1!4m6!3m5!1s0x87698199fb53cd5b:0xc31a5d92689783be!8m2!3d40.2514909!4d-105.8177009!16s%2Fg%2F11c3q4zpct";
//        Assert.assertEquals(landingurl,"https://www.google.com/maps/place/1101+Grand+Ave,+Grand+Lake,+CO+80447,+Statele+Unite+ale+Americii/@40.2514909,-105.8177009,17z/data=!3m1!4b1!4m6!3m5!1s0x87698199fb53cd5b:0xc31a5d92689783be!8m2!3d40.2514909!4d-105.8177009!16s%2Fg%2F11c3q4zpct");

    }

    @Test(testName = "Work Hours")
    public void hoursOfWork() {
        driver = new ChromeDriver();
        driver.get(LOCATION_URL);
        HoursLocationPage hoursLocationPage = new HoursLocationPage(driver);
        hoursLocationPage.clickOnAdressAndLocationButton();
        waitFor(2000);
        Assert.assertTrue(hoursLocationPage.checkIfHoursOfWorkAreDisplayd());
        Assert.assertTrue(hoursLocationPage.hoursOfWork().contains("7:00 AM to 9:00 PM"));
    }

}


