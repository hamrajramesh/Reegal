package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreateInvoicePage {
	
	@FindBy(xpath="//img[@title='SalesOrder Lookup']") private WebElement salesOrderLookupIcon;
	@FindBy(xpath="(//img[@title='Calendar'])[1]") private WebElement invoiceDate;
	@FindBy(xpath="//img[@title='Product Name Lookup']") private WebElement productNameLookupIcon;
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accountNameLookupIcon;
	@FindBy(xpath="//td[contains(text(),' Create Invoice')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

	
	public CreateInvoicePage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	public WebElement getAccountNameLookupIcon() 
	{
		return accountNameLookupIcon;
	}
	
	public void clickAccountNameLookupIcon()
	{
		accountNameLookupIcon.click();
	}
	
	public WebElement getProductNameLookupIcon() 
	{
		return productNameLookupIcon;
	}
	
	public void clickProductNameLookupIcon()
	{
		productNameLookupIcon.click();
	}
	
	public WebElement getSalesOrderLookupIcon()
	{
		return salesOrderLookupIcon;
	}
	
	public void clickSalesOrderLookupIcon()
	{
		salesOrderLookupIcon.click();
	}
	
	public WebElement getInvoiceDate()
	{
		return invoiceDate;
	}
	
	public void clickInvoiceDate()
	{
		invoiceDate.click();
	}
	
	

}
