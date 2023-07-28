package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;



public class TC001 extends ProjectWrappers {

	@BeforeClass
	public void BeforeClass()
	{
		testCaseName="TC001";
		testCaseDescription="To verify the IRCTC signup for new user";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
		SheetName="TC001";
		
	}
	
	@Test(dataProvider="fetchData")
	public void irctcRegistration(String UserName,String password,String confirmPassword,String SecurityAnswer,String firstName,String middleName,String lastName,
			String DOB,String email,String mobile,String country,String address1,String address2,
			String address3,String pinCode,String city,String postOffice,String mobileNumber,String officeAddress1,String officeAddress2,
			String officeAddress3,String officePincode,String officeState,String officeCity,String OfficePostOffice,String OfficePhone) {
		
		new HomePage()
		.clickOnRegister()				
		.enterUserName(UserName)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.clickPreferredLaunguage()
		
		.selectPreferredLaunguage()
		.clickSecurityQuestion()	
		
		.enterSecurityAnswer(SecurityAnswer)
		.clickContinueButton()
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.clickOccupation()
		.clickDOB()
		.enterDOB(DOB)
		.clickMarriedRadioButton()
		.clickMale()
		.enterEmail(email)
		.enterMobileNo(mobile)
		.clickNationality()
		.selectNationality(country)
		.clickContinueButton()
		.enterFlatNo(address1)
		.enterStreet(address2)
		.enterArea(address3)
		.enterPincode(pinCode)
		.clickState()
		.clickCity()
		.selectCity(city)
		.clickPostOffice()
		.selectPostOffice(postOffice)
		.enterPhone(mobileNumber)
		.clickOfficeAddressNo()   
		.enterOfficeFlatNo(officeAddress1)
		.enterOfficeStreet(officeAddress2)
		.enterOfficeArea(officeAddress3)
		.clickCountry()
		.selectCountry()
		.enterOfficePincode(officePincode)
		.enterOfficeState(officeState)
		.enterOfficeCity(officeCity)
		.enterOfficePostOffice(OfficePostOffice)
		.enterOfficePhone(OfficePhone)
		.clickRegistrationButton();
		
	
		
		
	}
}
