package com.sugestar.testCases;

import org.testng.annotations.Test;

import com.sugestar.genaric.library.BaseTest;
import com.sugestar.genaric.library.FileLib;
import com.sugestar.genaric.library.WebDriverCommonLib;
import com.sugestar.pageObjects.Accounts_Page;
import com.sugestar.pageObjects.Login_page;
import com.sugestar.pageObjects.createNewAccount_page;

public class ValidateLoginTest extends BaseTest {

public void loginToApp () throws Throwable {
	Login_page lg=new Login_page();

//	createNewAccount_page cn=new createNewAccount_page();
	//Login to app and verify
	FileLib fb=new FileLib();
	lg.login(fb.readPropData(Prop_Path,"un"),fb.readPropData(Prop_Path, "pwd"));
	
	WebDriverCommonLib wb=new WebDriverCommonLib();
	wb.verify(wb.getPageTitle(),fb.readPropData(Prop_Path, "homeTitle"),"HomePage");
	 
}
}	
	  

