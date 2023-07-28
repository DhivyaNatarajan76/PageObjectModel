package pom.formc.pages;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class FormCRegistrationPage extends GenericWrappers {
	
	public FormCRegistrationPage enterUserId(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.UserId.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterConfirmPassword(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickSecurityQuestion()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.SecurityQuestion.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectSecurityQuestion(String data)  
	{
		
		selectVisibleValueByXpath(prop.getProperty("FormCRegistrationPage.SecurityQuestion.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterSecurityAnswer(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterName(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.Name.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickGender()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.Gender.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectGender(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.Gender.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickDOB()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.DOB.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectDOB(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.DOB.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterDesignation(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.Designation.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.Mobile.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterPhoneNo(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.PhoneNo.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickNationality()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.Nationality.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectNationality(String data) 
	{
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.Nationality.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelName(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelName.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelCapacity(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.Capacity.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelAddress(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelAddress.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickState()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.State.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectHotelState(String data)  
	{
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.State.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickCity()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.City.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectCity(String data)
	{
		selectVisibleValueByXpath(prop.getProperty("FormCRegistrationPage.City.XPath"), data);                  
		return this;
	}
	
	public FormCRegistrationPage clickFRRODescription()
	{
	clickByXpath(prop.getProperty("FormCRegistrationPage.FRRODescription.XPath"));
	return this;
	}
	
	public FormCRegistrationPage selectFRRODescription(String data)
	{
	selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.FRRODescription.XPath"),data);
	return this;
	}
	
	
	public FormCRegistrationPage clickAccomadationType()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.AccomadationType.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectAccomadationType(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.AccomadationType.XPath"), data);              
		return this;
	}
	
	public FormCRegistrationPage clickAccomadationGrade()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.AccomadationGrade.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectAccomadationGrade(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("FormCRegistrationPage.AccomadationGrade.XPath"),data);             
		return this;
	}
	
	public FormCRegistrationPage enterHotelEmail(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelEmail.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelMobile(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelMobile.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelPhoneNo(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelPhoneNo.XPath"), data);
		return this;
	}
	
	//Hotel owners details
	
	public FormCRegistrationPage enterHotelOwnerName(String data)
	{
		
		
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerName.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelOwnerAddress(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerAddress.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickHotelOwnerState()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerState.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectHotelOwnerState(String data)   
	{
		selectVisibleValueByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerState.XPath"), data);
		
		return this;
	}
	
	public FormCRegistrationPage clickHotelOwnerCity()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerCity.XPath"));
		return this;
	}
	
	public FormCRegistrationPage selectHotelOwnerCity(String data)  
	{
		selectVisibleValueByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerCity.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelOwnerEmailId(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerEmailId.XPath"), data);
		return this;
	}
	  
	
	public FormCRegistrationPage enterHotelOwnerPhoneNo(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerPhoneNo.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelOwnerMobile(String data)
	{
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelOwnerMobile.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickAddButton()
	{
		clickByXpath(prop.getProperty("FormCRegistrationPage.AddButton.XPath"));
		return this;
	}
	
}
