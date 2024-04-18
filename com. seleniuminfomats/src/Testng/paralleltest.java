package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltest {
@Test
	public void brows () {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
		
	}
@Test
	public void open () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.bing.com/");
			driver.quit();
	}
}

	

