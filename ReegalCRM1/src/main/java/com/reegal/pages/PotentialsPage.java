package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class PotentialsPage {
	
	@FindBy(xpath="//td[contains(text(),'Potentials: ')]") private WebElement potentialsText;
	@FindBy(xpath="//input[@value='New Potential']") private WebElement newPotentialButton;
	
	public PotentialsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getPotentialsText()
	{
		return potentialsText;
		
	}
	
	public String getPotentialsTextAddress()
	{
		return potentialsText.getText();
	}
	
	public WebElement getNewPotentialButton()
	{
		return newPotentialButton;
	}
	
	public void clickNewPotentialButton()
	{
		newPotentialButton.click();
	}

}
