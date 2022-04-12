package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	
	public static void main(String[] args) {
		String path= "D:\\Phase-5\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		///initiate the driver
		WebDriver driver= new ChromeDriver();
		///step:2 base url
		String base_url= "https://www.shine.com/registration/";
		///step:3 launching shine.com
		driver.get(base_url);
		
		
		WebElement check= driver.findElement(By.id("id_privacy"));
		
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Nikunj Soni");
		
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("nikunj@gmail.com");
		
		WebElement pass= driver.findElement(By.id("id_password"));
		pass.sendKeys("Nikunj@1234");
		
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9876543210");
		
		WebElement button= driver.findElement(By.id("registerButton"));
		button.click();
		 
		
		 
	}
}
