package com.reegal.Contacts;

import org.testng.annotations.Test;

import com.reegal.Genriclib.BaseTest;
import com.reegal.Genriclib.FileLib;
import com.reegal.Genriclib.WebDriverCommonLib;
import com.reegal.login.SignIn;
import com.reegal.pages.ContactDetailsPage;
import com.reegal.pages.ContactsPage;
import com.reegal.pages.CreateContactPage;
import com.reegal.pages.HomePage;


//enter the url and verify login page
public class VerifyCreateContactPage extends BaseTest {
	
	@Test
	public void newContactCreation() throws Throwable
	{
		//verify home page
		SignIn si= new SignIn();
		si.validSigninTest();
		
	    HomePage hp= new HomePage();
	    hp.clickContactsTab();
	    
	    ContactsPage cp= new ContactsPage();
	    cp.clickNewContactButton();
	   
	    WebDriverCommonLib wlib= new WebDriverCommonLib();
	    FileLib flib= new FileLib();
	    
	    //verify Create Contact Page
	    wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "CreateContactTitle"));
	    wlib.verify(wlib.getPageTitle(), 
	    		flib.readPropertyData(PROP_PATH, "CreateContactTitle"), 
	    		"Create Contact Page");
	    
	  
	
	    CreateContactPage ccp= new CreateContactPage();
	    String LastName=flib.readExcelData(EXCEL_PATH, "Contacts", 0, 1);
	    String FirstName=flib.readExcelData(EXCEL_PATH, "Contacts", 1, 1);
	    
	    wlib.selectOption(ccp.getLeadSource(), "Trade Show");
	     ccp.createNewContact(LastName, FirstName);
	     
	     //verify contact details Page
	     ContactDetailsPage cdp= new ContactDetailsPage();
	     wlib.verify(cdp.getContactNameTextAddress(), 
	    		 flib.readExcelData(EXCEL_PATH, "Contacts", 2, 1), 
	    		 "Contact Name Text");
	     
	     
	    
	    
	    
	    
	    
		
		
	}

}
