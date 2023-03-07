package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class InvoicesPage {
	
	@FindBy(xpath="//td[contains(text(),'Invoices: ')]") private WebElement invoicesText;
	@FindBy(xpath="//input[@value='New Invoice']") private WebElement newInvoiceButton;
	
	public InvoicesPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getInvoicesText()
	{
		return invoicesText;
	}
	
	public String getInvoicesTextAddress()
	{
		return invoicesText.getText();
	}
	
	public WebElement getNewInvoiceButton()
	{
		return newInvoiceButton;
	}
	
	public void clickNewInvoiceButton()
	{
		newInvoiceButton.click();
	}

}
