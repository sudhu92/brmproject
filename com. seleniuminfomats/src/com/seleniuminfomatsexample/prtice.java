


























package com.seleniuminfomatsexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class prtice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://brm.tremplintech.in/web_pages/login.aspx");
		driver.manage().window().maximize();
		WebElement usernamefield = 	driver.findElement(By.id("txt_unam"));
		usernamefield.sendKeys("sylix");
		WebElement passwordfeild =	driver.findElement(By.id("txt_pass"));
		passwordfeild.sendKeys("admin");
		WebElement loginbutton =	driver.findElement(By.id("Button3"));
		loginbutton .click();	
		WebElement customerlinktext = driver.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a"));
		customerlinktext.click();
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(seconds))
	WebElement text= 	driver.findElement(By.xpath("//input[@id= 'ContentPlaceHolder1_txt_cusid']"));
	String value =   text.getAttribute("value");
	
	
	   System.out.println(value);
	   

	}

}
