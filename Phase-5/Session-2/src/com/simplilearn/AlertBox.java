package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	
	public static void main(String[] args) {
		String path= "D:\\Phase-5\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		///initiate the driver
		WebDriver driver= new ChromeDriver();
		///step:2 base url
		String base_url= "https://nxtgenaiacademy.com/alertandpopup/";
		///step:3 launching shine.com
		driver.get(base_url);
		
		
		driver.findElement(By.name("alertbox")).click();
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.name("confirmalertbox")).click();
		driver.switchTo().alert().accept();
	
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		
		driver.findElement(By.name("promptalertbox1234")).click();
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		
		
		System.out.println(driver.findElement(By.id("demoone")).getText());
	}

}
