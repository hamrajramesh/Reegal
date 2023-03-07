package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreateLeadPage {
	
	@FindBy(name="property(Company)") private WebElement companyName;
	@FindBy(name="property(Last Name)") private WebElement lastName;
	@FindBy(name="property(First Name)") private WebElement firstName;
	@FindBy(name="property(Lead Source)") private WebElement leadSourceDropdown;
	@FindBy(name="property(Industry)") private WebElement industryDropdown;
	@FindBy(xpath="//img[@title='Campaign Name Lookup']") private WebElement campaignNameLookupIcon;
	@FindBy(xpath="//table[10]//input[@value='Save']") private WebElement saveButton;
	
	public CreateLeadPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCompanyName() 
	{
		return companyName;
	}

	public WebElement getLastName() 
	{
		return lastName;
	}

	public WebElement getFirstName() 
	{
		return firstName;
	}
	
	public void TypeCompanyName(String CompanyName)
	{
		companyName.sendKeys(CompanyName);
	}
	
	public void TypeLastName(String LastName)
	{
		lastName.sendKeys(LastName);
	}
	
	public void TypeFirstName(String FirstName)
	{
		firstName.sendKeys(FirstName);
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
    public WebElement getLeadSource()
    {
    	return leadSourceDropdown;
    }
    
    public WebElement getIndustry()
    {
    	return industryDropdown;
    }
    
    public WebElement getCampaignNameLookupIcon()
    {
    	return campaignNameLookupIcon;
    }
    
    public void clickCampaignNameLookupIcon()
    {
    	campaignNameLookupIcon.click();
    }
	
	public void CreateNewLead(String CompanyName,String LastName,String FirstName)
	{
		companyName.sendKeys(CompanyName);
		lastName.sendKeys(LastName);
		firstName.sendKeys(FirstName);
		
	}
	
	

}
