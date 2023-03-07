package com.reegal.Contacts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.reegal.Genriclib.BaseTest;
import com.reegal.login.SignIn;
import com.reegal.pages.ContactsPage;
import com.reegal.pages.CreateContactPage;
import com.reegal.pages.HomePage;

public class VerifyLookupIcons extends BaseTest {
	
	
	
	public void lookupIconsVerification() throws Throwable
	{
		SignIn si= new SignIn();
		si.validSigninTest();
		
		HomePage hp= new HomePage();
		hp.clickContactsTab();
		
		ContactsPage cp= new ContactsPage();
		cp.clickNewContactButton();
		
	     CreateContactPage ccp= new CreateContactPage();
	     ccp.clickAccountNameLookup();
	  
	    	 
	    	 Set<String> windowhandles=driver.getWindowHandles();
	    	 System.out.println(windowhandles);
	    	 
	    	Iterator<String> iterator= windowhandles.iterator();
            String parentwindow= iterator.next();
            String childwindow= iterator.next();
            driver.switchTo().window(childwindow);
            
    		 driver.findElement(By.xpath("//table[*]//tr[8]//td[1]"));
    		 
    		 
	    	 
	    	 
	    	 
	      
	     
	     

	     
	     
	     
	     
	     
	    
	}

}
