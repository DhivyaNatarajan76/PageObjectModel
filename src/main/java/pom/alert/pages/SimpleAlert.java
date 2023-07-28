package pom.alert.pages;

import wrappers.GenericWrappers;

public class SimpleAlert extends GenericWrappers {
	
	public SimpleAlert SwitchFrame()
	
	{
		
		switchToFramebyXpath(prop.getProperty("AlertPage.SwitchToFrame.XPath"));
		return new SimpleAlert();
	}

	public SimpleAlert clickTryit()
	{
		clickByXpathNoSnap(prop.getProperty("AlertPage.TryItButton.XPath"));
		return this;
	}
	
	public SimpleAlert getTheAlertText()
	
	{
	getAlertTextNoSnap();
	return this;
	
	}

	public SimpleAlert acceptTheAlert()

	{
	acceptAlert();
	return this;
	}
	
	public SimpleAlert switchParentFrame()
	{
		switchToParentFrame();
		return this;
	}
	
	public SimpleAlert clickOnHome()
	{
		clickByXpath(prop.getProperty("AlertPage.HomeMenu.XPath"));
		return this;
		
	}
	}


