package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class PurchaseOrdersPage {
	
	
	@FindBy(xpath="//td[contains(text(),'Purchase Orders: ')]") private WebElement purchaseOrdersText;
    @FindBy(xpath="//input[@value='New Purchase Order']") private WebElement newPurchaseOrderButton;//Encapsulation
    
    public PurchaseOrdersPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    public WebElement getPurchaseOrderText()  //Getters Method
    {
    	return purchaseOrdersText;
    }
    
    public String getPurchaseOrderTextAddress()   //Setters Method
    {
    	return purchaseOrdersText.getText();
    }
    
    public WebElement getNewPurchaseOrderButton()
    {
    	return newPurchaseOrderButton;
    }
    
    public void clickNewPurchaseOrderButton()
    {
    	newPurchaseOrderButton.click();
    }
    
    
    
    
}
