package com.seleniuminfomatsexample;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

		//		Screenshot notes;
		//		use TakesScreenshot interface take screenshor driver;
		//		use get screenshotAs mwthod and stored ina file;
		//		create location for screenshot image
		//		using file handler copy the screenshot file
		//		
		//	Using robot class another wayto screenshot
		//	 Create objict for robot class.
		//	to get screen size use  toolkit.getdefaulttoolkit.getscrensize
		//	use rectangle class pass  screen size
		//	create screen capture method  (source)
		//	using file find destination path
		//	using image io.copy 

	System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		//		TakesScreenshot screenshot = (TakesScreenshot) driver;
		//	File sourcefile = 	screenshot.getScreenshotAs(OutputType.FILE);
		//	 File file = new File("D:/sample.png");
		//	FileHandler.copy(sourcefile, file);
		Robot robo = new Robot();
		Dimension screensize=	 Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle tect = new Rectangle(screensize);
		BufferedImage sourcefile = 	robo.createScreenCapture(tect);
		File dfile = new File("D:/sample.png");
		ImageIO.write(sourcefile,"png", dfile);



















	}

}
