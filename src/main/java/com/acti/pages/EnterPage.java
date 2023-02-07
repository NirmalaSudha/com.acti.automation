package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Name:EnterTimePage/HomePage
 * Description:
 * Developed by :Shantosh
 * Date:11/23/22
 * Reviewed By: Shantosh
 */

public class EnterPage extends DriverScript{

//	*****************************************Page Elements************************************//

	@FindBy(xpath = "//a[@class='userProfileLink username ']") WebElement usernameText;
	@FindBy(id="logoutLink") WebElement logoutLink;
	@FindBy(xpath = "//a[@class='content tasks']") WebElement taskMenu;
	
//*************************************Page Initialization***************************************//
	
	public EnterPage() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
//*************************************Page Method/Actions************************************************//
	public void TaskMenu()
	{
		taskMenu.click();
	}
	
	public String verifyUserLoggedIn()
	{
		return usernameText.getText();
	}
	
	public String enterPageTitle() 
	{
		return driver.getTitle();
	}
	
	public void clicklogout()
	{
		logoutLink.click();
	}
}
