package com.seleniuminfomatsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public void methods() throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	 Thread.sleep(4000);
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@class ='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		//driver.quit();


	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Day2 step =  new  Day2();
		step.methods();
	}

}
