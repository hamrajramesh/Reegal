package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class ContactDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'Contact Name')]/following-sibling::td") private WebElement contactNameText;
	
	public ContactDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getContactNameText()
	{
		return contactNameText;
	}
	
	public String getContactNameTextAddress()
	{
		return contactNameText.getText();
	}

}
