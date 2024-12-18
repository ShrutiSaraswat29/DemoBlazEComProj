package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Pages.CartPage;
import com.Pages.HomePage;



public class BaseTestClass {
	
	public WebDriver driver;
	public HomePage hp;
	public CartPage cp;
	
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		
		 hp = new HomePage(driver);
		 cp = new CartPage(driver);
		
		
	}
	
	@AfterTest
	public void tearDown() {

		driver.close();

	}

}
