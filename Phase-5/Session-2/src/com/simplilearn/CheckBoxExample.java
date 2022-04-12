package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	
	public static void main(String[] args) {
			
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		WebElement Check= driver.findElement(By.id("id_privacy"));
		//check box is selected 
		
		if(Check.isSelected()) {
			
			System.out.println("CheckBox is Selected by default");
			System.out.println("status of check box: "+Check.isSelected());
			
		}
		else {
			System.out.println("CheckBox is not Selected");
			
		}
		
		Check.click();
		System.out.println("status of check box: "+Check.isSelected());
		 
		
		 
	}
}
