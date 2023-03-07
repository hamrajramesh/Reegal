package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreateCampaignPage {
	
	@FindBy(name="property(Campaign Name)") private WebElement campaignNameTextField;
	@FindBy(name="property(Start Date)") private WebElement startDateTextField;
	@FindBy(name="property(Type)") private WebElement TypeDropdown;
	@FindBy(xpath="//td[contains(text(),' Create Campaign')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;
	
	         
 	public CreateCampaignPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getCampaignName()
	{
		return campaignNameTextField;
	}
	
	public void TypeCampaignName(String CampaignName )
	{
		campaignNameTextField.sendKeys(CampaignName);
	}
	
	public WebElement getStartDate()
	{
		return startDateTextField;
	}
	
	public void TypeStartDate(String StartDate)
	{
		startDateTextField.sendKeys(StartDate);
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	

	

	
	
	
	public void CreateNewCampaign(String CampaignName,String StartDate)
	{
		campaignNameTextField.sendKeys(CampaignName);
		startDateTextField.sendKeys(StartDate);
		
		
		

	}
	
	

}
