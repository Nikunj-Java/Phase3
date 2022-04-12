package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	
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
		
		if(check.isSelected()) {
			System.out.println("CheckBox is selected by Default");
			System.out.println("status of check box : "+check.isSelected());
			
		}
		else {
			System.out.println("CheckBox is not selected");
		}
		
		driver.close();
	}
}
