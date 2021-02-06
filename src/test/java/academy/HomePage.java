package academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.FormMyAddressBook;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.MyAddressBook;

public class HomePage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	public WebDriver driver;

	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException 

	{
		driver = initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");

		//one is inheritance
		// creating object to that class and invoke method of it
		LandingPage l = new LandingPage(driver);
		l.getLogin().click(); //driver.findElement (By.xpath)
		l.getSignIn().click();//driver.findElement(By.xpath)
		
		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(Username);
		lp.getpassword().sendKeys(Password);
		lp.getsubmit().click();		

		MyAddressBook mab = new MyAddressBook(driver);
		mab.getpathtoaddresbook().click();
		mab.getaddressbook().click();
		mab.getaddanewship().click();
		log.info("Navigate to addressbook form");
		
		// Address Book
		/*FormMyAddressBook fmab = new FormMyAddressBook(driver);
		fmab.getFirstName().sendKeys("sd");
		fmab.getLastName().sendKeys("aa");
		fmab.getCompanyName().sendKeys("ss");
		fmab.getStreetAddress().sendKeys("ae");
		fmab.getApt().sendKeys("io");
		fmab.getCountry().sendKeys("United States of America");
		fmab.getCity().sendKeys("Charlotte");
		fmab.getState().sendKeys("North Carolina");
        fmab.getPhonenumber().sendKeys("7047104122");
        fmab.getExt().sendKeys("");
        fmab.getZipCode().sendKeys("28277");*/
	}
	
	@DataProvider
	public  Object[][] getData() 
	{
		//rows stands for how many diffrent data types test should run
		//coloumn stands for how many values per each test
		Object[][] data = new Object[1][2];
		//0th row
		data[0][0]  = "srikanthtesting100@gmail.com";
		data[0][1]	="password123";
		//1st row
		/*data[1][0] = "monika.mankotia@hotmail.com";
    	data[1][1] = "aaaaa";*/

		return data;
	}
	 @AfterTest
	 public void teardown() 
	 {
		 driver.close();
	 }
}
