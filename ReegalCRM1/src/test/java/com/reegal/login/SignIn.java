package com.reegal.login;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.reegal.Genriclib.BaseTest;
import com.reegal.Genriclib.FileLib;
import com.reegal.Genriclib.WebDriverCommonLib;
import com.reegal.pages.SigninPage;

@Listeners(com.reegal.Genriclib.MyListeners.class)
public class SignIn extends BaseTest {
	
  @Test
	public void validSigninTest() throws Throwable {
		
		//open the browser
		//Enter the test URL
		//Verify LoginPage is Displayed
	    FileLib flib=new FileLib();
		//Login to App
		SigninPage sp=new SigninPage();
		
		sp.login(flib.readPropertyData(PROP_PATH, "username"),
	             flib.readPropertyData(PROP_PATH, "password"));
		
		//Verify Home Page is Displayed
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(wlib.getPageTitle(), 
				flib.readPropertyData(PROP_PATH, "homeTitle"),
				"Home Page");
	}

}
