package com.seleniuminfomatsexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		Thread.sleep(3000);

		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Alert a =driver.switchTo().alert(); 
		Thread.sleep(3000);

		a.accept();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).
		click(); Alert a2 = driver.switchTo().alert(); Thread.sleep(3000);
		a2.accept(); //a2.dismiss();


		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Thread.sleep(3000);

		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("Sudharshan");
		Thread.sleep(3000);
		a3.accept();

	}

}
