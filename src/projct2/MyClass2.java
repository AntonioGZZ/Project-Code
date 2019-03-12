package projct2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/eclipse-workspace/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		System.out.println("paso 1");

		driver.get("http://demo.guru99.com/test/link.html");

		// String str = driver.getCurrentUrl();

		if (driver.findElement(By.id("site-name")).isDisplayed()) {
			System.out.println("Element is displayed");
		} else {
			System.out.println("Element is not displayed");
		}
		// driver.findElement(By.xpath("//div[@id='site-name']"));
		// driver.findElement(By.className("site-name"));
		// driver.findElement(By.partialLinkText("Demo"));
		// driver.findElement(By.linkText("Demo Text"));

		System.out.println("paso 2");

		driver.findElement(By.xpath("*//a[@href='http://www.google.com']")).click();

		if (driver.findElement(By.id("hplogo")).isDisplayed()) {
			System.out.println("Element is displayed");
		} else {
			System.out.println("Element is not displayed");
		}

		System.out.println("paso 3");

		driver.close();
		System.exit(0);

	}

}
