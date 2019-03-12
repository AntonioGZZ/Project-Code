package com.fifteen.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenture.test.ui.WebDriverSteps;
import com.basic.steps.BasicSteps;

public class FifteenTests {

	 @BeforeMethod (alwaysRun = true)
	 public void beforeTest() throws IOException { 
		WebDriverSteps nav = new WebDriverSteps();
		nav.navigateToApplication("FIFT");

	 }
		
	 @Test (groups = {"ALLTests", "Test1", "Smoke"})
	  public void FifteenTest() throws InterruptedException {
		 BasicSteps.launchApllication();
		 
		 //WebDriverSteps.closeTheBrowser();
		 
	 }
	  


}