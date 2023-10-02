package org.project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.Baseclass;
import org.utilities.Pojo1ForAcceptCookies;

public class BootsHealthCare extends Baseclass {
	
	@BeforeClass
	private void beforeAllTc() throws InterruptedException {
        openchrome();
        sleep(1000);
        System.out.println("Browser Open");
	}
	
	@BeforeMethod
	private void beforetc() {
		launcherurl("https://www.boots.com/");
		maxwindow();
		getDateandtime();
		
	}
		
	 @AfterMethod
	private void afterTc() {
	    	getDateandtime();
	}
	
	 @Test(priority=1)
		private void tc1() {
			String titlename = driver.getTitle();
			System.out.println(titlename);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
	}
	 
	 @Test(priority=2)
	 private void Pojo1ForAcceptCookies() {
		 Pojo1ForAcceptCookies P1 = new Pojo1ForAcceptCookies();
		 P1.getAcceptcookies().click();
	
	}
	 

	 @Test(priority=3)
	 private void Pojo2ForLogin() {
		 org.utilities.Pojo2ForLogin P2 = new org.utilities.Pojo2ForLogin();
		 P2.getRegister().click();
	 }
	 
	 @Test(priority=4) 
	 private void Pojo3ForUsernamePassword() {
		 org.utilities.Pojo3ForUsernamePassword P3 = new org.utilities.Pojo3ForUsernamePassword();
		 filltextbox(P3.getTxtemail(), "archanarchu5991@gmail.com");
		 filltextbox(P3.getTxtpass(), "Altaf@123");
		 toclick(P3.getBtnlog());

	}
	 
	 @Test(priority=5)
	 private void Pojo4ForSearchProduct() {
		 org.utilities.Pojo4ForSearchProduct P4 = new org.utilities.Pojo4ForSearchProduct();
		 filltextbox(P4.getSrchproduct(), "ponds cold cream");
		 toclick(P4.getBtnsearch());
		 
    }
	
	 @Test(enabled=false)
	 private void Pojo5ForAddToCart() {
		 org.utilities.Pojo5ForAddToCart P5 = new org.utilities.Pojo5ForAddToCart();
         toclick(P5.getAddtocart());

	}
	
	 @AfterClass
		private void afterAllTc() {
	       driver.quit();
	       System.out.println("Browser Close");
	}
	 	 
}

