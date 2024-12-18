package com.Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utility.GenericMethods;

public class HomePage {
	
	//initialise driver
	
		 WebDriver driver;
		 JavascriptExecutor js;
		 Alert alt;
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
		@FindBy (xpath = "//a[text()='Sign up']") WebElement signupLink;
		@FindBy (xpath ="//input[@id ='sign-username']") WebElement signUsername;
		 @FindBy (xpath ="//input[@id ='sign-password']") WebElement signPass;
		 @FindBy (xpath ="//button[text() ='Sign up']") WebElement signBtn;
		
		 @FindBy (xpath = "//a[@id='login2']") WebElement loginLink;
		 @FindBy (id = "loginusername") WebElement loginUsername;
		 @FindBy (id = "loginpassword") WebElement loginPass;
		 @FindBy (xpath = "//button[text() ='Log in']") WebElement loginBtn;
		 
		 @FindBy (xpath = "//a[text()='Samsung galaxy s6']") WebElement galaxyPhLink;
		 @FindBy (xpath = "//a[text()='Add to cart']") WebElement addToCart;
		 
		 @FindBy (xpath = "//a[text()='Cart']") WebElement cartLink;
		 
		//base class driver
		public HomePage(WebDriver driver) {
			this.driver = driver;
			js = (JavascriptExecutor) driver;
			PageFactory.initElements(driver, this);
		}
		
		public void regSignUp(String un,String ps)
		{				
			signupLink.click();
			System.out.println("in sign up page ");
			
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}						

			signUsername.sendKeys(un);
			signPass.sendKeys(ps);
			signBtn.click();
			
			GenericMethods.getScreenshot(driver, "Signup");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			alt= driver.switchTo().alert();			
			System.out.println("Sign up Alert message: "+alt.getText());
			alt.accept();
			
		}
		
		
		public void doLogin(String un, String ps) {
			loginLink.click();
			System.out.println("in login page");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			loginUsername.sendKeys(un);
			loginPass.sendKeys(ps);
			loginBtn.click();
			
			GenericMethods.getScreenshot(driver, "Login");
			
			/*
			 * try { Thread.sleep(2000); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 * 
			 * alt= driver.switchTo().alert();
			 * System.out.println("Login Alert message: "+alt.getText()); alt.accept();
			 */
					
			
		}
		
		
		public void clickSamsungPhone() {
			
			js.executeScript("window.scrollBy(0,400)", "");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
								
			galaxyPhLink.click();
			
			//System.out.println("Phone page url :"+driver.getCurrentUrl());			
			System.out.println("On product info page");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			GenericMethods.getScreenshot(driver, "PhoneInfo");
			
			addToCart.click();
			
					
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			alt= driver.switchTo().alert();			
			System.out.println("Add to cart Alert message: "+alt.getText());
			alt.accept();
			
			
			
		}
		
		public CartPage clickOnCart() {
			
			cartLink.click();
			System.out.println("On Cart page");
			return new CartPage(driver);
			
		}
}
