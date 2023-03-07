package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class ProductsPage {
	
	@FindBy(xpath="//td[contains(text(),'Products: ')]") private WebElement productsText;
	@FindBy(xpath="//input[@value='New Product']") private WebElement newProductButton;
	
	public ProductsPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public WebElement getProductsText()
	{
		return productsText;
	}
	
	public String getProductsTextAddress()
	{
	    return productsText.getText();
	}
	
	public WebElement getNewProductButton()
	{
		return newProductButton;
	}
	
	public void clickNewProductButton()
	{
		newProductButton.click();
	}
	
	

}
