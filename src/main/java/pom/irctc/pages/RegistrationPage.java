
package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegPage.UserName.XPath"), data);
		return this; 
	}
	
	public RegistrationPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("RegPage.Password.XPath"), data);
		return this;
	}

	public RegistrationPage enterConfirmPassword(String data)
	{
		enterByXpath(prop.getProperty("RegPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public RegistrationPage  clickPreferredLaunguage()
	{
		clickByXpath(prop.getProperty("RegPage.Language.XPath"));
		return this;
	}
	
	public RegistrationPage selectPreferredLaunguage()
	{
		clickByXpath(prop.getProperty("RegPage.SelectLanguage.XPath"));
		//selectVisibleTextByXpath("//span[text()='Preferred Language']", data);
		return this;
	}
	
	public RegistrationPage  clickSecurityQuestion()
	{
		clickByXpath(prop.getProperty("RegPage.SecurityQuestion.XPath"));
		clickByXpath(prop.getProperty("RegPage.SelectSecurityQuestion.XPath"));
		return this;
	}
	
	/*
	 * public RegistrationPage selectSecurityQuestion(String data)
	 * 
	 * { selectVisibleTextByXpath("//span[text()='Security Question']", data);
	 * return this;
	 * }
	 */



	public RegistrationPage enterSecurityAnswer(String data) 
	{
		
		enterByXpath(prop.getProperty("RegPage.SecurityAnswer.XPath"),data);
		
		return this;
	}
	
	public RegistrationPage clickContinueButton()
	{
		clickByXpath(prop.getProperty("RegPage.Continue.XPath"));
		return this;
	}
	
	public RegistrationPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("RegPage.FirstName.XPath"),data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data)
	{
		enterByXpath(prop.getProperty("RegPage.MiddleName.XPath"),data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("RegPage.LastName.XPath"),data);
		return this;
	}
	
	public RegistrationPage clickOccupation()
	{
		clickByXpath(prop.getProperty("RegPage.Occupation.XPath"));
		clickByXpath(prop.getProperty("RegPage.SelectOccupation.XPath"));
		return this;
		
	}
	
	/*
	 * public RegistrationPage selectOccupation(String data) {
	 * selectVisibleTextByXpath("//span[contains(text(),'Select Occupation')]",data)
	 * ; return this; }
	 */
	public RegistrationPage clickDOB()      
	{
	clickByXpath(prop.getProperty("RegPage.DOB.XPath"));
	return this;
	}
	
	public RegistrationPage enterDOB(String data)   
	{
		enterByXpath(prop.getProperty("RegPage.DOB.XPath"), data);
		
		return this;
	}
	/*
	 * public RegistrationPage selectMonthDOB(String data) {
	 * selectVisibleTextByXpath("//select[@class='ui-datepicker-month ng-tns-c58-17 ng-star-inserted']/option[contains(text(),"
	 * +data+")]", data); return this; } public RegistrationPage
	 * selectYearDOB(String data) {
	 * selectVisibleTextByXpath("//select[@class='ui-datepicker-year ng-tns-c58-17 ng-star-inserted']/option[contains(text(),"
	 * +data+")]", data); return this; }
	 * 
	 * public RegistrationPage selectDateDOB(String data) {
	 * selectVisibleTextByXpath("//a[text()="+data+"]", data); return this; }
	 */
	
	
	public RegistrationPage clickMarriedRadioButton() {
		clickByXpath(prop.getProperty("RegPage.Married.XPath"));
		return this;
		
	}
	
	public RegistrationPage clickUnmarriedRadioButton() {
		clickByXpath(prop.getProperty("RegPage.UnMarried.XPath"));
		
		return this;
	}
	
	public RegistrationPage clickMale() {
		clickByXpath(prop.getProperty("RegPage.Male.XPath"));
		
		return this;
	}
	
	public RegistrationPage clickFemale() {
		clickByXpath(prop.getProperty("RegPage.FeMale.XPath"));
		return this;
		
	}
	
	public RegistrationPage clickTransgender() {
		clickByXpath(prop.getProperty("RegPage.TransGender.XPath"));
		
		return this;
	}
	
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegPage.Email.XPath"),data);
		
		return this;
	}
	
	public RegistrationPage enterMobileNo(String data) {
		enterByXpath(prop.getProperty("RegPage.Mobile.XPath"),data);
		
		return this;
	}
	
	public RegistrationPage clickNationality() 
	{
		clickByXpath(prop.getProperty("RegPage.Nationality.XPath"));
		return this;
	}
	
	public RegistrationPage selectNationality(String data)         
	{
		selectVisibleTextByXpath(prop.getProperty("RegPage.Nationality.XPath"), data);
		return this;
		
	}
	
	public RegistrationPage enterFlatNo(String data) 
	{
		enterByXpath(prop.getProperty("RegPage.FlatNo.XPath"),data);
		return this;
		
	}
	
	public RegistrationPage enterStreet(String data) 
	{
		enterByXpath(prop.getProperty("RegPage.Street.XPath"),data);
		return this;
		
	}
	
	public RegistrationPage enterArea(String data)
	
	{
		enterByXpath(prop.getProperty("RegPage.Area.XPath"),data);
		return this;
		
	}
	
	public RegistrationPage enterPincode(String data)
	
	{
		enterByXpath(prop.getProperty("RegPage.PinCode.XPath"),data);
		return this;
		
	}
	
	public RegistrationPage clickState()
	
	{
		clickByXpath(prop.getProperty("RegPage.State.XPath"));
		return this;
		
	}

	public RegistrationPage clickCity() 
	{
	clickByXpath(prop.getProperty("RegPage.City.XPath"));
	return this;
	}

	public RegistrationPage selectCity(String data)                 
	{
		
	selectVisibleTextByXpath(prop.getProperty("RegPage.City.XPath"), data);
	return this;
	
	}
	
	public RegistrationPage clickPostOffice() 
	{
		clickByXpath(prop.getProperty("RegPage.PostOffice.XPath"));
		return this;
	}
	
	public RegistrationPage selectPostOffice(String data) 
	{
		selectVisibleTextByXpath(prop.getProperty("RegPage.PostOffice.XPath"), data);                      
		return this;
		
	}
	
	public RegistrationPage enterPhone(String data)
	
	{
		enterByXpath(prop.getProperty("RegPage.Phone.XPath"),data);
		return this;
		
	}
	
	
	
	public RegistrationPage clickOfficeAddressYes() 
	{
		clickByXpath(prop.getProperty("RegPage.SameResYes.XPath"));
		return this;
	}
	public RegistrationPage clickOfficeAddressNo() 
	{
		clickByXpath(prop.getProperty("RegPage.SameResNo.XPath"));
		return this;
	}
	
	public RegistrationPage enterOfficeFlatNo(String data) 
	{
		enterByXpath(prop.getProperty("RegPage.OfficeFlatNo.XPath"),data);
		return this;
		
	}
	
	public RegistrationPage enterOfficeStreet(String data) 
	{
		enterByXpath(prop.getProperty("RegPage.OfficeStreet.XPath"),data);
		return this;
		
	}
	
	public RegistrationPage enterOfficeArea(String data)
	
	{
		enterByXpath(prop.getProperty("RegPage.OfficeArea.XPath"),data);
		return this;
		
	}
	 public RegistrationPage clickCountry()
	 {
		 clickByXpath(prop.getProperty("RegPage.OfficeCountry.XPath"));
		 return this;
	 }
	
	 public RegistrationPage selectCountry()              
	 {
		 clickByXpath(prop.getProperty("RegPage.SelectCountry.XPath"));
		 return this;
	 }
	
	
	public RegistrationPage enterOfficePincode(String data)
	
	{
		enterByXpath(prop.getProperty("RegPage.OfficePincode.XPath"),data);
		return this;
		
	}
	
	public RegistrationPage enterOfficeState(String data)
	
	{
		enterByXpath(prop.getProperty("RegPage.OfficeState.XPath"),data);
		return this;
		
	}

	public RegistrationPage clickOfficeCity() 
	{
	clickByXpath(prop.getProperty("RegPage.OfficeCity.XPath"));
	return this;
	}

	public RegistrationPage enterOfficeCity(String data)          //need to add
	{
	enterByXpath(prop.getProperty("RegPage.OfficeCity.XPath"), data);
	return this;
	
	}
	
	public RegistrationPage clickOfficePostOffice() 
	{
		clickByXpath(prop.getProperty("RegPage.OfficePostOffice.XPath"));
		return this;
	}
	
	public RegistrationPage enterOfficePostOffice(String data) 
	{
		enterByXpath(prop.getProperty("RegPage.OfficePostOffice.XPath"), data);  
		return this;
		
	}
	
	public RegistrationPage enterOfficePhone(String data)
	
	{
		enterByXpath(prop.getProperty("RegPage.OfficePhoneNo.XPath"),data);
		return this;
		
	}
	
	public RegistrationPage clickRegistrationButton()
	{
		clickByXpath(prop.getProperty("RegPage.Register.XPath"));
		return this;
	}
	
	public RegistrationPage clickBackButton()
	{
		clickByXpath(prop.getProperty("RegPage.Back.XPath"));
		return this;
	}
	
	
	
}