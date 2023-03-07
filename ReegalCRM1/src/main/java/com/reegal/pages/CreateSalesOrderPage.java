package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreateSalesOrderPage {
	
	@FindBy(name="property(Subject)") private WebElement subjectTextbox;
	@FindBy(name="property(txtQty1)") private WebElement qtyTextbox;
	@FindBy(name="property(txtListPrice1)") private WebElement listPriceTextbox;
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accountNameLookupIcon;
	@FindBy(name="property(hdnProductName1)") private WebElement productName;
	@FindBy(xpath="//img[@title='Product Name Lookup']") private WebElement productNameLookupIcon;
	@FindBy(name="property(Carrier)") private WebElement carrierDropdown;
	@FindBy(xpath="//img[@title='Quote Lookup']") private WebElement quoteNameLookupIcon;
	@FindBy(xpath="//img[@title='Calendar']") private WebElement dueDate;
	@FindBy(xpath="//td[contains(text(),' Create Sales Order')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

	
    public CreateSalesOrderPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    public WebElement getSaveButton()
    {
    	return saveButton;
    }
    
    public void clickSaveButton()
    {
    	saveButton.click();
    }
    
    public WebElement getDueDate()
    {
    	return dueDate;
    	
    }
    
    public void clickDueDate()
    {
    	dueDate.click();
    }
    
    
    public WebElement getQuoteNameLookupIcon()
    {
    	return quoteNameLookupIcon;
    }
    
    public void clickQuoteNameLookupIcon()
    {
    	quoteNameLookupIcon.click();
    }
    

	public WebElement getSubjectTextbox() 
	{
		return subjectTextbox;
	}
	
	public void TypeSubjectTextbox(String Subject)
	{
		subjectTextbox.sendKeys(Subject);
	}

	public WebElement getQtyTextbox()
	{
		return qtyTextbox;
	}
	
	public void TypeQtyTextbox(String Qty)
	{
		qtyTextbox.sendKeys(Qty);
	}
	
	

	public WebElement getListPriceTextbox() 
	{
		return listPriceTextbox;
	}
	
	public void TypeListPriceTextbox(String ListPrice)
	{
		listPriceTextbox.sendKeys(ListPrice);
	}

	public WebElement getAccountNameLookupIcon() 
	{
		return accountNameLookupIcon;
	}
	
	public void clickAccountNameLookupIcon()
	{
		accountNameLookupIcon.click();
	}
	
	

	public WebElement getProductName()
	{
		return productName;
	}
	
	public void TypeProductName(String ProductName)
	{
		productName.sendKeys(ProductName);
	}

	public WebElement getProductNameLookupIcon() 
	{
		return productNameLookupIcon;
	}
	
	public void clickProductNameLookupIcon()
	{
		productNameLookupIcon.click();
	}

	public WebElement getCarrierDropdown() 
	{
		return carrierDropdown;
	}
	
	public void NewSalesOrder(String Subject,String Qty,String ListPrice)
	{
		subjectTextbox.sendKeys(Subject);
		qtyTextbox.sendKeys(Qty);
		listPriceTextbox.sendKeys(ListPrice);
	




	}
    
    
    
    
	

}
