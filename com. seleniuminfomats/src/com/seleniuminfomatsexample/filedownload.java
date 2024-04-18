package com.seleniuminfomatsexample;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filedownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(3000);
		File location = new File("C:\\Users\\sudha\\Downloads");
		File [] totalfile = location.listFiles();
		for (File file : totalfile) {  
			if(file.getName().contains("sampleFile")) {
				
				System.out.println("file is downloaded");
				Thread.sleep(3000);
				break;
			}
		}
		driver.quit();
	}
}
