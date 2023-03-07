package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class AccountsPage {
	
	@FindBy(xpath="//td[contains(text(),'Accounts: ')]") private WebElement accountsText;
	@FindBy(xpath="//input[@value='New Account']") private WebElement newAccountButton;
	
     public AccountsPage()
     {
    	 PageFactory.initElements(BaseTest.driver, this);
     }
     
     public WebElement getAccountText()
     {
    	 return accountsText;
     }
     
     public String getAccountTextAddress()
     {
    	 return accountsText.getText();
     }
     
     public WebElement getNewAccountButton()
     {
    	 return newAccountButton;
     }
     
     public void clickNewAccountButton()
     {
    	 newAccountButton.click();
     }
     
     

}
