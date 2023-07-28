package pom.alert.pages;

import java.util.concurrent.TimeUnit;

import wrappers.GenericWrappers;

public class PromptAlert extends GenericWrappers{
	
	public PromptAlert switchToFrame()
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		switchToFramebyXpath(prop.getProperty("AlertPage.SwitchToFrame.XPath"));
		return this;
	}
	

	public PromptAlert clickTryit()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickByXpathNoSnap(prop.getProperty("AlertPage.TryItButton.XPath"));
	return this;
	}
	
	public PromptAlert enterTextInAlertBox(String data)
	{
		//waitProperty(2000);
		enterTextAlertBox(data);
		
		return this;
	}
	
	public PromptAlert getTextInAlert()
	{
		 getAlertTextNoSnap();
		 //getAlertText();
		return this;
		
	}
	
	public PromptAlert acceptTheAlert()
	{
		acceptAlert();
		return this;
		
	}
	
	public PromptAlert verifyPrintedText(String data)
	{
		verifyTextByXpath(prop.getProperty("AlertPage.PrintedText.XPath"), data);
		return this;
	}
	
	public PromptAlert refreshThePage()
	{
		pageRefresh();
		return this;
	}
	
	public PromptAlert dismissTheAlert()
	{
		dismissAlert();
		return this;
	}
	
	public PromptAlert switchParentFrame()
	{
		switchToParentFrame();
		return this;
	}
	public PromptAlert clickOnHome()
	{
		clickByXpath(prop.getProperty("AlertPage.HomeMenu.XPath"));
		return this;
		
	}
	
	public PromptAlert pageWait()
	{
		waitProperty(6000);
		return this;
	}
	}

