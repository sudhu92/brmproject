package com.seleniuminfomatsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclass {
	public void day1 () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://brm.tremplintech.in/web_pages/login.aspx");
	driver.manage().window().maximize();
	driver.findElement(By.id("txt_unam")).sendKeys("sylix");
	driver.findElement(By .id("txt_pass")).sendKeys("admin");
	driver.findElement(By.id("Button3")).click();
//	driver.findElement(By.xpath("//a[@class = 'level1 static']")).click();
//	Thread.sleep(4000);
//	driver.navigate().back();
//	Thread.sleep(4000);
//driver.findElement(By.xpath("//a[@class= 'level1 static']")).click();
//	Thread.sleep(4000);
//driver.navigate().back();
//	Thread.sleep(4000);
//   driver.findElement(By.xpath("//a[@class ='level1 static']")).click();
	Thread.sleep(3000);
   driver.findElement(By.xpath("(//a[@class='level1 static']//parent::li)[6]")).click();
	
	//driver.quit();
	
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		firstclass step =  new  firstclass();
		  step.day1();
		
		

	}

}
