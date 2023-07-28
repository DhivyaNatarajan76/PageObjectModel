package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers{
	static String hotelName,hotelPrice;
	public PassangerDetailPage clickonContinueToBook()
	{
		clickByXpath(prop.getProperty("HomeDetailsPage.ContinueToBook.XPath"));
		return new PassangerDetailPage();
	}
	
	public HotelDetailsPage getHotelName()
	{
		hotelName= getTextByXpath(prop.getProperty("HomeDetailsPage.HotelName.XPath"));
		return this;
	}

	public HotelDetailsPage getHotelPrice()
	{
		waitProperty(2000);
		 hotelPrice=getTextByXpath(prop.getProperty("HomeDetailsPage.HotelPrice.XPath"));
		 return this;
	}

	public HotelDetailsPage switchToWindowfromHotelListtoDetailsPage() {
	switchToLastWindow();
	return new HotelDetailsPage();
}
	



}
