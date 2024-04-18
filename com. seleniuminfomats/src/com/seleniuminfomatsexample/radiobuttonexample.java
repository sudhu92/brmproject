package com.seleniuminfomatsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonexample {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");

		driver.findElement(By.xpath("//i[@class ='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//i[@class ='pi pi-fw pi-stop-circle layout-menuitem-icon']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//table[@id ='j_idt87:console1']")).click();



		//  String text=favbrows.getText();
		//	System.out.println(text);
		//	if (text.equalsIgnoreCase("chrome")) {
		//		Thread.sleep(3000);
		//		favbrows.click();
		//	}
		//	if (text.equalsIgnoreCase("firefox")) {
		//		Thread.sleep(3000);
		//		favbrows.click();
	}





}


