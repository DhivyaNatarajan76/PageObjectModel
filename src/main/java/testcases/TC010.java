package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.ConfirmationAlert;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers{
	
	@BeforeClass
	public void BeforeClass()
	{

		testCaseName="TC010";
		testCaseDescription="To verify the Confirmation alert validation";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
SheetName="TC010";
		
	}
	
	@Test(dataProvider="fetchData")
	
	public void ConfirmationAlert(String verifyTextOK,String verifyextCancel)
	{
		new ConfirmationAlert()
		.switchToFrame()
		.clickTryit()
		.getTextInAlert()
		.acceptTheAlert()
		.verifyPrintedText(verifyTextOK)
		.refreshThePage()
		.switchToFrame()
		.clickTryit()
		.getTextInAlert()
		.dismissTheAlert()
		.verifyPrintedText(verifyextCancel)
		.switchParentFrame()
		.clickHomeButton();
		
	}

}
