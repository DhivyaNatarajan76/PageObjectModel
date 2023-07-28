package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.FormCHomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void BeforeClass()
	{
		testCaseName="TC006";
		testCaseDescription="To verify the FormC registration for new user";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
SheetName="TC006";
		
	}
	
	@Test(dataProvider="fetchData")
	public void FormCRegistrationPage(String userId,String password,String confirmPassword,String securityQuestion,String SecurityAnswer,String userName,
			String Gender,String DOB,String designation,String email,String MobileNo,String Phone,String Nationality,String name,String capacity,String address,
			String state,String city,String accomadation,String star,String email1,String contactNo1,
			String contactNo2,String person1,String person1Address,String person1State,String person1City,String person1Email,
			String person1PhoneNo,String Person1MobileNo,String person2,String person2Address,String person2State,String person2City,String person2Email,
			String person2PhoneNo,String Person2MobileNo,String person3,String person3Address,String person3State,String person3City,String person3Email,
			String person3PhoneNo,String Person3MobileNo)
	{
	new FormCHomePage()
	.clickSignUp()
	.enterUserId(userId)
	.enterPassword(password)
	.enterConfirmPassword(confirmPassword)
	.clickSecurityQuestion()
	.selectSecurityQuestion(securityQuestion)
	.enterSecurityAnswer(SecurityAnswer)
	.enterName(userName)
	.selectGender(Gender)
	.clickDOB()
	.selectDOB(DOB)
	.enterDesignation(designation)
	.enterEmail(email)
	.enterMobile(MobileNo)
	.enterPhoneNo(Phone)
	.clickNationality()
	.selectNationality(Nationality)
	.enterHotelName(name)
	.enterHotelCapacity(capacity)
	.enterHotelAddress(address)
	.selectHotelState(state)
	.clickCity()
	.selectCity(city)
	.clickAccomadationType()
	.selectAccomadationType(accomadation)
	
	.clickAccomadationGrade()
	.selectAccomadationGrade(star)
	.enterHotelEmail(email1)
	.enterHotelMobile(contactNo1)
	.enterHotelPhoneNo(contactNo2)
	
	
	//hotel details
	
	.enterHotelOwnerName(person1)
	.enterHotelOwnerAddress(person1Address)
	.selectHotelOwnerState(person1State)
	.clickHotelOwnerCity()
	.selectHotelOwnerCity(person1City)
	.enterHotelOwnerEmailId(person1Email)
	.enterHotelOwnerPhoneNo(person1PhoneNo)
	.enterHotelOwnerMobile(Person1MobileNo)
	.clickAddButton()
	
	.enterHotelOwnerName(person2)
	.enterHotelOwnerAddress(person2Address)
	.selectHotelOwnerState(person2State)
	.clickHotelOwnerCity()
	.selectHotelOwnerCity(person2City)
	.enterHotelOwnerEmailId(person2Email)
	.enterHotelOwnerPhoneNo(person2PhoneNo)
	.enterHotelOwnerMobile(Person2MobileNo)
	.clickAddButton()
	
	.enterHotelOwnerName(person3)
	.enterHotelOwnerAddress(person3Address)
	.selectHotelOwnerState(person3State)
	.clickHotelOwnerCity()
	.selectHotelOwnerCity(person3City)
	.enterHotelOwnerEmailId(person3Email)
	.enterHotelOwnerPhoneNo(person3PhoneNo)
	.enterHotelOwnerMobile(Person3MobileNo)
	.clickAddButton();
	
	
	
	}

}
