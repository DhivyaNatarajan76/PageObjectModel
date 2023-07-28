package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelHomePage extends GenericWrappers{
	
	public HotelHomePage clickLoginIcon()
	{
		clickByXpath(prop.getProperty("HotelHomePage.Login.XPath"));
		return this;
	}
	
	public HotelHomePage clickGuestUserLogin()
	{
		clickByXpath(prop.getProperty("HotelHomePage.GuestUserLogin.XPath"));
		return this;
	}
	
	public HotelHomePage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("HotelHomePage.Email.XPath"),data);
		return this;
	}
	
	public HotelHomePage enterMobileNo(String data)
	{
		enterByXpath(prop.getProperty("HotelHomePage.MobNo.XPath"),data);
		return this;
	}
	
	public FindHotelPage clickLoginButton()
	{
		clickByXpath(prop.getProperty("HotelHomePage.LoginButton.XPath"));
		return new FindHotelPage();
	}
	
	


}
