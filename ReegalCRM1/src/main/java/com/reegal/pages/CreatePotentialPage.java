package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreatePotentialPage {
	
	@FindBy(name="property(Potential Name)") private WebElement potentialNameTextbox;
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accountNameLookupIcon;
	@FindBy(xpath="//img[@title='Campaign Name Lookup']") private WebElement campaignNameLookupIcon;
	@FindBy(xpath="//img[@title='Calendar']") private WebElement calenderIcon;
	@FindBy(name="property(Stage)") private WebElement stageDropdown;
	@FindBy(name="property(Account Name)") private WebElement accountName;
	@FindBy(name="property(Closing Date)") private WebElement closingDate;
	@FindBy(xpath="//td[contains(text(),' Create Potential')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

	public CreatePotentialPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getClosingDate()
	{
		return closingDate;
	}
	
	public void TypeClosingDate(String ClosingDate)
	{
	    closingDate.sendKeys(ClosingDate);
	}
	
	public WebElement getAccountName()
	{
		return accountName;
	}
	
	public void TypeAccountName(String AccountName)
	{
		accountName.sendKeys(AccountName);
	}

	public WebElement getPotentialNameTextbox() 
	{
		return potentialNameTextbox;
	}

	public WebElement getAccountNameLookupIcon() 
	{
		return accountNameLookupIcon;
	}

	public WebElement getCampaignNameLookupIcon() 
	{
		return campaignNameLookupIcon;
	}

	public WebElement getCalenderIcon() 
	{
		return calenderIcon;
	}

	public WebElement getStageDropdown()
	{
		return stageDropdown;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}
	
	public void TypePotentialNameTextbox(String PotentialName)
	{
		potentialNameTextbox.sendKeys(PotentialName);
	}
	
	public void clickAccountNameLookupIcon()
	{
		accountNameLookupIcon.click();
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	public void clickCampaignNameLookupIcon()
	{
		campaignNameLookupIcon.click();
	}
	
	
	public void clickCalenderIcon()
	{
		calenderIcon.click();
	}
	
	public void CreateNewPotential(String PotentialName, String AccountName)
	{
		potentialNameTextbox.sendKeys(PotentialName);
		accountName.sendKeys(AccountName);
		
	
		
	}
	
	
	
	
	
	
	
	
	

}
