package projct2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC12 {

	public static void main(String[] args) throws InterruptedException {
		
		String val;

		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='img-responsive']")));
		

		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Already registered?')]")));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@outlook.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456789");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='info-account']")));
		driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
		
		
		
		
		
		Thread.sleep(8000);
		
		System.out.println("hooa");
		driver.findElement(By.xpath("//ul[@class='product_list grid row homefeatured tab-pane active']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//a[@title='Add to cart']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")));
		driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='processAddress']")));
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='1']")));
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Pay by bank wire']")));
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='cart_navigation']//button[@type='submit']")));
		driver.findElement(By.xpath("//p[@id='cart_navigation']//button[@type='submit']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='View my customer account']")));
		driver.findElement(By.xpath("//a[@title='View my customer account']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Orders']")));
		driver.findElement(By.xpath("//a[@title='Orders']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[contains(@class,'first_item')]//td[@class='history_date bold']")));
		
		val = driver.findElement(By.xpath("//tr[contains(@class,'first_item')]//td[@class='history_date bold']]")).getText();
		
		
   		if (val.contains("03/11/2019")) {
				System.out.println("Contenido desplegado");
		}else{
				System.out.println("No se muestra contenido");
		
		
		
	    driver.close();
		
		System.out.println("Di molto!");



		

		

	}
	}

}