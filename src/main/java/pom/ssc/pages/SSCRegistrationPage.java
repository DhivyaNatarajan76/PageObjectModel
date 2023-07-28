package pom.ssc.pages;

import wrappers.GenericWrappers;

public class SSCRegistrationPage extends GenericWrappers{
	
	public SSCRegistrationPage clickHaveAadhaarYes()
	{
		clickByXpath(prop.getProperty("SSC.AadhaarYes.XPath"));
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage clickHaveAadhaarNo()
	{
		clickByXpath(prop.getProperty("SSC.AadhaarNO.XPath"));
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterAadhaarNo(String data)
	{
		enterByXpath(prop.getProperty("SSC.AadhaarNumber.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterVerifyAadhaarNo(String data)
	{
		enterByXpath(prop.getProperty("SSC.VerifyAadhaarNumber.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterName(String data)
	{
		enterByXpath(prop.getProperty("SSC.Name.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterVerifyName(String data)
	{
		enterByXpath(prop.getProperty("SSC.VerifyName.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage clickHaveChangedNamerYes()
	{
		clickByXpath(prop.getProperty("SSC.ChangedNameYes.XPath"));
		return new SSCRegistrationPage();
	}
	public SSCRegistrationPage clickHaveChangedNamerNo()
	{
		clickByXpath(prop.getProperty("SSC.ChangedNameNo.XPath"));
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterNewName(String data)
	{
		enterByXpath(prop.getProperty("SSC.NewName.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterFatherName(String data)
	{
		enterByXpath(prop.getProperty("SSC.FatherName.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterVerifyFatherName(String data)
	{
		enterByXpath(prop.getProperty("SSC.VerifyFatherName.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterMotherName(String data)
	{
		enterByXpath(prop.getProperty("SSC.MotherName.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterVerifyMotherName(String data)
	{
		enterByXpath(prop.getProperty("SSC.VerifyMotherName.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage clickDOB()
	{
		clickByXpath(prop.getProperty("SSC.DOB.XPath"));
		return new SSCRegistrationPage();
	}
	public SSCRegistrationPage enterDOB(String data)
	{
		enterByXpath(prop.getProperty("SSC.DOB.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage verifyDOB(String data)
	{
		enterByXpath(prop.getProperty("SSC.VerifyDOB.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage selectEducationBoard(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("SSC.EducationBoard.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage selectVerifyEducationBoard(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("SSC.VerifyEducationBoard.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterRollno(String data)
	{
		enterByXpath(prop.getProperty("SSC.RollNo.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterVerifyRollno(String data)
	{
		enterByXpath(prop.getProperty("SSC.VerifyRollNo.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage selectEducationYearPassing(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("SSC.EducationYear.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage verifyselectEducationYearPassing(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("SSC.VerifyEducationYear.XPath"),data);
		return new SSCRegistrationPage();
	}
	

	public SSCRegistrationPage clickGenderMale()
	{
		clickByXpath(prop.getProperty("SSC.MaleGender.XPath"));
		return new SSCRegistrationPage();
	}
	public SSCRegistrationPage clickGenderFeMale()
	{
		clickByXpath(prop.getProperty("SSC.FeMaleGender.XPath"));
		return new SSCRegistrationPage();
	}
	public SSCRegistrationPage clickGenderTransgender()
	{
		clickByXpath(prop.getProperty("SSC.Transgender.XPath"));
		return new SSCRegistrationPage();
	}
	public SSCRegistrationPage clickVerifyGenderMale()
	{
		clickByXpath(prop.getProperty("SSC.VerifyMaleGender.XPath"));
		return new SSCRegistrationPage();
	}
	public SSCRegistrationPage clickVerifyGenderFeMale()
	{
		clickByXpath(prop.getProperty("SSC.VerifyFeMaleGender.XPath"));
		return new SSCRegistrationPage();
	}
	public SSCRegistrationPage clickVerifyGenderTransgender()
	{
		clickByXpath(prop.getProperty("SSC.VerifyTransgender.XPath"));
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage selectEducationQual(String data)
	{
		selectVisibleValueByXpath(prop.getProperty("SSC.EducationQual.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterMobNo(String data)
	{
		enterByXpath(prop.getProperty("SSC.MobileNo.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterVerifyMobNo(String data)
	{
		enterByXpath(prop.getProperty("SSC.VerifyMobileNo.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterEmailID(String data)
	{
		enterByXpath(prop.getProperty("SSC.Email.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage enterVerifyEmailID(String data)
	{
		enterByXpath(prop.getProperty("SSC.VerifyEmail.XPath"),data);
		return new SSCRegistrationPage();
	}
	public SSCRegistrationPage selectPermState(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("SSC.OrginState.XPath"),data);
		return new SSCRegistrationPage();
	}
	
	public SSCRegistrationPage clickSaveButton()
	{
		clickByXpath(prop.getProperty("SSC.Save.XPath"));
		return new SSCRegistrationPage();
	}

}
