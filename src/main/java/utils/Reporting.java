package utils;



import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	public static ExtentReports report;
	public static ExtentTest test;
	public String testCaseName, testCaseDescription;
	public String author,category;
	
	public void startReport()
	{
		
		
		 report=new ExtentReports("./reports/LatestResult2.html",false);  //start report
		 
	}
	
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 * @throws IOException 
	 */
	public abstract long takeSnap();
	
	public void startTest(String testName,String Description)  //start test
	{
		
				
		test=report.startTest(testName, Description); 
		test.assignAuthor(author);
		test.assignCategory(category);
		
	}
		
	public void reportStep(String details,String status)
		{
		long snapNumber=takeSnap();
			
				if(status.equalsIgnoreCase("pass"))
				{
					test.log(LogStatus.PASS, details +test.addScreenCapture(".././reports/Screenshots/"+snapNumber+".png"));
				}
				else if(status.equalsIgnoreCase("fail"))
				{
					test.log(LogStatus.FAIL, details +test.addScreenCapture(".././reports/Screenshots/"+snapNumber+".png"));
				}
				
				else if(status.equalsIgnoreCase("warning"))
				{
					test.log(LogStatus.WARNING, details +test.addScreenCapture(".././reports/Screenshots/"+snapNumber+".png"));
				}
				else if(status.equalsIgnoreCase("info"))
				{
					test.log(LogStatus.INFO, details +test.addScreenCapture(".././reports/Screenshots/"+snapNumber+".png"));
				}
	}
	
	public void reportStep(String details,String status,boolean bSnap)
	{
		if (bSnap)
	
		
			if(status.equalsIgnoreCase("pass"))
			{
				test.log(LogStatus.PASS, details);
			}
			else if(status.equalsIgnoreCase("fail"))
			{
				test.log(LogStatus.FAIL, details);
			}
			
			else if(status.equalsIgnoreCase("warning"))
			{
				test.log(LogStatus.WARNING, details );
			}
			else if(status.equalsIgnoreCase("info"))
			{
				test.log(LogStatus.INFO, details);
			}
}
		
		public void endTest()
		{
			report.endTest(test);
		}
		
		public void endReport()
		{
			report.flush();
		}

}
