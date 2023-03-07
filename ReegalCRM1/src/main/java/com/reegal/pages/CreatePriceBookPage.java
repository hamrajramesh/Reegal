package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreatePriceBookPage {
	
	@FindBy(name="property(Price Book Name)") private WebElement priceBookNameTextbox;
	@FindBy(xpath="//td[contains(text(),' Create Price Book')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

    public CreatePriceBookPage()
    {
    	PageFactory.initElements(BaseTest.driver,this);
    }
    
    public WebElement getPriceBookName()
    {
    	return priceBookNameTextbox;
    }
    
    public void TypePriceBookNameTextbox(String PriceBookName)
    {
    	priceBookNameTextbox.sendKeys(PriceBookName);
    }
    
    public WebElement getSaveButton()
    {
    	return saveButton;
    }
    
    public void clickSaveButton()
    {
    	saveButton.click();
    }
    
    public void NewPriceBook(String PriceBookName)
    {
    	
    	priceBookNameTextbox.sendKeys(PriceBookName);
      	saveButton.click();
    }

}
