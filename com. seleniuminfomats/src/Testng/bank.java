package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class bank {
	WebDriver driver;
	@BeforeSuite
	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/");
		driver.manage().window().maximize();

	}
	@Test
	
	public void login () {

		driver.findElement(By.name("uid")).sendKeys("mngr564786");
		driver.findElement(By.name("password")).sendKeys("AZeqezE");
		driver.findElement(By.name("btnLogin")).click();

	}
	@Test
	public void addcustomer (){
		driver.findElement(By.xpath("//ul[@class='menusubnav']//li[2]/a")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sudharshan");
		driver.findElement(By.xpath("//table[@class='layout']//tbody/tr[5]/td[2]/input[2]")).click();


	} 

	@Test
	public void close () {
		//driver.quit();
	}





}
