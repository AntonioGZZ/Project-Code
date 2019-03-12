package projct2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC14 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='img-responsive']")));
		
		
		

		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='img-responsive']")));
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("email-test@outlook.com");
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Your personal information')]")));
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Jack");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Skellington");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456789");
		
		
		driver.findElement(By.xpath("//select[@id='days']")).click();
		driver.findElement(By.xpath("//option[@value='19'][contains(text(),'19')]")).click();

		
		driver.findElement(By.xpath("//select[@id='months']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'July')]")).click();

		
		
		driver.findElement(By.xpath("//select[@id='years']")).click();
		driver.findElement(By.xpath("//option[@value='1995']")).click();
		
		driver.findElement(By.xpath("//label[@for='optin']")).click();
		

		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Test avenue");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Test Avenue2");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Laredo");
		driver.findElement(By.xpath("//select[@id='id_state']")).click();
		driver.findElement(By.xpath("//option[@value='43']")).click();
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("12345");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='id_country']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'United States')]")).click();
		
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("65798765");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("8665456786");
		driver.findElement(By.xpath("//input[@id='alias']")).clear();
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Test alias");
		
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	
		String val;
		
		val = driver.findElement(By.xpath("//p[@class='info-account']")).getText();
		
   		if (val.contains("Welcome to your account. Here you can manage all of your personal information and orders")) {
				System.out.println("Usuario Cread0");
		}else{
				System.out.println("No se creo el usuario");
								}
		

		
		
	
	driver.close();
		
		System.out.println("Di molto!");



		

		

	}

}

