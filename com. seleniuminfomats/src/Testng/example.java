package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class example {
	WebDriver driver;
	@BeforeSuite
	public void step() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
}
	@Test(enabled = true )
public void race () {
	driver.findElement(By.id("APjFqb")).sendKeys("infomats\n ");
	driver.navigate().back();
	
	
	
}@Test
	public void gear() {
	
	driver.findElement(By.name("q")).sendKeys("gmail\n");
	driver.navigate().back();
	
}@Test(enabled =false)	
public void bus () {
	
	driver.findElement(By.tagName("textarea")).sendKeys("javascript\n ");
	driver.navigate().back();
}
@AfterSuite
public void van () {
	driver.quit();
		
}



}