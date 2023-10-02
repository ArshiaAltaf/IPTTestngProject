package org.utilities;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1ForAcceptCookies extends Baseclass{
	
	public Pojo1ForAcceptCookies() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id=\"onetrust-accept-btn-handler\"]")
	private WebElement acceptcookies;

	public WebElement getAcceptcookies() {
		return acceptcookies;
	}
	
		}


