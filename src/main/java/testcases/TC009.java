package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.SimpleAlert;
import wrappers.ProjectWrappers;
public class TC009 extends ProjectWrappers{
	@BeforeClass
	public void BeforeClass()
	{

		testCaseName="TC009";
		testCaseDescription="To verify the simple alert validation";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";

		
	}
	
	@Test
	public void SimpleAlert()
	{
		
	new SimpleAlert()
	.SwitchFrame()
	.clickTryit()
	.getTheAlertText()
	.acceptTheAlert()
	.switchParentFrame()
	
	.clickOnHome();
	
	
	
}
}