package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class CreateQuotePage {
	
	@FindBy(name="property(Subject)") private WebElement subjectTextbox;
    @FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accountNameLookupIcon;
    @FindBy(xpath="//img[@title='Product Name Lookup']") private WebElement productNameLookupIcon;
    @FindBy(name="property(txtQty1)") private WebElement qtyTextbox;
    @FindBy(name="property(txtListPrice1)") private WebElement listPriceTextbox;
    @FindBy(name="property(Account Name)") private WebElement accountName;
    @FindBy(name="property(hdnProductName1)") private WebElement productName;
    @FindBy(xpath="//img[@title='Calendar']") private WebElement calenderIcon;
    @FindBy(name="property(Quote Stage)") private WebElement quoteStageDropdown;
	@FindBy(xpath="//td[contains(text(),' Create Quote')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

    public CreateQuotePage()
    {
    	
    	PageFactory.initElements(BaseTest.driver,this);
    }
    
    public WebElement getSaveButton()
    {
    	return saveButton;
    }
    
    public void clickSaveButton()
    {
    	saveButton.click();
    }
    
    public WebElement getQuoteStage()
    {
    	return quoteStageDropdown;
    }
    
    public WebElement getCalenderIcon()
    {
    	return calenderIcon;
    }
    
    public void clickCalenderIcon()
    {
    	calenderIcon.click();
    }
    
    public WebElement getProductName()
    {
    	return productName;
    }
    
    public void TypeProductName(String ProductName)
    {
    	productName.sendKeys(ProductName);
    }
    
    public WebElement getAccountName()
    {
    	return accountName;
    }
    
    public void TypeAccountName(String AccountName)
    {
    	accountName.sendKeys(AccountName);
    }
    
    public void TypeListPriceTextbox(String ListPrice)
    {
    	listPriceTextbox.sendKeys(ListPrice);
    }
    
    public void TypeQtyTextbox(String Qty)
    {
    	qtyTextbox.sendKeys(Qty);
    }
    
    public void clickProductNameLookupIcon()
    {
    	productNameLookupIcon.click();
    }
    
    
    public void clickAccountNameLookupIcon()
    {
    	accountNameLookupIcon.click();
    }
    
    public void TypeSubjectTextbox(String Subject) 
    {
    	subjectTextbox.sendKeys(Subject);
    }

	public WebElement getSubjectTextbox() 
	{
		return subjectTextbox;
	}

	public WebElement getAccountNameLookupIcon() 
	{
		return accountNameLookupIcon;
	}

	public WebElement getProductNameLookupIcon() 
	{
		return productNameLookupIcon;
	}

	public WebElement getQtyTextbox() 
	{
		return qtyTextbox;
	}

	public WebElement getListPriceTextbox()
	{
		return listPriceTextbox;
	}
	
	public void CreateNewQuote(String Subject,String Qty,String ListPrice,String ProductName,String AccountName)
	{
		subjectTextbox.sendKeys(Subject);
		qtyTextbox.sendKeys(Qty);
		listPriceTextbox.sendKeys(ListPrice);
		productName.sendKeys(ProductName);
		accountName.sendKeys(AccountName);
	}
    
    
    
    



}   

