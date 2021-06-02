package com.sugestar.testCases;

import org.testng.annotations.Test;

import com.sugestar.genaric.library.BaseTest;
import com.sugestar.genaric.library.FileLib;
import com.sugestar.genaric.library.WebDriverCommonLib;
import com.sugestar.pageObjects.Accounts_Page;

import com.sugestar.pageObjects.createNewAccount_page;

public class VerifyOperationCreation extends BaseTest {
@Test
public void VerifyOperationTest() throws Throwable{
	FileLib fb=new FileLib();
	WebDriverCommonLib wb=new WebDriverCommonLib();
	
	//Login To Application and verify
	ValidateLoginTest vl=new ValidateLoginTest(); 
	vl.loginToApp();
	//Click on Account tab and Verify
	Accounts_Page cp=new Accounts_Page();
	cp.AC_click();
	wb.verify(wb.getPageTitle(),fb.readPropData(Prop_Path,"AccountsPageTitle"),"Displaying Custom View Details");
	//sending data and craeting new campaign
	createNewAccount_page na=new createNewAccount_page();
	na.NewAccountM();
	na.Rating_DropDown();
	na.Parent_Name_Look_UP();
	wb.verify(wb.getPageTitle(), fb.readPropData(Prop_Path, "Account_LookUp_Title"),"lookup");
	na.LookUp_Search_Box();
	na.Go_Button();
	
}
}
