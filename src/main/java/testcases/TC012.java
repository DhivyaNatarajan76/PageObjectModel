package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.SSCRegistrationPage;

import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {
	@BeforeClass
	public void BeforeClass()
	{
		testCaseName="TC012";
		testCaseDescription="To verify User able to register SSC application";
		category="Smoke";
		author="Dhivya";
		browserName="Chrome";
		url="https://ssc.nic.in/registration/home";
		SheetName="TC012";
		
	}
	
	@Test(dataProvider="fetchData")
	
	public void SSCRegistration(String aadharNumber,String verifyAadharNumber,String name,String verifyName,String newName,String fatherName,
			String verifyFatherName,String motherName,String verifyMotherName,String DOB,String verifyDOB,String EducationBoard,
			String ddlEducationBoard,String rollNo,String verifyRollNo,String yearOfPassing,String ddlYearofpassing,
			String educationqualification,String mobileNo,String verifyMobileNum,String emailID,String verifyEmailID,String originState)
	{
		new SSCRegistrationPage()
		.clickHaveAadhaarYes()
		.enterAadhaarNo(aadharNumber)
		.enterVerifyAadhaarNo(verifyAadharNumber)
		.enterName(name)
		.enterVerifyName(verifyName)
		.clickHaveChangedNamerYes()
		.enterNewName(newName)
		.enterFatherName(fatherName)
		.enterVerifyFatherName(verifyFatherName)
		.enterMotherName(motherName)
		.enterVerifyMotherName(verifyMotherName)
		.clickDOB()
		.enterDOB(DOB)
		 .verifyDOB(verifyDOB)
		 .selectEducationBoard(EducationBoard)
		 .selectVerifyEducationBoard(ddlEducationBoard)
		 .enterRollno(rollNo)
		 .enterVerifyRollno(verifyRollNo)
		 .selectEducationYearPassing(yearOfPassing)
		 .verifyselectEducationYearPassing(ddlYearofpassing)
		 .clickGenderFeMale()
		 .clickVerifyGenderFeMale()
		 .selectEducationQual(educationqualification)
		 .enterMobNo(mobileNo)
		 .enterVerifyMobNo(verifyMobileNum)
		 .enterEmailID(emailID)
		 .enterVerifyEmailID(verifyEmailID)
		 .selectPermState(originState)
		 .clickSaveButton();
		 
		 
	}
}



