package com.sugestar.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.sugestar.genaric.library.BaseTest;
import com.sugestar.genaric.library.FileLib;
import com.sugestar.genaric.library.WebDriverCommonLib;


	public class Login_page  extends BaseTest{
		@FindBy(id="userName")private WebElement untb;
		@FindBy(id="passWord")private WebElement pwtb;
		@FindBy(xpath="//input[@title='Sign In']")private WebElement signbtn;
		//Intilization
		public Login_page() {
			PageFactory.initElements(BaseTest.driver,this);
		}
		
		public WebElement getUntb(){
			return untb;
		}
		
		public WebElement getPwtb() {
			return pwtb;
		}
		
		public WebElement getLoginBtn() {
			return signbtn;
		}
		
		public void login(String un, String pwd)
		{
			untb.sendKeys(un);
			pwtb.sendKeys(pwd);
			signbtn.click();
		}
		

		
		
		

	

}

