package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class PotentialDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'Potential Name')]//following-sibling::td[1]") private WebElement potentialNameText;
    
	public PotentialDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	
	public WebElement getPotentialNameText()
	{
		return potentialNameText;
		
	}
	
	public String getPotentialNameTextAddress()
	{
		return potentialNameText.getText();
	}
	
	
	
}
