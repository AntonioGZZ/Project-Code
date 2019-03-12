package com.morioh.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.accenture.test.ui.Checkpoints;
import com.accenture.test.ui.WaitActions;
import com.clientname.app.pages.ResultsPage;
import com.morioh.pages.TravelPage;

import cucumber.api.java.en.Then;

public class TravelSteps {

	
	@Then("Check the tabs displayed in Travel page" )	
    public static void checkTabsInResult() {
		TravelPage TravelPage = new TravelPage();
		SoftAssert softAssert = new SoftAssert();	
		System.out.println("Start: Check Results Record: ");	
        softAssert.assertTrue(Checkpoints.elementDisplayed(TravelPage.searchBy1));
        softAssert.assertTrue(Checkpoints.elementDisplayed(TravelPage.searchBy2));
        softAssert.assertTrue(Checkpoints.elementDisplayed(TravelPage.checkIn));
        softAssert.assertTrue(Checkpoints.elementDisplayed(TravelPage.checkOut));
        softAssert.assertTrue(Checkpoints.elementDisplayed(TravelPage.travellers));
        softAssert.assertTrue(Checkpoints.elementDisplayed(TravelPage.button));
     
        softAssert.assertAll();
	}
        
    @Then("Write")
    public static void write() {
    	WebDriver driver = new ChromeDriver();
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	
    	
		TravelPage TravelPage = new TravelPage();
		SoftAssert softAssert = new SoftAssert();	
		System.out.println("Start: Check Results Record: ");	
        TravelPage.searchBy1.click();
        TravelPage.searchBy2.sendKeys("mexico");
        TravelPage.checkIn.click();
        TravelPage.checkIn.sendKeys("06/03/2019");
        TravelPage.checkOut.click();
        TravelPage.checkOut.sendKeys("16/03/2019");
        TravelPage.travellers.click();
        TravelPage.travellers.clear();
        TravelPage.travellers.sendKeys("5 Adults 3 Child");
        softAssert.assertAll();
        
	}
}
