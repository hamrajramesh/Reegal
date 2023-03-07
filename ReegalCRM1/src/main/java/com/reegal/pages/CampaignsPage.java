package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CampaignsPage {
	
	@FindBy(xpath="//td[contains(text(),'Campaigns: ')]") private WebElement campaignsText;
	@FindBy(xpath="//input[@value='New Campaign']") private WebElement newCampaignButton;
	public CampaignsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getCampaignsTextAddress()
	{
		return campaignsText;
	}
	
	public String getCampaignsText()
	{
	    return campaignsText.getText();
	}
	
	public WebElement getNewCampaignButton()
	{
		return newCampaignButton;
	}
	
	public void clickNewCampaignButton()
	{
		newCampaignButton.click();
	}
	
	
	
	

}
