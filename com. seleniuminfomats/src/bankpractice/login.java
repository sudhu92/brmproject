package bankpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login {
	
	WebDriver driver;
	@BeforeSuite
	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/");
		driver.manage().window().maximize();
	}
	@Test
	public void login() {
		PageFactory.initElements(driver, Pombank.class);
		Pombank.userid.sendKeys("mngr564786");
		Pombank.pass.sendKeys("AZeqezE");
		Pombank.login.click();
		PageFactory.initElements(driver,Pombank.class);
		Pombank.NewCustomer.click();
		Pombank.value.sendKeys("sudharshan");
		Pombank.radio.click();
		Pombank.date.sendKeys("32-3-2024");
	}









}