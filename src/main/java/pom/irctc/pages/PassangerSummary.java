package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassangerSummary extends GenericWrappers {


	public PassangerSummary clickTermsAndConditions()
	{
		clickByXpath(prop.getProperty("PassangerSummary.TermsAndConditions.XPath"));
		return this;
	}
	
	public PassangerSummary clickMakePayment()
	{
		clickByXpath(prop.getProperty("PassangerSummary.MakePayment.XPath"));
		return this;
	}
	
	public PassangerSummary enterOTP(String data)
	{
		enterByXpath(prop.getProperty("PassangerSummary.OTPButton.XPath"), data);
		return this;
	}
	
	public PassangerSummary clickVerifyOTPButton()
	{
		clickByXpath(prop.getProperty("PassangerSummary.VerifyOTP.XPath"));
		return this;
	}
	public PassangerSummary VerifyOTPError(String data)
	{
		verifyTextByXpath(prop.getProperty("PassangerSummary.OTPError.XPath"),data);
		return this;
	}
	
}
