package com.TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.Listeners.ExtentITestNGListeners.class)

public class CartPageTestClass extends BaseTestClass {
  @Test(priority = 1)
  public void testPlaceOrder() {
	  
	  cp.placeOrder();
  }
}
