package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class AddProductToPriceBooksPage {
	
	
	@FindBy(xpath="//td[contains(text(),'Price Book List')]/ancestor::table/following::table[3]//tr[18]//td[5]") private WebElement listPriceTextbox;
    @FindBy(xpath="//td[contains(text(),'Price Book List')]/ancestor::table/following::table[3]//tr[18]//td[1]") private WebElement checkbox;
    @FindBy(xpath="//input[@value='Add to Price Books ']") private WebElement addToPriceBooksButton;
     public AddProductToPriceBooksPage()
     {
    	 PageFactory.initElements(BaseTest.driver,this);
     }
     
     public WebElement getListPriceTextbox()
     {
    	 return listPriceTextbox;
     }
     
     public void TypeListPriceTextbox(String ListPrice)
     {
    	 listPriceTextbox.sendKeys(ListPrice);
    	 
     }
     
     public WebElement getCheckbox()
     {
    	 return checkbox;
     }
     
     public void clickCheckbox()
     {
    	 checkbox.click();
     }
     
     public WebElement getAddToPriceBooks()
     {
    	 return addToPriceBooksButton;
     }
     
     public void clickAddToPriceBooks()
     {
    	 addToPriceBooksButton.click();
     }
     
     public void AddProductToPriceBooks(String ListPrice )
     {
    	 listPriceTextbox.sendKeys(ListPrice);
    	 checkbox.click();
    	 addToPriceBooksButton.click();
     }


}




