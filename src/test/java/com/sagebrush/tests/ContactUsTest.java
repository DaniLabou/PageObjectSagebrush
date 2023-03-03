package com.sagebrush.tests;

import com.sagebrush.pages.CateringPage;
import com.sagebrush.pages.ContactUsPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sagebrush.pages.ContactUsPage.CONTACT_URL;

public class ContactUsTest extends BaseTest{
    @Test
    public void contactUs() {
        driver = new ChromeDriver();
        driver.get(CONTACT_URL);
        ContactUsPage contactUsPage=new ContactUsPage(driver);
        contactUsPage.clickContactButton();
        contactUsPage.enterNameContact();
        contactUsPage.enterEmailContact();
        contactUsPage.enterPhoneNumberContact();
        contactUsPage.enterMessageContact();
        contactUsPage.clickSendButton();
        waitFor(2000);
        Assert.assertTrue(contactUsPage.checkIfConfirmationMessageIsDisplayd());
        Assert.assertTrue(contactUsPage.getMessageText().contains("Thank you for your inquiry. We’ll be in touch shortly."));

    }
}
