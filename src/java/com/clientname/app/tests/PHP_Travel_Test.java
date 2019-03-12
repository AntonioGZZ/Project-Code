package com.clientname.app.tests;

import com.accenture.test.ui.WebDriverSteps;
import com.clientname.app.steps.ResultsSteps;
import com.clientname.app.steps.SearchSteps;
import java.io.IOException;
import org.testng.annotations.*;
/**
 ****************************************************************************
 *HIGHLIGHTS:
 * > SCRIPT NAME:
 * > DESCRIPTION:
 * > DATA:
 ****************************************************************************
 */
public class PHP_Travel_Test {

 @BeforeMethod (alwaysRun = true)
 public void beforeTest() throws IOException { 
	WebDriverSteps nav = new WebDriverSteps();
	nav.navigateToApplication("PHP");
 
 }
	
 @Test (groups = {"ALLTests", "Test1", "Smoke"})
  public void flightSearch() {
	 
	 SearchSteps.searchFor("Test");
	 ResultsSteps.checkTabsInResult();
	 WebDriverSteps.closeTheBrowser(); 
	 
 }
  
 @AfterMethod(alwaysRun = true)
  public void afterTest() {

  }
 
 
}
