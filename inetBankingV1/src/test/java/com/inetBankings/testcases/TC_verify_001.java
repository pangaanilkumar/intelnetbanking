package com.inetBankings.testcases;

import org.testng.annotations.Test;

import com.inetBankings.genaric.lib.WebDrivercommonlib;
import com.inetBankings.pageobject.LoginPage;

public class TC_verify_001 {
@Test 
public void login(String expected) {
	LoginPage lg=new LoginPage();
	WebDrivercommonlib wb=new WebDrivercommonlib();
	wb.verify(wb.getTitle(),expected);
}
}
