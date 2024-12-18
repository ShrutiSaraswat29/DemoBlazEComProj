package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pages.CartPage;
@Listeners(com.Listeners.ExtentITestNGListeners.class)

public class HomePageTestClass extends BaseTestClass{
  @Test(priority = 1)
  public void testSignUp() {
	  
	  hp.regSignUp("hockinghills","hockinghills");
  }
  @Test(priority = 2)
  public void testLogin() {
	  
	  hp.doLogin("hockinghills","hockinghills");
  }
  @Test(priority = 3)
  public void testsamsungPhone() {
	  
	  hp.clickSamsungPhone();
	  
  }
  @Test(priority = 4)
  public void testClickCart() {
	  
	  CartPage cpo = hp.clickOnCart();
	  cpo.placeOrder();
  }
}
