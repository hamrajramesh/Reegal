package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class PriceBooksPage {
	
	@FindBy(xpath="//td[contains(text(),'Price Books: ')]") private WebElement priceBooksText;
	@FindBy(xpath="//input[@value='New Price Book']") private WebElement newPriceBookButton;
	
	public PriceBooksPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getPriceBooksText()
	{
		return priceBooksText;
	}
	
	public String getPriceBooksTextAddress()
	{
		return priceBooksText.getText();
	}
	
	public WebElement getNewPriceBookButton()
	{
		return newPriceBookButton;
	}
	
	public void clickNewPriceBookButton()
	{
		newPriceBookButton.click();
	}

}
