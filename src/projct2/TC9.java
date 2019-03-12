package projct2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC9 {

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
		driver.findElement(By.xpath("//i[@class='icon-building']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='page-subheading']")));
		
		

		val = driver.findElement(By.xpath("//ul[@class='last_item item box']")).getText();
		
		
   		
				System.out.println(val);
		
		
		
		driver.close();
		
		System.out.println("Di molto!");



		

		

	
	}

}