package com.reegal.Accounts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.reegal.Genriclib.BaseTest;
import com.reegal.Genriclib.FileLib;
import com.reegal.Genriclib.WebDriverCommonLib;
import com.reegal.login.SignIn;
import com.reegal.pages.AccountDetailsPage;
import com.reegal.pages.AccountsPage;
import com.reegal.pages.CreateAccountPage;
import com.reegal.pages.HomePage;

@Listeners(com.reegal.Genriclib.MyListeners.class)
public class VerifyCreateAccountPage extends BaseTest {
	
	
	@Test
	public void newAccountCreationTest() throws Throwable
	{
		SignIn si= new SignIn();
		si.validSigninTest();
		
		HomePage hp= new HomePage();
		hp.clickAccountsTab();
		
		AccountsPage ap= new AccountsPage();
		ap.clickNewAccountButton();
		
		WebDriverCommonLib wlib= new WebDriverCommonLib();
		FileLib flib= new FileLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "CreateAccountTitle"));
		wlib.verify(wlib.getPageTitle(), 
				flib.readPropertyData(PROP_PATH, "CreateAccountTitle"),
				"Create Account Page");
		
		
		
		
		
		CreateAccountPage cap= new CreateAccountPage();
	
		String AccountName=flib.readExcelData(EXCEL_PATH, "Accounts", 0, 1);
		
	    wlib.selectOption(cap.getRatingDropdown(), "Active");
	    wlib.selectOption(cap.getOwnershipDropdown(), "Private");
	    
	    cap.createNewAccount(AccountName);
	    
	    
	    AccountDetailsPage adp= new AccountDetailsPage();
	    wlib.verify(adp.getAccountNameTextAddress(), 
	    		flib.readExcelData(EXCEL_PATH, "Accounts", 0, 1),
	    		"Account Name Text");
		
		
		
		
	}
	
	
	

}
