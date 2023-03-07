package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreateContactPage {
	
	@FindBy(name="property(Last Name)") private WebElement lastNameTextfield;
	@FindBy(name="property(First Name)") private WebElement firstNameTextfield;
	@FindBy(name="property(Lead Source)") private WebElement leadSourceDropdown;
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accountNameLookupIcon;
	@FindBy(xpath="//td[contains(text(),' Create Contact')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;
	public CreateContactPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getLastName()
	{
		return lastNameTextfield;
	}
	
	public void TypeLastName(String LastName)
	{
		lastNameTextfield.sendKeys(LastName);
	}
	
	public WebElement getFirstName()
	{
		return firstNameTextfield;
	}
	
	public void TypeFirstName(String FirstName)
	{
		firstNameTextfield.sendKeys(FirstName);
	}
	
	public WebElement getLeadSource()
	{
		return leadSourceDropdown;
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
		
	}
	
	public WebElement getAccountNameLookup()
	{
		return accountNameLookupIcon;
	}
	
	public void clickAccountNameLookup()
	{
		accountNameLookupIcon.click();
	}
	
	public void createNewContact(String LastName, String FirstName )
	{
		lastNameTextfield.sendKeys(LastName);
		firstNameTextfield.sendKeys(FirstName);
		saveButton.click();
	}
	
	
	
	
	

}
