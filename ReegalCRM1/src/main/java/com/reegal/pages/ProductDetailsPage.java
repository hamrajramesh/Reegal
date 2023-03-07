package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class ProductDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'Product Name')]//following-sibling::td") private WebElement productNameText;
    @FindBy(xpath="//input[@value='Add to Price Books ']") private WebElement addToPriceBooksButton;
	
	public ProductDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getAddToPriceBooks()
	{
		return addToPriceBooksButton;
	}
	
	public void clickAddToPriceBooks()
	{
		addToPriceBooksButton.click();
	}
	
	public WebElement getProductNameText()
	{
		return productNameText;
	}
	
	public String getProductNameTextAddress()
	{
		return productNameText.getText();
	}
	
	
}
