package pom.irctc.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import wrappers.GenericWrappers;

public class FindHotelPage extends GenericWrappers{
	
	public FindHotelPage enterHotelName(String data)
	{
	enterByXpath(prop.getProperty("FindHotl.HotelName.XPath"),data);
	
	clickByXpath(prop.getProperty("FindHotl.SelectHotelName.XPath"));
	return this;
	}
	
	public FindHotelPage clickCheckInDate()
	{
		
		clickByXpath(prop.getProperty("FindHotl.CheckInDate.XPath"));
	return this;
	}
	
	public int getDate(int data)
	{
		waitProperty(3000);
	return	getCurrentDay(data);
		}
	
	public FindHotelPage selectDate(String adddays)
	{
		/*
		 * int selectionDate=getDate(adddays); String selectDate=
		 * Integer.toString(selectionDate);
		 * //clickByXpath(prop.getProperty("FindHotl.SelectionDate.XPath")); String
		 * dateselection=prop.getProperty("FindHotl.SelectionDate.XPath"); String
		 * dateselection1=dateselection.replace("25", selectDate);
		 * clickByXpath(dateselection1);
		 */
		
clickByXpath(prop.getProperty("FindHotl.SelectionDate.XPath"),adddays);
		
		return this;
		
	}
	
	public FindHotelPage clickCheckOutDate() 
	{
		
		//clickDateByXpath(prop.getProperty("FindHotl.CheckOutDate.XPath"));
		clickByXpath(prop.getProperty("FindHotl.CheckOutDate.XPath"));
	
	return this;
	
	}
	
		
	
	public FindHotelPage clickGuestRoom()
	{
		clickByXpath(prop.getProperty("FindHotl.GuestRoom.XPath"));
		return this;
	}
	
	public FindHotelPage clickRoom()
	{
		clickByXpath(prop.getProperty("FindHotl.HotelRoom.XPath"));
		return this;
	}
	
	public FindHotelPage selectRoom(String data)   
	{
	
		selectVisibleTextByXpath(prop.getProperty("FindHotl.HotelRoom.XPath"), data);
		
		
	return this;
	}
	public FindHotelPage clickAdult()   
	{
	
		clickByXpath(prop.getProperty("FindHotl.HotelAdult.XPath"));
		
	return this;
	}
	
	public FindHotelPage selectAdult( String data)   
	{
		
		selectVisibleTextByXpath(prop.getProperty("FindHotl.HotelAdult.XPath"),data);
		
	return this;
	}
	
	public FindHotelPage clickChildren()   
	{
		clickByXpath(prop.getProperty("FindHotl.HotelChild.XPath"));
	return this;
	}
	
	public FindHotelPage selectChildren(String data)   
	{
		selectVisibleTextByXpath(prop.getProperty("FindHotl.HotelChild.XPath"),"data");
	return this;
	}
	public FindHotelPage pageDown()
	{
	keysPageDownActionByXpath(prop.getProperty("FindHotl.PageKeys.XPath"));
	return this;
	}
	public FindHotelPage pageUP()
	{
		keysPageUpActionByXpath(prop.getProperty("FindHotl.PageKeys.XPath"));
	
	return this;
	}
	public FindHotelPage clickGuestRoomDone()
	{
		
		clickByXpath(prop.getProperty("FindHotl.Done.XPath"));
		return this;
	}
	
	public HotelListingPage clickFindHotel()
	{
		clickByXpath(prop.getProperty("FindHotl.FindHotel.XPath"));
		return new HotelListingPage();
	}
	public FindHotelPage switchToWindowfromAccomadToFindHotelPage() {
		switchToLastWindow();
		return new FindHotelPage();
	}
	
}
