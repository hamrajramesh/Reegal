package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class AccountDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'Account Name')]/following-sibling::td[1]") private WebElement accountNameText;
	
	
	public AccountDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getAccountNameText()
	{
		return accountNameText;
	}
	
	public String getAccountNameTextAddress()
	{
		return accountNameText.getText();
	}

}
