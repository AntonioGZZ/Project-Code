package projct2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/eclipse-workspace/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		System.out.println("paso 1");

		driver.get("http://demo.guru99.com/test/login.html");

		if (driver.findElement(By.id("site-name")).isDisplayed()) {
			System.out.println("Element is displayed");
		} else {
			System.out.println("Element is not displayed");
		}

		System.out.println("paso 2");

		driver.findElement(By.id("email")).sendKeys("blabla");
		driver.findElement(By.id("passwd")).sendKeys("blabla");
		driver.findElement(By.id("SubmitLogin")).click();

		if (driver.findElement(By.xpath("//h3[contains(text(),'Successfully')]")).isDisplayed()) {
			System.out.println("validation is done");
		} else {
			System.out.println("no validation");
		}

		System.out.println("paso 3");

		driver.close();

	}

}