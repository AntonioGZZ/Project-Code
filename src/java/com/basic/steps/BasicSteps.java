package com.basic.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.basic.pages.BasicPage;


import cucumber.api.java.en.Then;



public class BasicSteps {

	 @Then("Write")
	    public static void launchApllication() throws InterruptedException {
	    	
	   Thread.sleep(2000);
	    	
			BasicPage BasicPage = new BasicPage();

			
	        BasicPage.chapter1.click();
	        Thread.sleep(2000);
	        BasicPage.boton1.click();
	        Thread.sleep(2000);
	        BasicPage.selrc.click();
	        BasicPage.selrc.sendKeys(Keys.ARROW_DOWN);
	        BasicPage.selrc.sendKeys(Keys.ARROW_DOWN);
	        BasicPage.selrc.sendKeys(Keys.ENTER);
	        BasicPage.box.click();
	        
	        if(BasicPage.box.isSelected()) {
	        	System.out.println("El boton esta seleccionado");
			}else{
			System.out.println("El boton no esta seleccionado");
			}
	        
	        BasicPage.ttp.click();
	        Thread.sleep(2000);
	        BasicPage.timout.getText();
	        
	        String val = BasicPage.timout.getText();
	        
	        if (val.contains("I have been added with a timeout")) {
   				System.out.println("El texto es visible");
   		}else{
   				System.out.println("El boton no es visible");
   								}
	        BasicPage.tes.sendKeys("test");
	        Thread.sleep(2000);
	        BasicPage.tes.clear();
	        Thread.sleep(2000);
	        BasicPage.tes.sendKeys("selenium");
	        Thread.sleep(2000);
	        
	        if(BasicPage.btb!= null){
				System.out.println("El boton esta presente");
				}else{
				System.out.println("El boton no esta presente");
				}
	        BasicPage.aja.click();
	        Thread.sleep(2000);
	        
	        String val2 = BasicPage.espera.getText();
	        
	        if (val2.contains("Text within the pop up window")) {
				System.out.println("Contenido de la ventana desplegado");
		}else{
				System.out.println("No se muestra contenido");
								}
	        
	        
	        
		}
	}
