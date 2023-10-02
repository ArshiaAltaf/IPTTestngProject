package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4ForSearchProduct extends Baseclass {
	
	public Pojo4ForSearchProduct() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="AlgoliaSearchInput")
	private WebElement srchproduct;
	
	@FindBy(id="algolia-search-button")
	private WebElement btnsearch;

	public WebElement getSrchproduct() {
		return srchproduct;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	
}
