package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.PromptAlert;
import pom.facebook.pages.FaceBook;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	@BeforeClass
	public void BeforeClass()
	{
		testCaseName="TC007";
		testCaseDescription="To verify the facebook signup for new user";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.facebook.com";
		SheetName="TC007";
		
	}
	
	@Test(dataProvider="fetchData")
	public void FaceBookRegistration(String firstName, String lastName, String emailID, String confirmEmailID,String password,
			String day,String month,String year)
	{
				
	new FaceBook()
	.clickCreateNewAccount()
	.enterFirstName(firstName)
	.enterLastName(lastName)
	.enterEmail(emailID)
	.enterConfirmEmail(confirmEmailID)
	.enterPassword(password)
	.selectDay(day)
	.selectMonth(month)
	.selectYear(year)
	.clickFemaleGender()
	.clickSignUp();
	
	
}
}