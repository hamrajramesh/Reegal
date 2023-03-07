package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class SalesOrderDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'Quote Name')]//following-sibling::td[1]") private WebElement quoteNameText;
	
	
	public SalesOrderDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getQuoteNameText()
	{
		return quoteNameText;
	}
	
	public String getQuoteNameTextAddress()
	{
		return quoteNameText.getText();
	}
	
	

}
