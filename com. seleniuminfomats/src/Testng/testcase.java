package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testcase{

	WebDriver driver;
	@BeforeSuite
	public void  browser() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test
	@Parameters({"username","password"})
	public void login(String uname,String pass) {	

		driver.get("http://brm.tremplintech.in/web_pages/login.aspx");
		driver.findElement(By.id("txt_unam")).sendKeys(uname);
		driver.findElement(By.id("txt_pass")).sendKeys(pass);
		driver.findElement(By.id("Button3")).click();
	}

	@AfterSuite	
	public void close() {
		driver.quit();
	}



}

