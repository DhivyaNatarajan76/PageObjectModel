package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRRegistrationPage extends GenericWrappers {

	public FTRRegistrationPage enterUserID(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.UserId.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.Password.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.ConfirmPassword.XPath"), data);
		return this;
	}

	public FTRRegistrationPage clickSecurityQues() {
		clickByXpath(prop.getProperty("FTRRegPage.SecurityQuestion.XPath"));
		return this;
	}

	public FTRRegistrationPage selectSecurityQuestion(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.SecurityQuestion.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterSecurityAns(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.SecurityAnswer.XPath"), data);
		return this;
	}

	public FTRRegistrationPage clickDOB() {
		clickByXpath(prop.getProperty("FTRRegPage.DOB.XPath"));
		return this;
	}

	public FTRRegistrationPage SelectMonthDOB(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.MonthDOB.XPath"), data);
		return this;
	}

	public FTRRegistrationPage SelectYearDOB(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.YearDOB.XPath"), data);
		return this;
	}

	public FTRRegistrationPage clickDateDOB() {
		clickByXpath(prop.getProperty("FTRRegPage.DateDOB.XPath"));
		return this;
	}

	public FTRRegistrationPage clickMaleGender() {
		clickByXpath(prop.getProperty("FTRRegPage.MaleGender.XPath"));
		return this;
	}

	public FTRRegistrationPage clickFeMaleGender() {
		clickByXpath(prop.getProperty("FTRRegPage.FemaleGender.XPath"));
		return this;
	}

	public FTRRegistrationPage clickTransgenderGender() {
		clickByXpath(prop.getProperty("FTRRegPage.Transgender.XPath"));
		return this;
	}

	public FTRRegistrationPage clickInstitutionGender() {
		clickByXpath(prop.getProperty("FTRRegPage.InstitutionGender.XPath"));
		return this;
	}

	public FTRRegistrationPage clickMarriedRadioButton() {
		clickByXpath(prop.getProperty("FTRRegPage.Married.XPath"));
		return this;
	}

	public FTRRegistrationPage clickUnMarriedRadioButton() {
		clickByXpath(prop.getProperty("FTRRegPage.UnMarried.XPath"));
		return this;
	}

	public FTRRegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.Email.XPath"), data);
		return this;
	}
	
	public FTRRegistrationPage pageDown() {
		waitProperty(2000);
		keysPageDownActionByXpath(prop.getProperty("FTRRegPage.PageKeys.XPath"));
		return this;
	}

	public FTRRegistrationPage clickOccupation() {
		clickByXpath(prop.getProperty("FTRRegPage.Occupation.XPath"));
		return this;
	}

	public FTRRegistrationPage selectOccupation(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.Occupation.XPath"),data);
		return this;
	}

	public FTRRegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.FirstName.XPath"),data);
		return this;
	}

	public FTRRegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.MiddleName.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.LastName.XPath"), data);
		return this;
	}

	public FTRRegistrationPage clickNationality() {
		clickByXpath(prop.getProperty("FTRRegPage.Nationality.XPath"));
		return this;
	}

	public FTRRegistrationPage selectNationality(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.Nationality.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.FlatNo.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.Street.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.Area.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterMobNo(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.MobNo.XPath"), data);
		return this;
	}

	
	  public FTRRegistrationPage clickCountry() { 
		  clickByXpath(prop.getProperty("FTRRegPage.Country.XPath"));
		  return this; }
	 
	public FTRRegistrationPage selectCountry(String data) { 
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.Country.XPath"), data);
		return this; }
//input[@id='pincode']	 

	public FTRRegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.PinCode.XPath"), data);
		return this;
	}
	public FTRRegistrationPage KeysTABPincode() {
		keysTabActionByxpath(prop.getProperty("FTRRegPage.PinCode.XPath"));
		return this;
	}
	

	public FTRRegistrationPage clickPostOffice() {
		clickByXpath(prop.getProperty("FTRRegPage.PostOffice.XPath"));
		return this;
	}

	public FTRRegistrationPage selectPostOffice(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.PostOffice.XPath"), data);
		return this;
	}

	public FTRRegistrationPage clickSameAddressYes() {
		clickByXpath(prop.getProperty("FTRRegPage.SameAddressYes.XPath"));
		return this;
	}

	public FTRRegistrationPage clickSameAddressNo() {
		clickByXpath(prop.getProperty("FTRRegPage.SameAddressNo.XPath"));
		return this;
	}

	public FTRRegistrationPage enterCommAddressFlatNo(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.CommAddressFlatNo.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterCommAddressStreet(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.CommAddressStreet.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterCommAddressArea(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.CommAddressArea.XPath"), data);
		return this;
	}

	public FTRRegistrationPage clickCommAddressCountry() {
		clickByXpath(prop.getProperty("FTRRegPage.CommAddressCountry.XPath"));
		return this;
	}

	public FTRRegistrationPage selectCommAddressCountry(String data) {
		waitProperty(2000);
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.CommAddressCountry.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterCommAddressMobNo(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.CommAddressMobNo.XPath"), data);
		return this;
	}

	public FTRRegistrationPage enterCommAddressPincode(String data) {
		enterByXpath(prop.getProperty("FTRRegPage.CommAddressPincode.XPath"), data);
		return this;
	}
	
	public FTRRegistrationPage TABKEY() {
		keysTabActionByxpath(prop.getProperty("FTRRegPage.CommAddressPincode.XPath"));
		return this;
	}
	
	public FTRRegistrationPage clickCommAddressCity() {
		clickByXpath(prop.getProperty("FTRRegPage.CommAddressCity.XPath"));
		return this;
	}

	public FTRRegistrationPage selectCommAddressCity(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.CommAddressCity.XPath"), data);
		return this;
	}

	public FTRRegistrationPage clickCommAddressState() {
		clickByXpath(prop.getProperty("FTRRegPage.CommAddressState.XPath"));
		return this;
	}

	public FTRRegistrationPage selectCommAddressState(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.CommAddressState.XPath"), data);
		return this;
	}

	public FTRRegistrationPage clickCommAddressPostOffice() {
		clickByXpath(prop.getProperty("FTRRegPage.CommAddressPostOffice.XPath"));
		return this;
	}

	public FTRRegistrationPage selectCommAddressPostOffice(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRRegPage.CommAddressPostOffice.XPath"), data);
		return this;
	}
	
	
	}


