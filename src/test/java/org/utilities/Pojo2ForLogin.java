package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2ForLogin extends Baseclass {

	public Pojo2ForLogin() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//span[text()='Log in/register']")
		private WebElement register;
		
		
		public WebElement getRegister() {
			return register;
		}
	
		
}

