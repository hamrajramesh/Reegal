package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreateProductPage {
	
	@FindBy(name="property(Product Name)") private WebElement productName;
	@FindBy(name="property(Product Category)") private WebElement productCategoryDropdown;
	@FindBy(xpath="(//img[@title='Calendar'])[1]") private WebElement salesStartDate;
	@FindBy(xpath="//td[contains(text(),' Create Product')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

	public CreateProductPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getProductName()
	{
		return productName;
	}
	
	public void TypeProductName(String ProductName)
	{
		productName.sendKeys(ProductName);
	}
	
	public WebElement getProductCategoryDropdown()
	{
		return productCategoryDropdown;
	}
	
	public WebElement getSalesStartDate()
	{
		return salesStartDate;
	}
	
	public void clickSalesStartDate()
	{
		salesStartDate.click();
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
		
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	

}
