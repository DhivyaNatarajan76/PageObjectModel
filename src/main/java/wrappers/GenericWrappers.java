package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;
import pom.alert.pages.ConfirmationAlert;
import utils.Reporting;



public class GenericWrappers extends Reporting implements Wrappers{

	public static RemoteWebDriver driver;
	public static Properties prop=null;
	int number=1;
	int day;
	
	public void loadProperties()
	{
		prop=new Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadPropeties()
	{
		prop=null;
	}
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched with the given url "+url+" successfully");
			reportStep("The browser "+browser+" is launched with the given url "+url+" successfully","pass");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is launched with the given url "+url+" successfully","fail");
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched with the url as url doesnot contain http");
			reportStep("The browser "+browser+" is not launched with the url as url doesnot contain http", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
		} 
		/*
			 * finally {
			 * 
			 * takeSnap(); }
			 */
		
	}

	@Override
	public void enterById(String idValue, String data)  {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element wtih id "+idValue+" is entered with data "+data);
			reportStep ("The element wtih id "+idValue+" is entered with data ", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM","fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the applicaton");
			reportStep("The element with id "+idValue+" is not visible in the applicaton","fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the applicaton");
			reportStep("The element with id "+idValue+" is not interactable in the applicaton", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
		}
		catch (WebDriverException e){
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+ " due to unkwnon error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+ " due to unkwnon error", "fail");
		
		} 
		finally {
			
				takeSnap();
			
		}
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The element with name "+nameValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			
			System.err.println("The element with name "+nameValue+" is not found in the DOM");
			
		}catch (ElementNotVisibleException e) {
			System.err.println("The element with name " +nameValue+" is not visible in the application");
		}
		
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with name " +nameValue+" is not interatctable in the application");
		}
		
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with the name " +nameValue+ " is not stable in the application");
		}
		
		catch(WebDriverException e)
		{
			System.err.println("The element with name " +nameValue+" is not entered with data" +data+ " due to unknown error" );
		}
		
		/*
		 * finally {
		 * 
		 * takeSnap();
		 * 
		 * }
		 */
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
	
		try {
			WebElement ele=driver.findElementByXPath(xpathValue);
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with " +data);
			reportStep("The element with xpath "+xpathValue+" is entered with " +data, "Pass");
		} catch (NoSuchElementException e) {
			
			//System.err.println("The element with xpath "+xpathValue+ " is not found in DOM ");
			reportStep("The element with xpath "+xpathValue+ " is not found in DOM ", "Fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with xpath " +xpathValue+ " is not visible in the application");
			reportStep("The element with xpath " +xpathValue+ " is not visible in the application", "Fail");
		}
			
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with xpath " +xpathValue+ " is not interactable in the application");
			reportStep("The element with xpath " +xpathValue+ " is not interactable in the application","Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xpath " +xpathValue+ " is not stable in the application");
			reportStep("The element with xpath " +xpathValue+ " is not stable in the application", "Fail");
		}
			
		
		catch(WebDriverException e)
			{
				//System.err.println("The element with xpath "+xpathValue+ " is not entered with" +data+ " due to unknown error");
				reportStep("The element with xpath "+xpathValue+ " is not entered with" +data+ " due to unknown error","Fail");
			}
			/*
			 * finally {
			 * 
			 * takeSnap();
			 * 
			 * }
			 */
		
	}

	@Override
	public void verifyTitle(String title) {
	
	try {
		String titleName=driver.getTitle();
		if (titleName.equals(title))
		{
			System.out.println("The title of the page "+titleName+" is matched with expected title "+title);
		}
		else
		{
			System.err.println("The title of the page "+titleName+" is not matched with expected title "+title);
		}
	} 
	
	catch(WebDriverException e)
	{
		System.err.println("The title of the page " +title+ " is not verified due to unknown error");
	}
	
	finally
	{
		
			takeSnap();
		
	}
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		try {
			String getText = driver.findElementById(id).getText();
			if(getText.equals(text))
			{
				System.out.println("The element with id "+id+" is holding the text "+getText+" is matched with expected text "+text);
			}
			else
			{
				System.err.println("The element with id "+id+" is holding the text "+getText+" is not matched with expected text "+text);
			}
		}
		
		
		catch(NoSuchElementException e)
		{
			System.err.println("The element with id "+id+ " is not found in DOM");
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The element with id "+id+ " is not visible in the application");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with id "+id+ " is not interactable with the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with id "+id+" is not stable with the application");
		}
	
		catch(WebDriverException e)
		{
			System.err.println("Text" +text+ " is not verified due to unknown error");
		}
		finally
		{
			
				takeSnap();
		
			
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		String getText =null;
		try {
			getText= driver.findElementByXPath(xpath).getText();
			 
			if(getText.equals(text))
			{
				//System.out.println("The element with xpath "+xpath+" is holding the text "+getText+" is matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+getText+" is matched with expected text "+text, "Pass");
			
			}
			else
			{
				//System.err.println("The element with xpath "+xpath+" is holding the text "+getText+" is not matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+getText+" is not matched with expected text "+text, "Pass");
				
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+  " is not present in DOM");
			reportStep("The element with xpath "+xpath+  " is not present in DOM","fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with xpath "+xpath+  " is not visible in the application");
			reportStep("The element with xpath "+xpath+  " is not visible in the application","fail");
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with xpath "+xpath+  " is not interactable in the application");
			reportStep("The element with xpath "+xpath+  " is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xpath "+xpath+ " is not stable in the application");
			reportStep("The element with xpath "+xpath+ " is not stable in the application","fail");
		}
		
		
		catch(WebDriverException e)
		{
			//System.err.println("The element with xpath "+xpath+ " is holding the text " +getText+  " is not verified due to unknown error");
			reportStep("The element with xpath "+xpath+ " is holding the text " +getText+  " is not verified due to unknown error","fail");
		}
		
		/*
		 * finally {
		 * 
		 * takeSnap();
		 * 
		 * }
		 */
		}
	
	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		String getText = null;
		try {
			waitProperty(2000);
			getText= driver.findElementByXPath(xpath).getText();
						if(getText.contains(text))
			{
				
				//System.out.println("The element with xpath "+xpath+" is holding the text "+getText+" is matched partially with expected text "+text);
			reportStep("The element with xpath "+xpath+" is holding the text "+getText+" is matched partially with expected text "+text, "Pass");
			
			}
			
			else
			{
				//System.err.println("The element with xpath "+xpath+" is holding the text "+getText+" is not matched partially with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+getText+" is not matched partially with expected text "+text, "Pass");
			
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath " +xpath+ " is not present in DOM");
			reportStep("The element with xpath " +xpath+ " is not present in DOM","fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with xpath " +xpath+" is not visible in the application");
			reportStep("The element with xpath " +xpath+" is not visible in the application","Fail");
		}
		
		catch(ElementNotInteractableException e)
		{ 
			//System.err.println("The element with xpath " +xpath+ " is not interactable with the application");
			reportStep("The element with xpath " +xpath+ " is not interactable with the application" ,"Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xpath " +xpath+ " is not stable in the application");
			reportStep("The element with xpath " +xpath+ " is not stable in the application","Fail");
		}
		
		
		catch(WebDriverException e)
		{
			//System.err.println("The element with xpath "+xpath+" is holding the text "+getText+"  not verified with text" +text+ " due to unknown error");
			reportStep("The element with xpath "+xpath+" is holding the text "+getText+"  not verified with text" +text+ " due to unknown error","fail");
		}
		
		/*finally
		{
			
				takeSnap();
			
			}*/
	}
	

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(id).click();
			System.out.println("The element with id " +id+ " is clicked in the application");
			
		} catch (NoSuchElementException e) {
			System.err.println("The element with id " +id+ " is not found in DOM");
		}
		
		catch(ElementNotVisibleException e)
		
		{
			System.err.println("The element with id " +id+ " is not visible in the applicaton");
		}
		catch(ElementClickInterceptedException e)
		{
			System.err.println("The element with id " +id+ " is not stable in the application");
		}
		
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with id " +id+ " is not interactable in the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with id " +id+ " is not stable in the application");
		}
		
		catch(WebDriverException e)
		{
			System.err.println("The element with id" +id+ " is not clicked due to unknown error");
		}
		}
	

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with classValue " +classVal+ " is clicked in the application");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with classValue " +classVal+ " is not found in DOM");
		}
		
		catch(ElementNotVisibleException e)
		{
			System.err.println("The element with classValue " +classVal+ " is not visible in the application");
		}
		
		catch(ElementClickInterceptedException e)
		{
			System.err.println("The element with classValue " +classVal+ " is obscured in the application");
		}
		
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with classValue " +classVal+ " is not interactable in the application");
		}
		
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with classValue " +classVal+ " is not stable in the application");
		}
		
		
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with classValue " +classVal+ " is not clicked due to unknown error");
		}
		
		finally
		{
			takeSnap();
		}
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
	try {
		driver.findElementByName(name).click();
		System.out.println("The element with name " +name+ " is clicked in the application");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		System.err.println("The element with name " +name+ " is not found in DOM");
	}
	catch(ElementNotVisibleException e)
	{
		System.err.println("The element with name " +name+ " is not visible in the application");
		
	}
	catch(ElementClickInterceptedException e)
	{
		System.err.println("The element with name " +name+ " is obscured in the application");
	}
	catch(ElementNotInteractableException e)
	{
		System.err.println("The element with name " +name+ " is not interacted with the application");
	}
	catch(StaleElementReferenceException e)
	{
		System.err.println("The element with name " +name+ " is not stable in the application");
	}
	
	
	catch(WebDriverException e)
	{
		System.err.println("The element with name " +name+ " is not clicked due to unknown error");
	}
	
	finally
	{
		takeSnap();
	}
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with name " +name+ " is clicked in the application");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name " +name+ " is not found in DOM");
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The element with name " +name+ " not visible in the application");
	
			}
		catch(ElementClickInterceptedException e)
		{
			
			System.err.println("The element with name " +name+ " is obscured in the application");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with name " +name+ " is not interactable in the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with name " +name+ " is not stable in the application");
		}
		
		catch(WebDriverException e)
		{
			System.err.println("The element with name " +name+ " is not clicked due to unknown error");
		}
		
		finally
		{
	
				takeSnap();
			
		}
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			
			System.out.println("The element with name " +name+ " is clicked in the application");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name " +name+ " is not found in DOM");
		}
		catch(ElementNotVisibleException e)
		{ 
			System.err.println("The element with name " +name+ " is not visible in the application");
		}
	catch(ElementClickInterceptedException e)
		{
		System.err.println("The element with name " +name+ " is obscured in the application");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with name " +name+ " is not interactable in the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with name " +name+ " is not stable in the application");
		}
		
		
		
		catch(WebDriverException e)
		{
			System.err.println("The element name " +name+ " is not clicked due to unknown error");
		}
	}
	@Override
	public void clickByPartialLinkText(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByPartialLinkText(name).click();
			System.out.println("The element with name " +name+ " is clicked in the application");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name " +name+ " is not found in DOM");
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The element with name " +name+ " not visible in the application");
	
			}
		catch(ElementClickInterceptedException e)
		{
			
			System.err.println("The element with name " +name+ " is obscured in the application");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with name " +name+ " is not interactable in the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with name " +name+ " is not stable in the application");
		}
		
		catch(WebDriverException e)
		{
			System.err.println("The element with name " +name+ " is not clicked due to unknown error");
		}
		
		finally
		{
	
				takeSnap();
			
		}
	}
	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			
			driver.findElementByXPath(xpathVal).click();
		
			//System.out.println("The element with xpath " +xpathVal+ " is clicked in the application");
			reportStep("The element with xpath " +xpathVal+ " is clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath " +xpathVal+ " not found in DOM");
			reportStep("The element with xpath " +xpathVal+ " not found in DOM", "Fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " not visible in the application");
			reportStep("The element with xpath " +xpathVal+ " not visible in the application", "Fail");
		}
		
		catch(ElementClickInterceptedException e)
		{
			
				reportStep("The element with xpath " +xpathVal+ " is obscured in the application","Fail");
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is not interactable in the application");
			reportStep("The element with xpath" +xpathVal+ " is not interactable in the application", "Fail");
		}
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xpath " +xpathVal+" is not stable in the application");
			
				reportStep("The element with xpath " +xpathVal+" is not stable in the application","Fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is not clicked due to unknown error");
			reportStep("The element with xpath " +xpathVal+ " is not clicked due to unknown error","Fail");
		}
		
	}
		public void clickByXpath(String xpathVal , String data) {
			// TODO Auto-generated method stub
			try {
				
				if(xpathVal.contains("$value$")) {
					xpathVal = xpathVal.replace("$value$", data);
				}
				
				driver.findElementByXPath(xpathVal).click();
			
				//System.out.println("The element with xpath " +xpathVal+ " is clicked in the application");
				reportStep("The element with xpath " +xpathVal+ " is clicked in the application", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with xpath " +xpathVal+ " not found in DOM");
				reportStep("The element with xpath " +xpathVal+ " not found in DOM", "Fail");
			}
			
			catch(ElementNotVisibleException e)
			{
				//System.err.println("The element with xpath " +xpathVal+ " not visible in the application");
				reportStep("The element with xpath " +xpathVal+ " not visible in the application", "Fail");
			}
			
			catch(ElementClickInterceptedException e)
			{
				
					reportStep("The element with xpath " +xpathVal+ " is obscured in the application","Fail");
			}
			
			catch(ElementNotInteractableException e)
			{
				//System.err.println("The element with xpath " +xpathVal+ " is not interactable in the application");
				reportStep("The element with xpath" +xpathVal+ " is not interactable in the application", "Fail");
			}
			
			catch(StaleElementReferenceException e)
			{
				//System.err.println("The element with xpath " +xpathVal+" is not stable in the application");
				
					reportStep("The element with xpath " +xpathVal+" is not stable in the application","Fail");
			}
			
			catch(WebDriverException e)
			{
				//System.err.println("The element with xpath " +xpathVal+ " is not clicked due to unknown error");
				reportStep("The element with xpath " +xpathVal+ " is not clicked due to unknown error","Fail");
			}
		
		/*
		 * finally {
		 * 
		 takeSnap();
		 * 
		 * }
		 */
	}
	@Override
	public void clickDateByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElementByXPath(xpathVal).click();
			
			
			
			
			//System.out.println("The element with xpath " +xpathVal+ " is clicked in the application");
			//reportStep("The element with xpath " +xpathVal+ " is clicked in the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath " +xpathVal+ " not found in DOM");
			reportStep("The element with xpath " +xpathVal+ " not found in DOM", "Fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " not visible in the application");
			reportStep("The element with xpath " +xpathVal+ " not visible in the application", "Fail");
		}
		
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is obscured in the application");
			try {
				WebElement element=driver.findElementByXPath(xpathVal); 
				JavascriptExecutor js=(JavascriptExecutor)driver; 
				js.executeScript("arguments[0].click",element);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				reportStep("The element with xpath " +xpathVal+ " is obscured in the application","Fail");
			}
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is not interactable in the application");
			reportStep("The element with xpath" +xpathVal+ " is not interactable in the application", "Fail");
		}
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xpath " +xpathVal+" is not stable in the application");
			reportStep("The element with xpath " +xpathVal+" is not stable in the application","Fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is not clicked due to unknown error");
			reportStep("The element with xpath " +xpathVal+ " is not clicked due to unknown error","Fail");
		}
		
		/*
		 * finally {
		 * 
		 * takeSnap();
		 * 
		 * }
		 */
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with xpath " +xpathVal+ " is clicked in the application");
			reportStep("The element with xpath " +xpathVal+ " is clicked in the application", "Pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath " +xpathVal+ " is not found in DOM");
			reportStep("The element with xpath " +xpathVal+ " is not found in DOM", "Fail",false);
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The element with xpath " +xpathVal+ " is not visible in the application");
			reportStep("The element with xpath " +xpathVal+ " is not visible in the application", "Fail",false);
		}
		
		catch(ElementClickInterceptedException e)
		{
			System.err.println("The element with xpath " +xpathVal+ " is obscured in the application");
			reportStep("The element with xpath " +xpathVal+ " is obscured in the application", "Fail",false);
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with xpath " +xpathVal+ "is  not interactable in the application");
			
			reportStep("The element with xpath " +xpathVal+ "is  not interactable in the application", "Fail",false);
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with xpath " +xpathVal+ " is not stable in the application");
			reportStep("The element with xpath " +xpathVal+ " is not stable in the application", "Fail",false);
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is not clicked due to unknown error");
			reportStep("The element with xpath " +xpathVal+ " is not clicked due to unknown error", "Fail",false);
		}
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String getText=null;
		try {
			 getText=driver.findElementById(idVal).getText();
			System.out.println("The element with id " +idVal+ " is holding the text value is" +getText);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id " +idVal+  " not found in DOM");
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The element with id " +idVal+ " is not visible in the application");
		}
		
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with id " +idVal+ " is not interactable with the application");
		}
		
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with id " +idVal+ " is not  stable in the application");
		}
		
		
		
		catch(WebDriverException e)
		{
			System.err.println("Unable to get the text for the element with id " +idVal+ " due to unknown error");
		}
		
		finally
		{
			
				takeSnap();
			
		}
		return getText;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String getText=null;
		try {
			 getText=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath " +xpathVal+ " is holding the text value is " +getText);
			reportStep("The element with xpath " +xpathVal+ " is holding the text value is " +getText, "Pass");
			
					
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath " +xpathVal+ " is not found in DOM");
			reportStep("The element with xpath " +xpathVal+ " is not found in DOM","fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is not visible in the application");
			reportStep("The element with xpath " +xpathVal+ " is not visible in the application","fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is not interactable in the application");
			reportStep("The element with xpath " +xpathVal+ " is not interactable in the application","fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xpath " +xpathVal+ " is not stable in the application");
			reportStep("The element with xpath " +xpathVal+ " is not stable in the application","fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("Unable to get the text for the element with id " +xpathVal+ " due to unknown error");
			reportStep("Unable to get the text for the element with xpath " +xpathVal+ " due to unknown error","fail");
		}
		
		/*
		 * finally {
		 * 
		 * takeSnap();
		 * 
		 * 
		 * }
		 */
		return getText;
	}

	
	

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dValue=driver.findElementById(id);
			Select dropValue=new Select(dValue);
			dropValue.selectByVisibleText(value);
			System.out.println("The Element with id "+id+ " is selected the text value " +value+ "  in dropdown");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with id "+id+ " is not present in the DOM" );
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The Element with id "+id+ " is not visible in the application" );
		}
		catch(ElementNotSelectableException e)
		{
			System.err.println("The Element with id "+id+ " is not selected the text value " +value+ " in dropdown");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The Element with id "+id+ " is not interactable with the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The Element with id "+id+ " is  not stable in the application");
		}
		
				
		catch(WebDriverException e)
		{
			System.err.println("The Element with id "+id+ " is not selected with text value" +value+ "in dropdown due to unknown error");
		}
		
		finally
		{
		
				takeSnap();
				
		}
		
	}
	
	

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement dValue=driver.findElementById(id);
			Select dropValue=new Select(dValue);
			dropValue.selectByIndex(value);
			System.out.println("The Element with id "+id+ " is selected with the index" +value+ " in dropdown");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with id "+id+ " is not found in DOM");
		}
		
		catch(ElementNotVisibleException e)
		{
			System.err.println("The Element with id "+id+ " is not visible in the application");
		}
		catch(ElementNotSelectableException e)
		{
			System.err.println("The Element with id "+id+ " is not selected the index value" +value+ "in dropdown");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The Element with id "+id+ " is not interactable with the application");
			
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The Element with id "+id+ " is not stable in the application");
		}
		/*
		 * catch (NumberFormatException e) {
		 * System.err.println("The Element with id "+id+
		 * " is number format exception in the application"); }
		 */
		catch(WebDriverException e)
		{
			System.err.println("The Element with id "+id+ " is not selected with the index value" +value+ "in dropdown due to unknown error");
		}
		
		finally
		{
			
				takeSnap();
			
			
		}
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			String winIdBeforClick=driver.getWindowHandle();
			Set<String> allWinIdAfterClick =  driver.getWindowHandles();
			
			System.out.println(allWinIdAfterClick);
			
			for(String eachId : allWinIdAfterClick) {
				
				System.out.println(eachId);
				
				driver.switchTo().window(eachId);
			}
			driver.switchTo().window(winIdBeforClick); 
			System.out.println("Application control is switched to parent window successfully");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("Application control is not switched to parent window due to no such window is opened in the application"); 
		}
		catch(SessionNotCreatedException e)
		{
			System.err.println("Application control is not switched to parent window due to no session is created for the parent window"); 
		}
		catch(WebDriverException e)
		{
			System.err.println("Application control is not switched to parent window due to unknown error"); 
		}
		
		finally
		{
			takeSnap();
		}
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set <String> allWindHandles=driver.getWindowHandles();
				for (String eachId: allWindHandles)
				{
					driver.switchTo().window(eachId);
				}
				
				System.out.println("Application control is switched to last window successfully");
				reportStep("Application control is switched to last window successfully", "Pass",false);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			reportStep("Application control is not switched to last window due to no such window is opened in the application", "Fail", false);
			System.err.println("Application control is not switched to last window due to no such window is opened in the application");
		}
		
		catch(SessionNotCreatedException e)
		{
			System.err.println("Application control is not switched to last window due to no session is created for the last window");
			reportStep("Application control is not switched to last window due to no session is created for the last window", "Fail", false);
		}
		
		catch(WebDriverException e)
		{
			System.err.println("Application control is not switched to last window due to unknown error ");
			reportStep("Application control is not switched to last window due to unknown error ", "Fail", false);
		}
		
		/*
		 * finally {
		 * 
		 * takeSnap();
		 * 
		 * }
		 */
		}
	

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Alert message is accepted sucessfully");
			reportStep("Alert message is accepted sucessfully", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Alert message is not accepted due to no alert is present in the application");
			reportStep("Alert message is not accepted due to no alert is present in the application", "Fail");
		}
		catch(UnhandledAlertException e)
		{
			//System.err.println("Alert message is not accepted due to unhandled alert occured in the applocation");
			reportStep("Alert message is not accepted due to unhandled alert occured in the applocation", "Fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("Alert message is not accepted due to unknown error");
			reportStep("Alert message is not accepted due to unknown error", "Fail");
		}
		/*
		 * finally {
		 * 
		 * takeSnap(); }
		 */
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Alert message is dismissed successfully");
			reportStep("Alert message is dismissed successfully", "Pass");
			
		} 
		catch(NoAlertPresentException e)
		{
			//System.err.println("Alert message is not dismissed due to no alert box is present in the application");
			reportStep("Alert message is not dismissed due to no alert box is present in the application", "Fail");
		}
		
		catch (WebDriverException e)
		{
			//System.err.println("Alert message is not dismissed  due to unknown error");
			reportStep("Alert message is not dismissed  due to unknown error", "Fail");
		}
		/*
		 * finally { takeSnap();
		 * 
		 * }
		 */
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText=null;
		try {
			 alertText=driver.switchTo().alert().getText();
			System.out.println("Text value of the alert is "+alertText);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("Unable to get alert text value due to no alert is present");
		}
		
		catch(WebDriverException e)
		{
			System.err.println("Unable to get alert text value due to unknown error");
		}
		
		/*
		 * finally {
		 * 
		 * takeSnap();
		 * 
		 * }
		 */
		return alertText;
	}

	@Override
	public long takeSnap()   {
		// TODO Auto-generated method stub
		long number = 0;
	try {
	number=(long)(Math.floor(Math.random()*100000000)+100000);
		File temp=driver.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./reports/Screenshots/"+number+".png");
		
		FileUtils.copyFile(temp, dest);
		
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return number;
	

		
	}

	@Override
	public void closeBrowser() {
	
	try {
		driver.close();
		
		System.out.println("Browser is closed succssfully");
		reportStep("Browser is closed succssfully", "Pass", false);
		
	} 
	
		catch(WebDriverException e)
	{
			System.err.println("Browser is not closed due to unknown error");
			reportStep("Browser is not closed due to unknown error", "Fail", false);
	}
	
	
	}

	@Override
	public void closeAllBrowsers() {
	
		try {
			driver.quit();
			System.out.println("All the browsers are closed successfully");
			reportStep("All the browsers are closed successfully", "Pass", false);
			
		}
		
		catch(WebDriverException e)
		{
			System.err.println("All the browsers are not closed due to unknown error");
			reportStep("All the browsers are not closed due to unknown error", "Fail", false);
		}
		
		
		}

	@Override
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void selectVisibleTextByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		
		try {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement dValue=driver.findElementByXPath(xpathVal);
			Select dropValue=new Select(dValue);
			waitProperty(4000);
			dropValue.selectByVisibleText(value);
			//System.out.println("The Element with xpath "+xpathVal+ " is selected the text value " +value+ "in dropdown");
			reportStep("The Element with xpath "+xpathVal+ " is selected the text value " +value+ " in dropdown", "Pass");
		} 
		
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with xpath "+xpathVal+ " is not present in the DOM" );
			reportStep("The Element with xpath "+xpathVal+ " is not present in the DOM","Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with xpath "+xpathVal+ " is not visible in the application" );
			reportStep("The Element with xpath "+xpathVal+ " is not visible in the application", "Fail");
		}
		catch(ElementNotSelectableException e)
		{
			//System.err.println("The Element with xpath "+xpathVal+ " is not selected the text value" +value+ "in dropdown");
			reportStep("The Element with xpath "+xpathVal+ " is not selected the text value" +value+ "in dropdown","Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with xpath "+xpathVal+ " is not interactable with the application");
			reportStep("The Element with xpath "+xpathVal+ " is not interactable with the application","Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with xpath "+xpathVal+ " is  not stable in the application");
			reportStep("The Element with xpath "+xpathVal+ " is  not stable in the application","Fail");
		}
		
				
		catch(WebDriverException e)
		{
			//System.err.println("The Element with xpath "+xpathVal+ " is not selected with text value " +value+ "in dropdown due to unknown error");
		reportStep("The Element with xpath "+xpathVal+ " is not selected with text value " +value+ "in dropdown due to unknown error","Fail");
		}
		/*
		 * finally {
		 * 
		 * takeSnap();
		 * 
		 * }
		 */
		
	}

	@Override
	public void selectIndexByXapth(String xpathVal, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dValue=driver.findElementByXPath(xpathVal);
			Select dropValue=new Select(dValue);
			dropValue.selectByIndex(value);
			System.out.println("The Element with xpath "+xpathVal+ " is selected the text value" +value+ "in dropdown");
		} 
		
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with xpath "+xpathVal+ " is not present in the DOM" );
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is not visible in the application" );
		}
		catch(ElementNotSelectableException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is not selected the text value" +value+ "in dropdown");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is not interactable with the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is  not stable in the application");
		}
		
				
		catch(WebDriverException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is not selected with text value" +value+ "in dropdown due to unknown error");
		}
		
		finally
		{
		
				takeSnap();
				
		}
		
		
	}

	@Override
	public void selectVisibleValueByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement dValue=driver.findElementByXPath(xpathVal);
			Select dropValue=new Select(dValue);
			waitProperty(4000);
			dropValue.selectByValue(value);
			//System.out.println("The Element with xpath "+xpathVal+ " is selected the text value" +value+ "in dropdown");
			reportStep("The Element with xpath "+xpathVal+ " is selected the text value" +value+ "in dropdown", "pass");
		} 
		
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with xpath "+xpathVal+ " is not present in the DOM" );
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is not visible in the application" );
		}
		catch(ElementNotSelectableException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is not selected the text value" +value+ "in dropdown");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is not interactable with the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is  not stable in the application");
		}
		
				
		catch(WebDriverException e)
		{
			System.err.println("The Element with xpath "+xpathVal+ " is not selected with text value" +value+ " in dropdown due to unknown error");
		}
		
		finally
		{
		
				takeSnap();
				
		}
		
		
	}

	@Override
	public void selectVisibleValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dValue=driver.findElementById(id);
			Select dropValue=new Select(dValue);
			dropValue.selectByValue(value);
			System.out.println("The Element with id "+id+ " is selected the text value" +value+ "in dropdown");
		} 
		
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with id "+id+ " is not present in the DOM" );
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The Element with id "+id+ " is not visible in the application" );
		}
		catch(ElementNotSelectableException e)
		{
			System.err.println("The Element with id "+id+ " is not selected the text value" +value+ "in dropdown");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The Element with xpath "+id+ " is not interactable with the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The Element with id "+id+ " is  not stable in the application");
		}
		
				
		catch(WebDriverException e)
		{
			System.err.println("The Element with id "+id+ " is not selected with text value" +value+ " in dropdown due to unknown error");
		}
		
		finally
		{
		
				takeSnap();
				
		}
		
		
	}
	@Override
	public void selectVisibleValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dValue=driver.findElementByName(name);
			Select dropValue=new Select(dValue);
			dropValue.selectByValue(value);
			System.out.println("The Element with name "+name+ " is selected the  value" +value+ "in dropdown");
		} 
		
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with name "+name+ " is not present in the DOM" );
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The Element with name "+name+ " is not visible in the application" );
		}
		catch(ElementNotSelectableException e)
		{
			System.err.println("The Element with name "+name+ " is not selected the value" +value+ "in dropdown");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The Element with name "+name+ " is not interactable with the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The Element with name "+name+ " is  not stable in the application");
		}
		
				
		catch(WebDriverException e)
		{
			System.err.println("The Element with name "+name+ " is not selected with text value" +value+ " in dropdown due to unknown error");
		}
		
		finally
		{
		
				takeSnap();
				
		}
		
		
	}
	@Override
	public void selectIndexByName(String name, int value) {
		try {
			WebElement dValue=driver.findElementByName(name);
			Select dropValue=new Select(dValue);
			dropValue.selectByIndex(value);
			System.out.println("The Element with name "+name+ " is selected with the index" +value+ " in dropdown");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with name "+name+  " is not found in DOM");
		}
		
		catch(ElementNotVisibleException e)
		{
			System.err.println("The Element with name "+name+ " is not visible in the application");
		}
		catch(ElementNotSelectableException e)
		{
			System.err.println("The Element with name "+name+ " is not selected the index value" +value+ "in dropdown");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The Element with name "+name+ " is not interactable with the application");
			
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The Element with name "+name+ " is not stable in the application");
		}
		
		catch(WebDriverException e)
		{
			System.err.println("The Element with name "+name+ " is not selected with the index value" +value+ "in dropdown due to unknown error");
		}
		
		finally
		{
			
				takeSnap();
			
			
		}
	}

	

	@Override
	public void switchToFramebyId(String Id) {
		// TODO Auto-generated method stub
		try {
			WebElement frameValue=driver.findElementById(Id);
			driver.switchTo().frame(frameValue);
			System.out.println("The frame  with id " +Id+ " is switched successfully");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The frame  with id " +Id+ "is not found in DOM");
			
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The frame  with id " +Id+ "is not visible in the application");
		}
		catch (ElementNotInteractableException e)
		{
			System.err.println("The frame  with id " +Id+ "is not interactable in the application");
		}
		catch (NoSuchWindowException e) {
			
			System.err.println("The frame  with id " +Id+ "is not found due to no such window exception");
	}
		catch (WebDriverException e) 
		{
			System.err.println("The frame  with id " +Id+ "is not found due to unknown error");
		}
		
}

	@Override
	public String getAlertTextNoSnap() {
		// TODO Auto-generated method stub
		String alertText=null;
		try {
			//waitProperty(1000);
			 alertText=driver.switchTo().alert().getText();
			System.out.println("Text value of the alert is "+alertText);
			reportStep("Text value of the alert is "+alertText, "Pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("Unable to get alert text value due to no alert is present");
			reportStep("Unable to get alert text value due to no alert is present", "fail",false);
		}
		
		catch(WebDriverException e)
		{
			System.err.println("Unable to get alert text value due to unknown error");
			reportStep("Unable to get alert text value due to unknown error", "fail",false);
		}
		return alertText;
	}

	@Override
	public void switchToParentFrame() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
			System.out.println("Switched to main frame sucessfully");
			reportStep("Switched to main frame sucessfully", "Pass", false);
		}
		catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			System.err.println("No such frame exception is occurred");
			reportStep("No such frame exception is occurred", "fail", false);
			
	
	}
		catch (WebDriverException e) 
		{
			//System.err.println("Unable to switch main frame  due to unknown error");
			reportStep("Unable to switch main frame  due to unknown error", "fail", false);
		}
		
}

	@Override
	public void enterTextAlertBox(String data) {
		// TODO Auto-generated method stub
		try {
			
			driver.switchTo().alert().sendKeys(data);
			
			System.out.println("Given text " +data+ " is entered in alert textbox");
			reportStep("Given text " +data+ " is entered in alert textbox", "Pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("Given text " +data+ " is not entered in alertbox due to no alert is present");
			reportStep("Given text " +data+ " is not entered in alertbox due to no alert is present", "Fail",false);
		}
		
		catch(WebDriverException e)
		{
			System.err.println("Given text " +data+ " is not entered in alertbox due to unknown error");
			reportStep("Given text " +data+ " is not entered in alertbox due to unknown error", "Fail",false);
		}
		}

	@Override
	public void pageRefresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			System.out.println("Current page is refreshed sucessfully");
			reportStep("Current page is refreshed sucessfully", "Pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Current page is not refreshed due to unknown error");
			reportStep("Current page is not refreshed due to unknown error", "Fail", false);
		}
		
	}
	

	@Override
	public void selectVisibleTextByName(String name, String value) {
		try {
			WebElement dValue=driver.findElementByName(name);
			Select dropValue=new Select(dValue);
			dropValue.selectByVisibleText(value);
			System.out.println("The Element with name "+name+ " is selected with the visible text" +value+ " in dropdown");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with name "+name+  " is not found in DOM");
		}
		
		catch(ElementNotVisibleException e)
		{
			System.err.println("The Element with name "+name+ " is not visible in the application");
		}
		catch(ElementNotSelectableException e)
		{
			System.err.println("The Element with name "+name+ " is not selected the visible text " +value+ " in dropdown");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The Element with name "+name+ " is not interactable with the application");
			
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The Element with name "+name+ " is not stable in the application");
		}
		
		catch(WebDriverException e)
		{
			System.err.println("The Element with name "+name+ " is not selected with the visible text " +value+ " in dropdown due to unknown error");
		}
		
		finally
		{
			
				takeSnap();
			
			
		}
	}

	@Override
	public void keysTabActionByxpath(String xpathVal) {
		
		
			
				try {
					
				driver.findElementByXPath(xpathVal).sendKeys(Keys.TAB);

				//System.out.println("Tab key is pressed");
				reportStep("Tab key is pressed", "Pass",false);
				} 
		
		catch(NoSuchElementException e)
		{
			
			//System.err.println("The element with id " +xpathVal+ " is not  not present in DOM");
			reportStep("The element with id " +xpathVal+ " is not  not present in DOM", "Fail", false);
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with id " +xpathVal+ " is not visible in the application");
			reportStep("The element with id " +xpathVal+ " is not visible in the application", "Fail", false);
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with id " +xpathVal+ " is not interactable in the application");
			reportStep("The element with id " +xpathVal+ " is not interactable in the application", "Fail", false);
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with id " +xpathVal+ " is not stable in the application");
			reportStep("The element with id " +xpathVal+ " is not stable in the application", "Fail", false);
		}
				catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Keys action not happened due to unknown error");
			reportStep("Keys action not happened due to unknown error", "Fail", false);
		}
 }
	@Override
	public void keysTabActionById(String id) {
		
		
			
				try {
					
				driver.findElementById(id).sendKeys(Keys.TAB);

				System.out.println("Tab key is pressed");
				} 
		
		catch(NoSuchElementException e)
		{
			
			System.err.println("The element with id " +id+ " is not  not present in DOM");
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The element with id " +id+ " is not visible in the application");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with id " +id+ " is not interactable in the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with id " +id+ " is not stable in the application");
		}
				catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Keys action not happened due to unknown error");
		}
 }
 


	@Override
	public void keysPageDownActionByXpath(String xpathVal) {

		try {
			
		driver.findElementByXPath(xpathVal).sendKeys(Keys.PAGE_DOWN);

		//System.out.println("The page is moved downwards");
		reportStep("The page is moved downwards", "Pass", false);
		waitProperty(3000);
		} 

catch(NoSuchElementException e)
{
	
	//System.err.println("The element with xpath " +xpathVal+ " is not  present in DOM");
	reportStep("The element with xpath " +xpathVal+ " is not  present in DOM", "Fail", false);
}
catch(ElementNotVisibleException e)
{
	//System.err.println("The element with xpath " +xpathVal+ " is not visible in the application");
	reportStep("The element with xpath " +xpathVal+ " is not visible in the application", "Fail", false);
}
catch(ElementNotInteractableException e)
{
	//System.err.println("The element with xpath " +xpathVal+ " is not interactable in the application");
	reportStep("The element with xpath " +xpathVal+ " is not interactable in the application", "Fail", false);
}
catch(StaleElementReferenceException e)
{
	//System.err.println("The element with xpath " +xpathVal+ " is not stable in the application");
	reportStep("The element with xpath " +xpathVal+ " is not stable in the application", "Fail", false);
}
		catch (WebDriverException e) {
	// TODO Auto-generated catch block
	//System.err.println("The page is not moved downwards due to unknown error");
	reportStep("The page is not moved downwards due to unknown error", "Fail", false);
}
		
	}

	@Override
	public void keysPageUpActionByXpath(String xpathVal) {
		try {
			
			driver.findElementByXPath(xpathVal).sendKeys(Keys.PAGE_UP);
			reportStep("The page is moved upwards", "Pass", false);

			//System.out.println("The page is moved upwards");
			} 

	catch(NoSuchElementException e)
	{
		
		//System.err.println("The element with xpath " +xpathVal+ " is not  present in DOM");
		reportStep("The element with xpath " +xpathVal+ " is not  present in DOM", "Fail", false);
	}
	catch(ElementNotVisibleException e)
	{
		//System.err.println("The element with xpath " +xpathVal+ " is not visible in the application");
		reportStep("The element with xpath " +xpathVal+ " is not visible in the application", "Fail", false);
	}
	catch(ElementNotInteractableException e)
	{
		reportStep("The element with xpath " +xpathVal+ " is not interactable in the application", "Fail", false);
		//System.err.println("The element with xpath " +xpathVal+ " is not interactable in the application");
	}
	catch(StaleElementReferenceException e)
	{
		reportStep("The element with xpath " +xpathVal+ " is not stable in the application", "Fail", false);
		//System.err.println("The element with xpath " +xpathVal+ " is not stable in the application");
	}
			catch (WebDriverException e) {
		// TODO Auto-generated catch block
		//System.err.println("The page is not moved upwards due to unknown error");
		reportStep("The page is not moved upwards due to unknown error", "Fail", false);
	}
			
		
	}

	@Override
	public String getDateByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String elementVal = null;
		try {
			WebElement element=driver.findElementByXPath(xpathVal);
			 elementVal=element.getAttribute("value");
			
			System.out.println("The element with xpath " +xpathVal+ " is holding the text value is " +elementVal);
			
			
					
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath " +xpathVal+ " is not found in DOM");
		}
		catch(ElementNotVisibleException e)
		{
			System.err.println("The element with xpath " +xpathVal+ " is not visible in the application");
		}
		catch(ElementNotInteractableException e)
		{
			System.err.println("The element with xpath " +xpathVal+ " is not interactable in the application");
		}
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with xpath " +xpathVal+ " is not stable in the application");
		}
		
		catch(WebDriverException e)
		{
			System.err.println("Unable to get the text for the element with id " +xpathVal+ " due to unknown error");
		}
		
		finally
		{
			
				takeSnap();
			
			
		}
		
		return elementVal;
	
	}

	/*
	 * @Override public String hotelPriceGSTcalc(String noOfDays,String
	 * hotPrice,String GSTXpathVal) { String hotelTotPrice=0,TotalPrice=0; // TODO
	 * Auto-generated method stub hotelTotPrice=(noOfDays*hotPrice);
	 * TotalPrice=hotelTotPrice+GSTXpathVal; return TotalPrice; }
	 */



	/*
	 * @Override public float getDayCount(String xpathVal1, String xpathVal2) { //
	 * TODO Auto-generated method stub SimpleDateFormat myFormat = new
	 * SimpleDateFormat("dd/MM/yyyy"); String strdate1=getDateByXpath(xpathVal1);
	 * String strdate2=getDateByXpath(xpathVal2); Date date1 = null; try { date1 =
	 * myFormat.parse(strdate1); } catch (ParseException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } Date date2 = null; try { date2 =
	 * myFormat.parse(strdate2); } catch (ParseException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * long difference = date2.getTime() - date1.getTime(); float noOfDays =
	 * (difference / (1000*60*60*24));
	 * 
	 * 
	 * System.out.println(noOfDays); return noOfDays; }
	 */
	/*
	 * @Override public double hotelPriceGSTcalc(float noOfDays, double hotelPrice,
	 * double GST) { // TODO Auto-generated method stub double
	 * hotelTotoalPrice=0,TotalPrice=0; hotelTotoalPrice=(noOfDays*hotelPrice);
	 * TotalPrice=hotelTotoalPrice+GST; return TotalPrice; }
	 */
	


	//this method is used to mousehover the element by using xpath
