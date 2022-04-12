package com.simplilearn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	
	public static void main(String[] args) throws IOException,InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\Phase-5\\\\chromedriver\\\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		
		WebElement email= driver.findElement(By.id("id_name"));
		email.sendKeys("nikunj@gmail.com");
		
		WebElement element= driver.findElement(By.id("id_file"));
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Screenshot\\upload.exe");
		 
	}
}
