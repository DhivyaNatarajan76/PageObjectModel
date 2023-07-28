package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.AccomadationPage;
import pom.irctc.pages.CharterPage;
import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	@BeforeClass
	public void BeforeClass()
	{
		testCaseName="TC003";
		testCaseDescription="To verify User able to perform saloon mandatory check";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.irctc.co.in/nget/train-search";
		SheetName="TC003";
		
	}
	
	@Test(dataProvider="fetchData")
	
		
		public void SaloonMandatoryCheck(String name,String organization,String address,String mobile,String email,String requestFor,
				String orginStation,String deststation,String DepartureDate,String ArrivalDate, String duration,String coach,String passengerNo,
				String charterpurpose,String services)
		{
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToWindowAccomadPage()
		.clickMenuIcon()
		.clickCharter()
		.switchToWindowCharterPage()
		.clickEnquiryForm()
		.enterName(name)
		.enterOrganisation(organization)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmail(email)
		.clickMenuArrow()
		.clickRequestFor()
		.selectRequestFor(requestFor)
		.enterOrginStation(orginStation)
		.enterDestStation(orginStation)
		.clickDepartureDate()
		.PageDown()
		.selectDate(DepartureDate)
		.clickArrivalDate()
		.selectArrivalDate(ArrivalDate)
		.enterNoOfDays(duration)
		.enterNoOfCoaches(coach)
		.enterNoOfPassengers(passengerNo)
		.enterPurpose(charterpurpose)
		.enterAddServices(services);
		//.clickSubmitButton();
		

}
}