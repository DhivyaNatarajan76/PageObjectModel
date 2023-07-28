package pom.facebook.pages;


import java.util.Properties;

import wrappers.GenericWrappers;

public class FaceBookRegistrationPage extends GenericWrappers {
	
	public FaceBookRegistrationPage enterFirstName(String data)
	{
		
		enterByXpath(prop.getProperty("SignUPage.FirstName.Xpath"), data);
		return this;
	}
	
	public FaceBookRegistrationPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("SignUPage.LastName.Xpath"), data);
		return this;
	}
	
	public FaceBookRegistrationPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("SignUPage.Email.Xpath"), data);
		return this;
	}
	public FaceBookRegistrationPage enterConfirmEmail(String data)
	{
		enterByXpath(prop.getProperty("SignUPage.ConfirmationEmail.Xpath"), data);
		return this;
	}
	
	
	public FaceBookRegistrationPage enterPassword (String data)
	{
		enterByXpath(prop.getProperty("SignUPage.Password.Xpath"), data);
		return this;
	}
	
	
	public FaceBookRegistrationPage selectDay(String data)
	
	{
		selectVisibleTextByXpath(prop.getProperty("SignUPage.Day.Xpath"),data);
		
		return this;
	}
	
	public FaceBookRegistrationPage selectMonth(String data)
	
	{
		selectVisibleTextByXpath(prop.getProperty("SignUPage.Month.Xpath"),data);
		
		return this;
	}
	
public FaceBookRegistrationPage selectYear(String data)
	
	{
		selectVisibleTextByXpath(prop.getProperty("SignUPage.Year.Xpath"),data);
		
		return this;
	}
	
	public FaceBookRegistrationPage clickFemaleGender()
	{
		clickByXpath(prop.getProperty("SignUPage.FeMaleGender.Xpath"));
		return this;
	}
	
	public FaceBookRegistrationPage clickMaleGender()
	{
		clickByXpath(prop.getProperty("SignUPage.MaleGender.Xpath"));
		return this;
	}
	
	public FaceBookRegistrationPage clickCustomGender()
	{
		clickByXpath(prop.getProperty("SignUPage.CustomGender.Xpath"));
		return this;
	}
	
	public FaceBookRegistrationPage clickSignUp()
	{
		clickByXpath(prop.getProperty("SignUPage.SignUPButton.Xpath"));
		return this;
	}
}
