package dataprovider;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exampledataprovider {
	WebDriver driver;

	long starttime;
	long endtime;
	long totaltime;

	String[][] data = {
			{"sudharshan","admin"},
			{"sudhar123","admin123"},
			{"sudhar@#$","adminSK"},
			{"sylix","admin"},
	};


	@DataProvider(name = "login")
	public String[][] loginmethod () {
		return data;
	}
	@BeforeSuite
	public void openbrowser() {
		starttime = System.currentTimeMillis();

		System.setProperty("Webdriver.chrome.driver" ,"\"C:\\\\Users\\\\sudha\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
	    driver = new ChromeDriver();

		driver.get("http://brm.tremplintech.in/web_pages/login.aspx");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "login")	
	public void login (String uname,String pass) {
		driver.findElement(By.id("txt_unam")).sendKeys("uname");
		driver.findElement(By.id("txt_pass")).sendKeys("pass");
		driver.findElement(By.id("Button3")) .click();	
		
		Alert alert =driver.switchTo().alert();
		alert.accept();
	}
	@AfterSuite

	public void close() {
		driver.quit();
		endtime = System.currentTimeMillis();
		totaltime = endtime - starttime;
		System.out.println("total time taken"+totaltime);
	}

}
