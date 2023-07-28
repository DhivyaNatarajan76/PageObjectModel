package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRServicePage extends GenericWrappers{
	
	public FTRRegistrationPage clickSignUp()
	{
		clickByXpath(prop.getProperty("FTRRegPage.SignUP.XPath"));
		return new FTRRegistrationPage();
	}

public FTRServicePage switchToWindowAccomadToFTRPage() {
		switchToLastWindow();
		return new FTRServicePage();
}
}