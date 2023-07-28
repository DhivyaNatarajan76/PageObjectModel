package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBook extends GenericWrappers {
	
	public FaceBookRegistrationPage clickCreateNewAccount()
	{
		clickByXpath(prop.getProperty("HomePage.CreateNewAccount.XPath"));
		return new FaceBookRegistrationPage();
	}

	
	
}
