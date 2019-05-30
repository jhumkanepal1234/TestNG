package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task1 extends CommonMethods{
//	TC 1: Swag Lab Title and Login Verification
	//  https://www.saucedemo.com/index.html
//
//	@BeforeMethod should contain navigation to the URL and title verification
//
//	@Test should contain steps to login and “Product” word verification
//
//	@AfterMethod should logOut from the application and close the browser
	
	
	@BeforeMethod
	public void setUP(){
		setUpDriver("chrome", "https://www.saucedemo.com/index.html");
		System.out.println("The title of this website is: "+driver.getTitle());
	}
	
	@Test
	public void login() {
		sendText(driver.findElement(By.xpath("//input[@placeholder='Username']")), "standard_user"); 
		sendText(driver.findElement(By.xpath("//input[@placeholder='Password']")), "secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		String expectedWord="Product";
		WebElement word=driver.findElement(By.xpath("//div[@class='product_label']"));
		
		if(word.getText().equalsIgnoreCase(expectedWord)) {
			System.out.println("Product is displayed");
		}else {
			System.out.println("Product is not displayed");
		}
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		driver.close();
	}
	
	
	
	





}
