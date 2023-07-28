package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassangerDetailPage extends GenericWrappers {
	String hotelNameHotelListPage,hotelPriceHotelListPage;
	
	public PassangerDetailPage selectTitle(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("PassangerDetailsPage.title.XPath"), data);
		return this;
	}

	public PassangerDetailPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PassangerDetailsPage.FirstName.XPath"), data);
		return this;
	}
	
	public PassangerDetailPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PassangerDetailsPage.LastName.XPath"), data);
		return this;
	}
	
	public PassangerDetailPage selectState(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("PassangerDetailsPage.State.XPath"), data);
		return this;
	}
	
	public PassangerDetailPage enterMobNo(String data)
	{
		enterByXpath(prop.getProperty("PassangerDetailsPage.MobileNo.XPath"), data);
		return this;
	}
	
	public PassangerDetailPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("PassangerDetailsPage.Email.XPath"), data);
		return this;
	}
	
	public PassangerDetailPage selectGST(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("PassangerDetailsPage.GST.XPath"), data);
		return this;
	}
	
	
	public PassangerDetailPage enterGSTNo(String data)
	{
		enterByXpath(prop.getProperty("PassangerDetailsPage.GSTNo.XPath"), data);
		return this;
	}
	
	public PassangerDetailPage enterCompanyName(String data)
	{
		enterByXpath(prop.getProperty("PassangerDetailsPage.CompanyName.XPath"), data);
		return this;
	}
	
	public PassangerDetailPage enterCompanyAddress(String data)
	{
		enterByXpath(prop.getProperty("PassangerDetailsPage.CompanyAddress.XPath"), data);
		return this;
	}
	public PassangerSummary clickContinueButton()
	{
		clickDateByXpath(prop.getProperty("PassangerDetailsPage.Continue.XPath"));
		return new PassangerSummary();
	}
	
	public PassangerDetailPage verifyHotelName( )
	{
		waitProperty(2000);
		hotelNameHotelListPage=HotelDetailsPage.hotelName; 
		
		verifyTextByXpath(prop.getProperty("PassangerDetailsPage.HotelName.XPath"), hotelNameHotelListPage);
		return this;
	}
	
	public PassangerDetailPage verifyHotelPrice()
	{
		hotelPriceHotelListPage=HotelDetailsPage.hotelPrice;
		waitProperty(4000);
		verifyTextByXpath(prop.getProperty("PassangerDetailsPage.HotelPrice.XPath"), hotelPriceHotelListPage);
		return this;
	}
	public PassangerDetailPage clickContinueButtonGSTNO()
	{
		waitProperty(2000);
		clickDateByXpath(prop.getProperty("PassangerDetailsPage.Continue.XPath"));
		//clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
		return this;
	}
	
	
	public PassangerDetailPage verifyGSTNoError(String data)
	{
		//verifyTextByXpath("//span[@class='ERR2' and text()='Please Enter Valid GSt number']", data);
		waitProperty(2000);
		verifyTextByXpath(prop.getProperty("PassangerDetailsPage.GSTError.XPath"),data);
		return this;
	}
	
	public PassangerDetailPage guestUserLogin(String username,String password)
	{
		clickByXpath(prop.getProperty("PassangerDetailsPage.GuestUserLogin.XPath"));
		enterByXpath(prop.getProperty("PassangerDetailsPage.Email.XPath"), username);
		enterByXpath(prop.getProperty("PassangerDetailsPage.MobileNo.XPath"), password);
		clickByXpath(prop.getProperty("PassangerDetailsPage.Login.XPath"));
		waitProperty(2000);
		return this;
	}
	
	public PassangerDetailPage switchToWindowHotelDetailsToPassangerPage() {
		switchToLastWindow();
		return new PassangerDetailPage();
	}
	
}