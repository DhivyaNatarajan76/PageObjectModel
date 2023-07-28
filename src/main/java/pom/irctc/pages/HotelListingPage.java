package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelListingPage extends GenericWrappers{

public HotelDetailsPage clickHotelName()
{
	clickByXpath(prop.getProperty("HomeListingPage.HotelName.XPath"));
	return new HotelDetailsPage();
}



}
