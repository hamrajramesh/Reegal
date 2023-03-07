package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class ContactsPage {
	
	@FindBy(xpath="//td[contains(text(),'Contacts: ')]") private WebElement contactsText;
    @FindBy(xpath="//input[@value='New Contact']") private WebElement newContactbutton;
	
	public ContactsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getContactsText()
	{
		return contactsText;
	}
	
	public String  getContactsTextAddress()
	{
		return contactsText.getText();
	}
	
	public WebElement getNewContactButton()
	{
		return newContactbutton;
	}
	
	public void clickNewContactButton()
	{
		newContactbutton.click();
	}
}
