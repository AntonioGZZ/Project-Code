package com.shop.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.shop.pages.ShopPage;

import cucumber.api.java.en.Then;

public class ShopStep {
    @Then("Write")
    public static void launchApllication() throws InterruptedException {
    	
   Thread.sleep(2000);
    	
		ShopPage ShopPage = new ShopPage();
		//SoftAssert softAssert = new SoftAssert();

		
        ShopPage.women.click();
        Thread.sleep(2000);
        ShopPage.plusbut.click();

        Thread.sleep(2000);
        
        ShopPage.shirts.click();
        Thread.sleep(2000);
        
        ShopPage.small.click();

        Thread.sleep(2000);
        ShopPage.blue.click();

        Thread.sleep(2000);
        ShopPage.cart.click();

        System.out.println("Di molto!");
        
        
	}
}
