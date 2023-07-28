package pom.php.pages;

import wrappers.GenericWrappers;

public class PHPRegistrationPage extends GenericWrappers{
	
	public PHPRegistrationPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PHP.FirstName.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PHP.LastName.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("PHP.Email.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterPhone(String data)
	{
		enterByXpath(prop.getProperty("PHP.PhoneNo.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterCompanyName(String data)
	{
		enterByXpath(prop.getProperty("PHP.CompanyName.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterStreetAddress1(String data)
	{
		enterByXpath(prop.getProperty("PHP.Address1.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterStreetAddress2(String data)
	{
		enterByXpath(prop.getProperty("PHP.Address2.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterCity(String data)
	{
		enterByXpath(prop.getProperty("PHP.City.XPath"),data);
		return new PHPRegistrationPage();
	}
	public PHPRegistrationPage enterState(String data)
	{
		enterByXpath(prop.getProperty("PHP.State.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterPostCode(String data)
	{
		enterByXpath(prop.getProperty("PHP.PostCode.XPath"),data);
		return new PHPRegistrationPage();
	}

	public PHPRegistrationPage selectCountry(String data)
	{
		selectVisibleTextByXpath(prop.getProperty("PHP.Country.XPath"),data);
		return new PHPRegistrationPage();
	}
	public PHPRegistrationPage enterMobNo(String data)
	{
		enterByXpath(prop.getProperty("PHP.MobileNo.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("PHP.Password.XPath"),data);
		return new PHPRegistrationPage();
	}
	
	public PHPRegistrationPage enterConfirmPassword(String data)
	{
		enterByXpath(prop.getProperty("PHP.ConfirmPassword.XPath"),data);
		return new PHPRegistrationPage();
	}

	
}
