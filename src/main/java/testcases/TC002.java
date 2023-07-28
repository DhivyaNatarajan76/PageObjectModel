package testcases;


import org.testng.annotations.Test;

import pom.irctc.pages.AccomadationPage;
import pom.irctc.pages.FTRRegistrationPage;
import pom.irctc.pages.FTRServicePage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;
import org.testng.annotations.BeforeClass;

public class TC002 extends ProjectWrappers
{
	@BeforeClass
	public void BeforeClass()
	{
		testCaseName="TC002";
		testCaseDescription="To verify User able to book the coach";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
SheetName="TC002";
		
	}
	
	@Test(dataProvider="fetchData")
	public void bookYourCoach(String userId,String password,String confirmPassword,String secQuestion,
			String securityAnswer,String MonthDOB,String YearDOB,String Email,
String Occupation,String firstName,String middleName,String lastName,String nationality,
			String flatNo,String street,String area,String country,String mobileNo,String pinCode,String postOffice,
			String officeFlatNo,String officeStreet,String officeArea,String officeCountry,String officeMobile,
			String pincode,String officePostOffice)
	{
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToWindowAccomadPage()	
		.clickMenuIcon()		
		.clickBookYourCoachTrain()
		.switchToWindowAccomadToFTRPage()
		
		.clickSignUp()		
		.enterUserID(userId)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.clickSecurityQues()
		.selectSecurityQuestion(secQuestion)
		.enterSecurityAns(securityAnswer)
		.clickDOB()
		.SelectMonthDOB(MonthDOB)
		.SelectYearDOB(YearDOB)
		.clickDateDOB()
		.clickFeMaleGender()
		.clickMarriedRadioButton()
		.enterEmailId(Email)
		.pageDown()
		.clickOccupation()
		.selectOccupation(Occupation)		
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.clickNationality()
		
		.selectNationality(nationality)
		.enterFlatNo(flatNo)
		.enterStreet(street)
		.enterArea(area)
		.clickCountry()
		.selectCountry(country)
		.enterMobNo(mobileNo)
		.enterPincode(pinCode)
		.KeysTABPincode()
		.clickPostOffice()
		.selectPostOffice(postOffice)
		.pageDown()
		.clickSameAddressNo()
		.enterCommAddressFlatNo(officeFlatNo)
		.enterCommAddressStreet(officeStreet)
		.enterCommAddressArea(officeArea)
		.clickCommAddressCountry()
		.selectCommAddressCountry(officeCountry)
		.enterCommAddressMobNo(officeMobile)
		.enterCommAddressPincode(pincode) 
		.TABKEY()
		.clickCommAddressPostOffice()
		//.clickCommAddressPostOffice()
		.selectCommAddressPostOffice(officePostOffice);
	
		
	}

}
