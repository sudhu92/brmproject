package practicecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	 WebDriver driver;
	@BeforeSuite
	public void browser() {
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://admin-demo.nopcommerce.com/login");
		 driver.manage().window().maximize();
		 }
	@Test
	public void validlogin() {
		
		PageFactory.initElements(driver,Pomlogin.class);
		Pomlogin.Email.sendKeys("admin@yourstore.com");
		Pomlogin.Paasword.sendKeys("admin");
		Pomlogin.login.click();
		
		
	}
	@AfterSuite
	public void close () {
		 driver.quit();
	}
	

}
		
	

