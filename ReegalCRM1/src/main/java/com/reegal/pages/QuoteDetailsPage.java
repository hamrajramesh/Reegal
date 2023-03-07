package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class QuoteDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'Subject')]//following-sibling::td[1]") private WebElement subjectText;
	
	public QuoteDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public WebElement getSubjectText()
	{
		return subjectText;
	}
	
	public String getSubjectTextAddress()
	{
		return subjectText.getText();
	}

}
