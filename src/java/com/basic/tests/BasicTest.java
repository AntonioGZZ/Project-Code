package com.basic.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenture.test.ui.WebDriverSteps;
import com.basic.steps.BasicSteps;
import com.shop.steps.ShopStep;


public class BasicTest {

	 @BeforeMethod (alwaysRun = true)
	 public void beforeTest() throws IOException { 
		WebDriverSteps nav = new WebDriverSteps();
		nav.navigateToApplication("BASI");

	 }
		
	 @Test (groups = {"ALLTests", "Test1", "Smoke"})
	  public void basictest() throws InterruptedException {
		 BasicSteps.launchApllication();
		 
		 //WebDriverSteps.closeTheBrowser();
		 
	 }
	  


}
