package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomadationPage extends GenericWrappers {
	
	public AccomadationPage clickMenuIcon()
	{
		clickByXpath(prop.getProperty("Accomadation.MenuIcon.XPath"));
		return new AccomadationPage();
	}
	
	public FTRServicePage clickBookYourCoachTrain()
	{
		clickByXpath(prop.getProperty("Accomadation.BookYourCoach.XPath"));
		return new FTRServicePage();
	}
	
	public CharterPage clickCharter()
	{
		clickByXpath(prop.getProperty("Accomadation.Charter.XPath"));
		return new CharterPage();
	}
	
	public HotelHomePage clickHotelsIcon()
	{
		clickByXpath(prop.getProperty("Accomadation.HotelsIcon.XPath"));
		return new HotelHomePage();
	}
	
	
	public AccomadationPage switchToWindowAccomadPage() {
		switchToLastWindow();
		return new AccomadationPage();
	}

}