public void mouseHoverByXpath(String xpathVal)
{
	WebElement ele=driver.findElementByXPath(xpathVal);
	Actions builder = new Actions(driver);
	builder.moveToElement(ele).perform();
}

@Override
public void switchToFramebyXpath(String xpathVal) {
	// TODO Auto-generated method stub
	try {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frameValue=driver.findElementByXPath(xpathVal);
		
		driver.switchTo().frame(frameValue);
		//System.out.println("The frame  with xpath " +xpathVal+ " is switched successfully");
		reportStep("The frame  with xpath " +xpathVal+ " is switched successfully", "pass",false);
	}
	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The frame  with xpath " +xpathVal+ "is not found in DOM");
		reportStep("The frame  with xpath " +xpathVal+ " is switched successfully", "Fail",false);
		
	}
	catch(ElementNotVisibleException e)
	{
		//System.err.println("The frame  with xpath " +xpathVal+ "is not visible in the application");
		reportStep("The frame  with xpath " +xpathVal+ "is not visible in the application", "Fail",false);
		
	}
	catch (ElementNotInteractableException e)
	{
		System.err.println("The frame  with xpath " +xpathVal+ "is not interactable in the application");
	}
	catch (NoSuchWindowException e) {
		
		System.err.println("The frame  with xpath " +xpathVal+ "is not found due to no such window exception");
}
	catch (WebDriverException e) 
	{
		System.err.println("The frame  with xpath " +xpathVal+ "is not found due to unknown error");
		reportStep("The frame  with xpath " +xpathVal+ "is not found due to unknown error", "fail");
	}
	
}
	

