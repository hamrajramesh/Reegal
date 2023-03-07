package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class SalesOrdersPage {
	
	@FindBy(xpath="//td[contains(text(),'Sales Orders: ')]") private WebElement salesOrdersText;
	@FindBy(xpath="//input[@value='New Sales Order']") private WebElement newSalesOrderButton;
	
	public SalesOrdersPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getNewSalesOrderButton()
	{
		return newSalesOrderButton;
	}
	
	public void clickNewSalesOrderButton()
	{
		newSalesOrderButton.click();
	}
	
	public WebElement getSalesOrdersText()
	{
		return salesOrdersText;
	}
	
	public String getSalesOrdersTextAddress()
	{
		return salesOrdersText.getText();
	}
	

}
