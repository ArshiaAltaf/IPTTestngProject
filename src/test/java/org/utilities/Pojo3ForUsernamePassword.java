package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3ForUsernamePassword extends Baseclass {

	public Pojo3ForUsernamePassword() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder=\"email@address.com *\"]")
	private WebElement txtemail;
	
	@FindBy(xpath="(//input[@name=\"password\"])[9]")
	private WebElement txtpass;
	
	@FindBy(xpath="//input[@value=\"Log in\"]")
	private WebElement btnlog;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlog() {
		return btnlog;
	}
	
	
}
