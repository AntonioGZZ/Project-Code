package projct2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyClass5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.phptravels.net/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Search by Hotel or City Name')]")));
		
		driver.findElement(By.xpath("//span[contains(text(),'Search by Hotel or City Name')]")).click();
		driver.findElement(By.xpath("//*[@id = 'select2-drop']/div/input")).sendKeys("mexico"	);
		

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select2-result-label']/span")));
		
		driver.findElement(By.xpath("//*[@id = 'select2-drop']/div/input")).sendKeys(Keys.ENTER);
		

		

		driver.findElement(By.name("checkin")).click();
		driver.findElement(By.name("checkin")).sendKeys("06/03/2019");

		driver.findElement(By.name("checkout")).click();
		
		driver.findElement(By.name("checkout")).sendKeys("16/03/2019");
		
		driver.findElement(By.name("travellers")).click();
		driver.findElement(By.name("travellers")).clear();
		
		driver.findElement(By.name("travellers")).sendKeys("5 Adults 3 Child");
		
		

		
		
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'In Hotel-15262')]")));
		
		
		System.out.println("Excelente");



		

		

	}

}
