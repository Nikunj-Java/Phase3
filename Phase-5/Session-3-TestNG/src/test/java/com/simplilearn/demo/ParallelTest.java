package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	 
	@Test(groups = "Chrome")
	public void LaunchChrome() {
		String driver_path = "D:\\Phase-5\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test(groups = "Chrome",dependsOnMethods = "LaunchChrome")
	public void TryFacebook() {
		
		driver.findElement(By.id("email")).sendKeys("nikunj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nikunj@123");
	}
	
	
	
	@Ignore
	@Test(groups = "Firefox")
	public void LaunchFirfox() {
		String driver_path = "D:\\Phase-5\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Ignore
	@Test(groups = "Firefox",dependsOnMethods = "LaunchFirfox")
	public void TryFacebook2() {
		
		driver.findElement(By.id("email")).sendKeys("nikunj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nikunj@123");
	}
}
