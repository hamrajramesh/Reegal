package com.reegal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reegal.Genriclib.BaseTest;

public class HomePage {
	
	
	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignsTab;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement contactsTab;
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath="//a[text()='Potentials']") private WebElement potentialsTab;
	@FindBy(xpath="//a[text()='Products']") private WebElement productsTab;
	@FindBy(id="scrollright") private WebElement scrollRightButton;
	@FindBy(xpath="//a[text()='Price Books']") private WebElement priceBooksTab;
	@FindBy(xpath="//a[text()='Quotes']") private WebElement quotesTab;
	@FindBy(xpath="//a[text()='Purchase Orders']") private WebElement purchaseOrderTab;
	@FindBy(xpath="//a[text()='Sales Orders']") private WebElement salesOrdersTab;
	@FindBy(xpath="//a[text()='Invoices']") private WebElement invoicesTab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public WebElement getInvoicesTab()
	{
		return invoicesTab;
	}
	
	public void clickInvoicesTab()
	{
		invoicesTab.click();
	}
	
	public WebElement getSalesOrdersTab()
	{
		return salesOrdersTab;
	}
	
	public void clickSalesOrdersTab()
	{
		salesOrdersTab.click();
	}
	
	public WebElement getPurchaseOrderTab()
	{
		return purchaseOrderTab;
	}
	
	public void clickPurchaseOrderTab()
	{
		purchaseOrderTab.click();
	}
	
	public WebElement getQuotesTab()
	{
		return quotesTab;
	}
	
	public void clickQuotesTab()
	{
		quotesTab.click();
	}
	
	public WebElement getScrollRightButton()
	{
		return scrollRightButton;
	}
	
	public void clickScrollRightButton()
	{
		scrollRightButton.click();
	}
	
	public WebElement getPriceBooksTab()
	{
		return priceBooksTab;
	}
	
	public void clickPriceBooksTab()
	{
		priceBooksTab.click();
	}
	
	
	public WebElement getLeadsTab() 
	{
		return leadsTab;
	}
	
	public void clickLeadsTab()
	{
		leadsTab.click();
	}
	
	public WebElement getCampaignsTab()
	{
		return campaignsTab;
	}
	
	public void clickCampaignsTab()
	{
		campaignsTab.click();
	}
	
	public WebElement getContactsTab()
	{
		return contactsTab;
	}
	
	public void clickContactsTab()
	{
		contactsTab.click();
	}
	
	public WebElement getAccountsTab()
	{
		return accountsTab;
	}
	
	public void clickAccountsTab()
	{
		accountsTab.click();
	}
	
	public WebElement getPotentialsTab()
	{
		return potentialsTab;
		
	}
	
	public void clickPotentialsTab()
	{
		potentialsTab.click();
    }
	
	public WebElement getProductsTab()
	{
		return productsTab;
	}
	
	public void clickProductsTab()
	{
		productsTab.click();
	}
	
	public void clickInvoiceElement()
	{
		for(int i=0;i<=60;i++)
		{
			if(getInvoicesTab().isDisplayed())
			{
				clickInvoicesTab();
				break;
			}
			else
			{
				clickScrollRightButton();
			}
		}
	}
	
	public void clickSalesOrderElement()
	{
		for(int i=0;i<=60;i++)
		{
			if(getSalesOrdersTab().isDisplayed())
			{
				clickSalesOrdersTab();
				break;
			}
			else
			{
				clickScrollRightButton();
			}
		}
	}
	
	public void clickPurchaseOrderElement()
	{
		for(int i=0;i<=40;i++)
		{
			if(getPurchaseOrderTab().isDisplayed())
			{
				clickPurchaseOrderTab();
				break;
			}
			else
			{
				clickScrollRightButton();

			}
		}
	}
	
	
	public void clickPriceBooksElement()
	{
		for(int i=0;i<=20;i++)
		{
			if(getPriceBooksTab().isDisplayed())
			{
				clickPriceBooksTab();
				break;
			}
			else
			{
				clickScrollRightButton();
			}
		}
	}
	
	public void ClickQuotesElement()
	{
		for(int i=0;i<=20;i++)
		{
			if(getQuotesTab().isDisplayed())
			{
				clickQuotesTab();
				break;
			}
			else
			{
				clickScrollRightButton();
			}
		}
	}
	


	
	
	
	
	
	
	
	
}
