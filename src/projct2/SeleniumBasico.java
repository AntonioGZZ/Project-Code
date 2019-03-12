package projct2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumBasico {
	public static void main(String[] args) throws InterruptedException {
		
	
		String val;
		String val1;
		String val2;
		String val3;

		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://book.theautomatedtester.co.uk");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mainheading']")));
		

		driver.findElement(By.xpath("//a[contains(text(),'Chapter1')]")).click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divontheleft']")));


		
		driver.findElement(By.xpath("//input[@id='radiobutton']")).click();
		driver.findElement(By.xpath("//select[@id='selecttype']")).click();
		driver.findElement(By.xpath("//select[@id='selecttype']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='selecttype']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='selecttype']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='selected(1234)']")).click();
		
	
	if(driver.findElement(By.xpath("//input[@name='selected(1234)']")).isSelected()){
		System.out.println("El boton esta seleccionado");
		}else{
		System.out.println("El boton no esta seleccionado");
		}
		
	   driver.findElement(By.xpath("//input[@id='secondajaxbutton']")).click();
	   
	   driver.findElement(By.xpath("//div[@class='belowcenter']")).getText();
	   Thread.sleep(2000);
	   val = driver.findElement(By.xpath("//div[@class='belowcenter']")).getText();
	   
	   		if (val.contains("I have been added with a timeout")) {
	   				System.out.println("El texto es visible");
	   		}else{
	   				System.out.println("El boton no es visible");
	   								}
	   		
	   	driver.findElement(By.xpath("//input[@id='storeinput']")).sendKeys("test");
	   	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='storeinput']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='storeinput']")).sendKeys("selenium");
		
		
		if(driver.findElement(By.xpath("//input[@id='verifybutton']"))!= null){
			System.out.println("El boton esta presente");
			}else{
			System.out.println("El boton no esta presente");
			}
			
		driver.findElement(By.xpath("//div[@id='loadajax']")).click();
		Thread.sleep(2000);
		
		val1 = driver.findElement(By.xpath("//p[contains(text(),'The following text has been loaded from another pa')]")).getText();
		
   		if (val1.contains("The following text has been loaded from another page on this site. It has been loaded in an asynchronous fashion so that we can work through the AJAX section of this chapter")) {
				System.out.println("Contenido desplegado");
		}else{
				System.out.println("No se muestra contenido");
								}
   		driver.get("http://book.theautomatedtester.co.uk/windowpopup.html");
   		
   		Thread.sleep(2000);
   		val2 = driver.findElement(By.xpath("//p[contains(text(),'Text within the pop up window')]")).getText();
   		
   		if (val2.contains("Text within the pop up window")) {
			System.out.println("Contenido de la ventana desplegado");
	}else{
			System.out.println("No se muestra contenido");
							}
   		driver.get("http://book.theautomatedtester.co.uk/windowpopup.html");
   		
   		Thread.sleep(2000);
   		val3 = driver.findElement(By.xpath("//p[contains(text(),'Text within the pop up window')]")).getText();
   		
   		if (val3.contains("Text within the pop up window")) {
			System.out.println("Contenido de la ventana 2 desplegado");
	}else{
			System.out.println("No se muestra contenido");
							}

   		//driver.close();
		
		System.out.println("Di molto!");



		

		

	}

}
