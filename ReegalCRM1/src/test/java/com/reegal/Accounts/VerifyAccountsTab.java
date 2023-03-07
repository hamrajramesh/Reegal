package com.reegal.Accounts;

import org.testng.annotations.Test;

import com.reegal.Genriclib.BaseTest;
import com.reegal.Genriclib.WebDriverCommonLib;
import com.reegal.login.SignIn;
import com.reegal.pages.AccountsPage;
import com.reegal.pages.HomePage;

public class VerifyAccountsTab extends BaseTest {
	
	
	public void accountsTabVerification() throws Throwable
	{
		
		SignIn si= new SignIn();
		si.validSigninTest();
		
		HomePage hp= new HomePage();
		hp.clickAccountsTab();
		
		WebDriverCommonLib wlib= new WebDriverCommonLib();
		AccountsPage ap= new AccountsPage();
		wlib.elementDisplayed(ap.getAccountText(), "Accounts Text");
		
		
		
		
	}

}
