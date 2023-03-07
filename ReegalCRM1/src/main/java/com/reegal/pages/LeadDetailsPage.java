package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class LeadDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'Lead Name')]/following-sibling::td") private WebElement leadName;
	
	public LeadDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getLeadNameText()
	{
		return leadName;
	}
	
	public String getLeadNameAddress()
	{
		return leadName.getText();
	}

}
