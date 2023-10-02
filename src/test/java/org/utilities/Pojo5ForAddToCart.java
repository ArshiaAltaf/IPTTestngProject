package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo5ForAddToCart extends Baseclass {

	public Pojo5ForAddToCart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title=\"Add\"]")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
	
}
