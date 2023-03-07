package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreatePurchaseOrderPage {
	
	@FindBy(name="property(Subject)") private WebElement subjectTextbox;
    @FindBy(xpath="//img[@title='Vendor Name Lookup']") private WebElement vendorNameLookupIcon;
    @FindBy(xpath="(//img[@title='Calendar'])[1]") private WebElement poDate;
    @FindBy(name="property(Status)") private WebElement statusDropdown;
    @FindBy(name="property(txtQty1)") private WebElement qtyTextbox;
    @FindBy(name="property(txtListPrice1)") private WebElement listPriceTextbox;
    @FindBy(name="property(hdnProductName1)") private WebElement productName;
    @FindBy(xpath="//img[@title='Product Name Lookup']") private WebElement productNameLookupIcon;
	@FindBy(xpath="//td[contains(text(),' Create Purchase Order')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

    public CreatePurchaseOrderPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    public WebElement getProductNameLookupIcon()
    {
    	return productNameLookupIcon;
    }
    
    public void clickProductNameLookupIcon()
    {
    	productNameLookupIcon.click();
    }

	public WebElement getSubjectTextbox() 
	{
		return subjectTextbox;
	}
	
	public void TypeSubjectTextbox(String Subject)
	{
		subjectTextbox.sendKeys(Subject);
	}

	public WebElement getVendorNameLookupIcon() 
	{
		return vendorNameLookupIcon;
	}
	
	public void clickVendorNameLookupIcon()
	{
		vendorNameLookupIcon.click();
	}

	public WebElement getPoDate() 
	{
		return poDate;
	}
	
	public void clickPoDate()
	{
		poDate.click();
	}

	public WebElement getStatusDropdown() 
	{
		return statusDropdown;
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

	public WebElement getProductName() 
	{
		return productName;
	}
	
	public void TypeProductName(String ProductName)
	{
		productName.sendKeys(ProductName);
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	public void NewPurchaseOrder(String Subject,String Qty,String ListPrice,String ProductName)
	{
		subjectTextbox.sendKeys(Subject);
		qtyTextbox.sendKeys(Qty);	
		listPriceTextbox.sendKeys(ListPrice);
		productName.sendKeys(ProductName);




	}
    
    
    

}
