package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	static int selectionDate;
	public CharterPage clickEnquiryForm()
	{
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.XPath"));
		return this;
	}
	
	public CharterPage enterName(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Name.XPath"),data);
		return this;
	}
	

	public CharterPage enterOrganisation(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Organization.XPath"),data);
		return this;
	}
	
	public CharterPage enterAddress(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Address.XPath"),data);
		return this;
	}

	public CharterPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Mobile.XPath"),data);
		return this;
	}
	
	public CharterPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Email.XPath"), data);
		return this;
	}
	public CharterPage clickMenuArrow()
	{
		clickByXpath(prop.getProperty("CharterPage.MenuArroe.XPath"));
		return this;
	}
	
	public CharterPage clickRequestFor()
	{
		clickByXpath(prop.getProperty("CharterPage.RequestFor.XPath"));
		return this;
	}
	public CharterPage selectRequestFor(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("CharterPage.RequestFor.XPath"),data);
		return this;
	}
	public CharterPage enterPurpose(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.CharterPurpose.XPath"),data);
		return this;
	}
	
	public CharterPage enterOrginStation(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.OrginStation.XPath"),data);
		return this;
	}
	
	public CharterPage enterDestStation(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.DestStation.XPath"),data);
		return this;
	}
	
	public CharterPage clickDepartureDate()
	{
		clickByXpath(prop.getProperty("CharterPage.DepartureDate.XPath"));
		return this;
	}
	
	public int getDate(int data)
	{
		waitProperty(3000);
	return	getCurrentDay(data);
		}
	
	
	public CharterPage selectDate(String adddays) 
	{
		
		clickByXpath(prop.getProperty("CharterPage.SelectDate.XPath"),adddays);
		
		return this;
	}
	

	
	public CharterPage clickArrivalDate()
	{
		clickByXpath(prop.getProperty("CharterPage.ArrivalDate.XPath"));
		return this;
	}
	
	
	public CharterPage selectArrivalDate(String data) 
	{
		
		clickByXpath(prop.getProperty("CharterPage.SelectArrivalDate.XPath"), data);
		
		
		return this;
	}
	
	public CharterPage enterNoOfDays(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Duration.XPath"),data);
		return this;
	}
	
	public CharterPage enterNoOfCoaches(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Coach.XPath"),data);
		return this;
	}
	
	
		
	public CharterPage enterNoOfPassengers(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.NoOfPassanger.XPath"),data);
		return this;
	}
	public CharterPage enterAddServices(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.Services.XPath"),data);
		return this;
	}
	
	public CharterPage clickSubmitButton()
	{
		clickByXpath(prop.getProperty("CharterPage.Submit.XPath"));
		return this;
	}
	
	public CharterPage verifyMobNoError(String data)
	{
		enterByXpath(prop.getProperty("CharterPage.MobNoError.XPath"),data);
		return this;
	}
	
	
	public CharterPage switchToWindowCharterPage() {
		switchToLastWindow();
		return new CharterPage();
}
	
	public CharterPage PageDown() {
		keysPageDownActionByXpath(prop.getProperty("CharterPage.PageKeys.XPath"));
		return new CharterPage();
}
}