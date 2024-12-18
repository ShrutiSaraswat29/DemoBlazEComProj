package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.GenericMethods;

public class CartPage {
	
	WebDriver driver;
	// JavascriptExecutor js;
	
	@FindBy (xpath = "//button[text()='Place Order']") WebElement placeOrBtn;
	@FindBy (id = "name") WebElement Ordname;
	@FindBy (id = "country") WebElement Ordcountry;
	@FindBy (id = "city") WebElement Ordcity;
	@FindBy (id = "card") WebElement Ordcard;
	@FindBy (id = "month") WebElement Ordmonth;
	@FindBy (id = "year") WebElement Ordyear;
	@FindBy (xpath = "//button[text()='Purchase']") WebElement PurchaseBtn;
	
	 
	 public CartPage(WebDriver driver) {
			this.driver = driver;
			//js = (JavascriptExecutor) driver;
			PageFactory.initElements(driver, this);
		}
	 
	 public void placeOrder() {
		 
		 System.out.println("inside place order");
		 placeOrBtn.click();
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Ordname.sendKeys("Sam");
		 Ordcountry.sendKeys("US");
		 Ordcity.sendKeys("NY");
		 Ordcard.sendKeys("123456");
		 Ordmonth.sendKeys("May");
		 Ordyear.sendKeys("2024");
		 
		 GenericMethods.getScreenshot(driver, "PlaceOrder");
		 
		 PurchaseBtn.click();
		 
		 System.out.println("Purchase successful");
		 
		 GenericMethods.getScreenshot(driver, "PurchaseConfirmation");
		 
		 
	 }

}
