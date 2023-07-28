package pom.alert.pages;

import wrappers.GenericWrappers;

public class ConfirmationAlert extends GenericWrappers{
	
	public ConfirmationAlert switchToFrame()
	{
		waitProperty(2000);
		switchToFramebyXpath(prop.getProperty("AlertPage.SwitchToFrame.XPath"));
		return new ConfirmationAlert();
	}
	

	public ConfirmationAlert clickTryit()
	{
	clickByXpathNoSnap(prop.getProperty("AlertPage.TryItButton.XPath"));
	return this;
	}
	
	public ConfirmationAlert getTextInAlert()
	{
		 getAlertTextNoSnap();
		 return this;
		
	}
	
	public  ConfirmationAlert  acceptTheAlert()
	{
		 acceptAlert();
		 return this;
		
	}
	
	public ConfirmationAlert verifyPrintedText(String data)
	{
		waitProperty(2000);
		verifyTextByXpath(prop.getProperty("AlertPage.PrintedText.XPath"), data);
		return this;
	}
	
	public ConfirmationAlert refreshThePage()
	{
		pageRefresh();
		return this;
	}
	
	public ConfirmationAlert dismissTheAlert()
	{
		dismissAlert();
		return this;
	}
	
	public ConfirmationAlert switchParentFrame()
	{
		switchToParentFrame();
		return this;
	}
	
	public ConfirmationAlert clickHomeButton()
	{
		clickByXpath(prop.getProperty("AlertPage.HomeMenu.XPath"));
		return this;
	}
}
