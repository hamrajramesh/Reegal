package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class PurchaseOrderDetailsPage {
	@FindBy(xpath="//td[contains(text(),'Vendor Name')]//following-sibling::td") private WebElement vendorNameText;
	
	public PurchaseOrderDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public WebElement getVendorNameText()
	{
		return vendorNameText;
	}
	
	public String getVendorNameTextAddress()
	{
		return vendorNameText.getText();
	}

}
