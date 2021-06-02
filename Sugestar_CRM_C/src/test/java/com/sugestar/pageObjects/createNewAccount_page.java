package com.sugestar.pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sugestar.genaric.library.BaseTest;
import com.sugestar.genaric.library.FileLib;
import com.sugestar.genaric.library.WebDriverCommonLib;

public class createNewAccount_page extends BaseTest{
	FileLib fb=new FileLib();
	WebDriverCommonLib wbc=new WebDriverCommonLib();
	@FindBy(xpath="//input[@value=\"New Account\"]") private WebElement NewAccount;
	@FindBy(xpath="//input[@name=\"property(Account Name)\"]") private WebElement Account_Name;
	@FindBy(name="property(Rating)") private WebElement Ratting_DropDown;
	@FindBy(name="property(Phone)") private WebElement Phone_Number;
	@FindBy(name="property(Account Site)") private WebElement Account_Site;
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement Parent_Name_Look_UP;
	@FindBy(xpath="//input[@name='fldValue']")private WebElement LookUp_Search_Box;
	@FindBy (xpath="//input[@name=\"Submit\"]")private WebElement Go_button;
	//@FindBy(Xpath=[onclick="setValue(unescape('hp'),'2103')")private WebElement hp_look;
	/**
	 * @return the Creat newAccount
	 * 
	 */
	public createNewAccount_page() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getNewAccount() {
		return NewAccount;
	}
	
	/**
	 * @return the account_Name
	 */
	public WebElement getAccount_Name() {
		return Account_Name;
	}

	
	/**
	 * @return the ratting_DropDown
	 */
	public WebElement getRatting_DropDown() {
		return Ratting_DropDown;
	}

	
	
	/**
	 * @return the phone_Number
	 */
	public WebElement getPhone_Number() {
		return Phone_Number;
	}


	/**
	 * @return the parent_Name_Look_UP
	 */
	public WebElement getParent_Name_Look_UP() {
		return Parent_Name_Look_UP;
	}


	/**
	 * @return the go_button
	 */
	public WebElement getGo_button() {
		return Go_button;
	}

	/**
	 * @param go_button the go_button to set
	 */
	public void setGo_button(WebElement go_button) {
		Go_button = go_button;
	}

	public void Rating_DropDown() throws Throwable {
		Select se=new Select(Ratting_DropDown);
		se.selectByIndex(3);
		se.selectByValue(fb.readPropData(Prop_Path, "value"));
		System.out.println("Ratting DropDown a multiple selectar"+se.isMultiple());
	}

	public void NewAccountM() throws Throwable {
		NewAccount.click();
		Account_Name.sendKeys(fb.readPropData(Prop_Path, "AC_Name"));
		Phone_Number.sendKeys(fb.readPropData(Prop_Path, "Phone_Number"));
		Account_Site.sendKeys(fb.readPropData(Prop_Path, "site"));
			
	}
	public void Parent_Name_Look_UP() {
		Parent_Name_Look_UP.click();
		Set<String> windows=driver.getWindowHandles(); 
		String parent = driver.getWindowHandle();
		Iterator<String> it = windows.iterator(); 
		String child=null; //This is for referencing specific child window 
		while(it.hasNext()){ 
		child=(String)it.next(); 
		driver.switchTo().window(child); 
		//perform action that you want to perform on child window 
		} 
	}
	public void LookUp_Search_Box() throws Throwable  {
		LookUp_Search_Box.sendKeys(fb.readPropData(Prop_Path, "Text"));
	}
	public void Go_Button() {
		Go_button.click();
	}

}
