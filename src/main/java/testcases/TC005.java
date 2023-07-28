package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	@BeforeClass
	public void BeforeClass()
	{

		testCaseName="TC005";
		testCaseDescription="To verify the user able to book the hotel for GST validation";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.irctc.co.in";
SheetName="TC005";
		
	}
	
	@Test(dataProvider="fetchData")
	
	public void BookHotelGSTValidation(String email,String mobile,String address,String CheckInDate,String CheckOutdate,String hotelRoom,String hotelAdult,String GuestUserName,
			String GuesPassword,String title,String firstName,String lastName,String state,
			String GST,String GSTNo,String companyName,String companyAddress,String GSTError)
	{
		new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		
		
		.switchToWindowAccomadPage()
		.clickHotelsIcon()
		.clickLoginIcon()
		.clickGuestUserLogin()
		.enterEmail(email)
		.enterMobileNo(mobile)
		.clickLoginButton()
		.switchToWindowfromAccomadToFindHotelPage()
		.enterHotelName(address)
		.clickCheckInDate()
		.selectDate(CheckInDate)		
		.clickCheckOutDate()
		.selectDate(CheckOutdate)		
		.clickGuestRoom()
		.clickRoom()
		.selectRoom(hotelRoom)
		.clickAdult()
		.selectAdult(hotelAdult)
		.pageDown()	
		.clickGuestRoomDone()
		.pageUP()
		.clickFindHotel()
		.clickHotelName()
		
		.switchToWindowfromHotelListtoDetailsPage()
		.getHotelName()
		.getHotelPrice()
		
		.clickonContinueToBook()
		.switchToWindowHotelDetailsToPassangerPage()
		.guestUserLogin(GuestUserName,GuesPassword)		
		.selectTitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectState(state)
		.selectGST(GST)
		.enterGSTNo(GSTNo)
		.enterCompanyName(companyName)
		.enterCompanyAddress(companyAddress)
		
		.clickContinueButtonGSTNO()
		.verifyGSTNoError(GSTError);

}

	
}