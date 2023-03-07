package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreateAccountPage {
	
	@FindBy(name="property(Account Name)") private WebElement accountNameTextbox;
	@FindBy(name="property(Rating)") private WebElement ratingDropdown;
	@FindBy(name="property(Ownership)") private WebElement ownershipDropdown;
	@FindBy(xpath="//td[contains(text(),' Create Account')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

	
	public CreateAccountPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getAccountNameTextbox()
	{
	    return accountNameTextbox;
	}
	
	public void TypeAccountNameTextbox(String AccountName)
	{
		accountNameTextbox.sendKeys(AccountName);
	}
	
	public WebElement getRatingDropdown()
	{
		return ratingDropdown;
	}
	
	public WebElement getOwnershipDropdown()
	{
		return ownershipDropdown;
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	public void createNewAccount(String AccountName)
	{
		
		accountNameTextbox.sendKeys(AccountName);
		saveButton.click();
		
	}
	
	
	

}