@Override
public void selectIndexByXpath(String xpathVal, int value) {
	try {
		WebElement dValue=driver.findElementByXPath(xpathVal);
		Select dropValue=new Select(dValue);
		dropValue.selectByIndex(value);
		//System.out.println("The Element with XPath "+xpathVal+ " is selected with the index" +value+ " in dropdown");
		startTest("The Element with XPath "+xpathVal+ " is selected with the index" +value+ " in dropdown", "pass");
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with XPath "+xpathVal+  " is not found in DOM");
		startTest("The Element with XPath "+xpathVal+  " is not found in DOM", "fail");
	}
	
	catch(ElementNotVisibleException e)
	{
		//System.err.println("The Element with XPath "+xpathVal+ " is not visible in the application");
		startTest("The Element with XPath "+xpathVal+ " is not visible in the application", "fail");
	}
	catch(ElementNotSelectableException e)
	{
		//System.err.println("The Element with XPath "+xpathVal+ " is not selected the index value" +value+ "in dropdown");
		startTest("The Element with XPath "+xpathVal+ " is not selected the index value" +value+ "in dropdown", "fail");
	}
	catch(ElementNotInteractableException e)
	{
		//System.err.println("The Element with XPath "+xpathVal+ " is not interactable with the application");
		startTest("The Element with XPath "+xpathVal+ " is not interactable with the application","fail");
		
	}
	catch(StaleElementReferenceException e)
	{
		//System.err.println("The Element with XPath "+xpathVal+ " is not stable in the application");
		startTest("The Element with XPath "+xpathVal+ " is not stable in the application","fail");
	}
	
	catch(WebDriverException e)
	{
		//System.err.println("The Element with XPath "+xpathVal+ " is not selected with the index value" +value+ "in dropdown due to unknown error");
		startTest("The Element with XPath "+xpathVal+ " is not selected with the index value" +value+  "in dropdown due to unknown error","fail");
	}
}	
public int dateSelectionMonthYr(String xpathValMonthYear,String xpathValArrow,String xpathValDay,int dayCount) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM.yyyy");
	java.util.Date sysDate = new java.util.Date();
	
	String date1 = sdf.format(sysDate);
	
	System.out.println(date1);
	
	String onlyDay = date1.substring(0,2);
	
	System.out.println(onlyDay);
	
	int day = Integer.parseInt(onlyDay)+dayCount;
	
	System.out.println(day);
	String onlyMonth = date1.substring(3,6);
	System.out.println(onlyMonth);
	String onlyYear = date1.substring(7,11);
	System.out.println(onlyYear);
	String monthYear=onlyMonth+" "+onlyYear;
	System.out.println(monthYear);
	while(true)
	{
	
	String calMonthYear=driver.findElementByXPath(xpathValMonthYear).getText();
	if(calMonthYear.equals(calMonthYear))
	{
		System.out.println("Selected Month Year value is: " +xpathValArrow);
		break;
		
	}
	
	else
	{
		driver.findElementByXPath(xpathValArrow).click();
	}
	
	driver.findElementByXPath(xpathValDay).click();;
}
	return day;
}

