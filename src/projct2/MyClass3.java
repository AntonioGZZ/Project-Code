package projct2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:/Users/Academy QE/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://hotmail.com");

		String str = driver.getCurrentUrl();

	}

}