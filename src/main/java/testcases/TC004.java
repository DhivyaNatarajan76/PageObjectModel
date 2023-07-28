package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	@BeforeClass
	public void BeforeClass()
	{
		testCaseName="TC004";
		testCaseDescription="To verify User able to book the hotel";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.irctc.co.in";
		SheetName="TC004";
		
	}
	
	@Test(dataProvider="fetchData")
	public void BookHotelOTPValidation(String email,String mobile,String address,String CheckInDate,String CheckOutdate,String HotelRoom,String HotelAdult,String GuestUserName,
			String GuestPassword,String Title,String firstName,String lastName,String state,String GST,String OTP,String OTPError)
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
	.selectRoom(HotelRoom)
	.clickAdult()
	.selectAdult(HotelAdult)
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
	.guestUserLogin(GuestUserName,GuestPassword)
	.verifyHotelName()
	.verifyHotelPrice()
	.selectTitle(Title)
	.enterFirstName(firstName)
	.enterLastName(lastName)
	.selectState(state)
	.selectGST(GST)		
	.clickContinueButton()
	.clickTermsAndConditions()
	.clickMakePayment()
	.enterOTP(OTP)
	.clickVerifyOTPButton()
	.VerifyOTPError(OTPError);
	}

}
