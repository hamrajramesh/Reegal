package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class ContactsLookupPage {
	
	@FindBy(xpath="//a[text()='QSpiders Bull Temple']") private WebElement qspidersBullTempleText;

	
	public ContactsLookupPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getQspidersBullTempleText()
	{
		return qspidersBullTempleText;
	}
	
	public void clickQspidersBullTempleText()
	{
		qspidersBullTempleText.click();
	}
	
	
	
}
