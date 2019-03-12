package com.shop.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenture.test.ui.WebDriverSteps;
import com.shop.steps.ShopStep;

public class ShopTest {
	 @BeforeMethod (alwaysRun = true)
	 public void beforeTest() throws IOException { 
		WebDriverSteps nav = new WebDriverSteps();
		nav.navigateToApplication("SHOPI");

	 }
		
	 @Test (groups = {"ALLTests", "Test1", "Smoke"})
	  public void testshop() throws InterruptedException {
		 ShopStep.launchApllication();
		 //WebDriverSteps.closeTheBrowser();
		 
	 }
	  


}
