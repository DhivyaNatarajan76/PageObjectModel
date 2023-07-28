package testcases;

import pom.alert.pages.PromptAlert;
import wrappers.ProjectWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC008 extends ProjectWrappers {
	
	@BeforeClass
	public void BeforeClass()
	{

		testCaseName="TC008";
		testCaseDescription="To verify the prompt alert validation";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		SheetName="TC008";
	}
	
	@Test(dataProvider="fetchData")
	public void promptAlert(String textinAlertBox,String verifyText,String cancelVerifyText)
	{
		
	
	
	new PromptAlert()
	.switchToFrame()
	.clickTryit()
	
	.enterTextInAlertBox(textinAlertBox)
	.getTextInAlert()
	.acceptTheAlert()
	.verifyPrintedText(verifyText)
	.refreshThePage()
	.pageWait()
	.switchToFrame()
	.clickTryit()
	.enterTextInAlertBox(textinAlertBox)
	.getTextInAlert()
	.dismissTheAlert()
	.verifyPrintedText(cancelVerifyText)
	.switchParentFrame()
	.clickOnHome();
	
	
	
	
	
	
}
}