package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class practice {
	WebDriver driver;
	@BeforeMethod

	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
}
	@Test
	public void firstcase() {

		driver.get("https://www.google.co.in/");
}
	@Test
	public void  secondcase() {

		driver.get("https://www.bing.com/");
}
	@Test
	public void thirdcase() {

		driver.get("https://in.search.yahoo.com/?fr2=inr");

	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
}