//need to recheck once
public int dateSelection(String xpathValMonthYear,String xpathValArrow,String xpathValDay,int dayCount) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
	java.util.Date sysDate = new java.util.Date();
	
	String date1 = sdf.format(sysDate);
	
	System.out.println(date1);
	
	String onlyDay = date1.substring(0,2);
	
	System.out.println(onlyDay);
	
	int day = Integer.parseInt(onlyDay)+dayCount;
	
	System.out.println(day);
	String onlyMonth = date1.substring(3,6);
	System.out.println(onlyMonth);
	String onlyYear = date1.substring(7,11);
	System.out.println(onlyYear);
	String monthYear=onlyMonth+" "+onlyYear;
	System.out.println(monthYear);
	while(true)
	{
	
	String calMonthYear=driver.findElementByXPath(xpathValMonthYear).getText();
	if(calMonthYear.equals(calMonthYear))
	{
		System.out.println("Selected Month Year value is: " +xpathValArrow);
		break;
		
	}
	
	else
	{
		driver.findElementByXPath(xpathValArrow).click();
	}
	
	driver.findElementByXPath(xpathValDay).click();;
}
	return day;
}

public int getCurrentDay(int dayCount) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
	java.util.Date sysDate = new java.util.Date();
	String date1 = sdf.format(sysDate);	
	reportStep("Current Date is:" +date1, "Pass");
	String onlyDay = date1.substring(0,2);	
	reportStep("Today Date is:" +onlyDay, "Pass");	
	 day = Integer.parseInt(onlyDay)+dayCount;	
	reportStep("Selection Date is:" +day, "Pass");	
	//System.out.println(day);
	/*
	 * String onlyMonth = date1.substring(3,6); System.out.println(onlyMonth);
	 * String onlyYear = date1.substring(7,11);
	 */
		
	//driver.findElementByXPath(xpathVal).click();;

	return day;
}

@Override
public float getDayCount(String xpathVal1, String xpathVal2) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double hotelPriceGSTcalc(float noOfDays, double hotelPrice, double GST) {
	// TODO Auto-generated method stub
	return 0;
}
}
	