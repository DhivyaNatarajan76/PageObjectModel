package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Register.XPath"));
		return new RegistrationPage();
	}

	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath(prop.getProperty("HomePage.Holidays.XPath"));
		return  new HomePage();
	}
	
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath(prop.getProperty("HomePage.Stays.XPath"));
		return this;
	}
	
	public AccomadationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.XPath"));
		return new AccomadationPage();
	}
	
	
	
	
	
}
