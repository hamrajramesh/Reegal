package com.reegal.Contacts;

import org.testng.annotations.Test;

import com.reegal.Genriclib.BaseTest;
import com.reegal.Genriclib.WebDriverCommonLib;
import com.reegal.login.SignIn;
import com.reegal.pages.ContactsPage;
import com.reegal.pages.HomePage;

//enter the url and verify login page
public class VerifyContactsTab extends BaseTest {
	
	
	public void contactsTabVerification() throws Throwable
	{
		//verify home page
		SignIn si= new SignIn();
		si.validSigninTest();
		
		HomePage hp= new HomePage();
		hp.clickContactsTab();
		
		//verify contacts page
		WebDriverCommonLib wlib= new WebDriverCommonLib();
		ContactsPage cp= new ContactsPage();
		wlib.elementDisplayed(cp.getContactsText(), "Contacts Text");
		
	
		
		
	}
	
	

}
