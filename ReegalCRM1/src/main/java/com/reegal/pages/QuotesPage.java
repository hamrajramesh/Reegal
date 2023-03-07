package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class QuotesPage {
	
	@FindBy(xpath="//td[contains(text(),'Quotes: ')]") private WebElement quotesText;
    @FindBy(xpath="//input[@value='New Quote']") private WebElement newQuoteButton;
    
    public QuotesPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    public WebElement getQuotesText()
    {
    	return quotesText;
    }
    
    public String clickQuotesTextAddress()
    {
    	return quotesText.getText();
    }
    
    public WebElement getNewQuoteButton()
    {
    	return newQuoteButton;
    }
    
    public void clickNewQuoteButton()
    {
    	newQuoteButton.click();
    }
    
}
