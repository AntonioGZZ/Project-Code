package projct2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumIntermedio {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.phptravels.net/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Search by Hotel or City Name')]")));
		

		driver.findElement(By.xpath("//*[@title = 'Flights']")).click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='round']")));
		if(driver.findElement(By.xpath("//*[@title = 'Flights']"))!= null){
			System.out.println("La pagina cargo correctamente");
			}else{
			System.out.println("Element is Absent");
			}
		driver.findElement(By.xpath("//label[@for='round']")).click();

		driver.findElement(By.xpath("//div[@id='s2id_location_from']//span[@class='select2-chosen'][contains(text(),'Enter City Or Airport')]")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']//input[@type='text']")).sendKeys("monterrey"	);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select2-result-label']/span")));
		
		driver.findElement(By.xpath("//*[@id = 'select2-drop']/div/input")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@id='s2id_location_to']//span[@class='select2-chosen'][contains(text(),'Enter City Or Airport')]")).click();
		driver.findElement(By.xpath("//div[@id='select2-drop']//input[@type='text']")).sendKeys("cancun"	);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select2-result-label']/span")));
		
		driver.findElement(By.xpath("//*[@id = 'select2-drop']/div/input")).sendKeys(Keys.ENTER);
		

		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).sendKeys("13/03/2019");
		
		
		driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Return']")).sendKeys("18/03/2019");
		
		
		driver.findElement(By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']")).click();
		
		driver.findElement(By.xpath("//select[@name='madult']")).click();
		driver.findElement(By.xpath("//select[@name='madult']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@name='madult']")).sendKeys(Keys.ARROW_DOWN);
		
		
		driver.findElement(By.xpath("//div[@class='modal-body']//div[2]//div[1]//select[1]")).click();
		driver.findElement(By.xpath("//div[@class='modal-body']//div[2]//div[1]//select[1]")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
		
		driver.findElement(By.xpath("//div[@class='bgfade col-md-3 col-xs-12 search-button']//button[@type='submit'][contains(text(),'Search')]")).click();
		
	
	if(driver.findElement(By.xpath("//div[@class='alert alert-danger']"))!= null){
		System.out.println("No flights available is present");
		}else{
		System.out.println("Element is Absent");
		}
	
	driver.close();
		
		System.out.println("Di molto!");



		

		

	}

}
