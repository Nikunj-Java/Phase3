package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {

	public static void main(String[] args) {
		String path= "D:\\Phase-5\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		///initiate the driver
		WebDriver driver= new ChromeDriver();
		///step:2 base url
		String base_url= "http://www.facebook.com/";
		///step:3 launching facebook
		driver.get(base_url);
		
		WebElement username= driver.findElement(By.id("email"));
		
		Actions builder =new Actions(driver);
		Action seriesofAction= builder
				.moveToElement(username)
				.click()
				.keyDown(username,Keys.SHIFT)
				.sendKeys(username,"hello")
				.doubleClick(username)
				.contextClick()
				.build();
		
		seriesofAction.perform();
		
		
	}


}
