package com.simplilearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginAllMethods {
	
	public static void main(String[] args) {
		String path= "D:\\Phase-5\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		///initiate the driver
		WebDriver driver= new ChromeDriver();
		///step:2 base url
		String base_url= "http://www.facebook.com/";
		///step:3 launching facebook
		driver.get(base_url);
		
		//find by id
		WebElement email1= driver.findElement(By.id("email"));
		//find by name
		WebElement email2= driver.findElement(By.name("email"));
		
		//compare
		System.out.println("Id and Name Found : "+email1.equals(email2));
		
		
		//linked test is already done
		
		
		//by using relative path
		WebElement xpathEmail= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		System.out.println("Xpath Found: "+email1.equals( xpathEmail));
		
		
		///by using full path
		
		WebElement fullXpath= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		
		System.out.println("Full Xpath Found: "+email1.equals(fullXpath));
		
		
		
		//selector
		
		WebElement cssSelector= driver.findElement(By.cssSelector("#email"));
		System.out.println("cssselector Found: "+email1.equals(cssSelector));
		
		
		//list of webelements
		
		List<WebElement> list= driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list) {
			System.out.println("List of WebElements are : "+e.getAttribute("placeholder"));
		}
		
		
		//Tag and Attribute
		
		WebElement pass= driver.findElement(By.cssSelector("input[name=pass]"));
		
		System.out.println("Password using Tag: "+pass.getAttribute("placeholder"));
		
		//driver.close();
	}

}
