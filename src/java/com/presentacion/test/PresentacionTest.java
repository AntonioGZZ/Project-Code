package com.presentacion.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresentacionTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://code-breakers.ml/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='centerb']")));
		
		/*
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body//textarea[1]")).sendKeys("He is super otaku and loves videogames!!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body//textarea[1]")).clear();
		driver.findElement(By.xpath("//body//textarea[1]")).sendKeys("He Loves the America team ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body//textarea[1]")).clear();
		driver.findElement(By.xpath("//body//textarea[1]")).sendKeys("He is just Gerardo");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body//textarea[1]")).clear();
		driver.findElement(By.xpath("//body//textarea[1]")).sendKeys("I am the robot Star Breaker and all of us are the CodeBreakers team!");
		Thread.sleep(5000);
		
		*/
		driver.findElement(By.xpath("//button[@onclick=\"window.location.href = 'git.html';\"]")).click();
	    
		
		js.executeScript("window.scrollBy(0,500)");
		
		
	
	//driver.close();
		
		System.out.println("Di molto!");



		

		

	}

}

