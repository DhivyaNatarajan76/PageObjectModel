
package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.php.pages.PHPRegistrationPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	@BeforeClass
	public void BeforeClass()
	{
		testCaseName="TC011";
		testCaseDescription="To verify User able to register PHP travels application";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.phptravels.org/register.php";
SheetName="TC011";
		
	}
	
	@Test(dataProvider="fetchData")
	
	public void PHPRegistrationPage(String firstName,String lastName,String email,String phone,String companyName,String address1,String address2,String city,
			String state,String postcode,String country,String mobile,String password,String  confirmPassword)
	{
		new PHPRegistrationPage()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(email)
		.enterPhone(phone)
		.enterCompanyName(companyName)
		.enterStreetAddress1(address1)
		.enterStreetAddress2(address2)
		.enterCity(city)
		.enterState(state)
		.enterPostCode(postcode)
		.selectCountry(country)
		.enterMobNo(mobile)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword);
	}

}
