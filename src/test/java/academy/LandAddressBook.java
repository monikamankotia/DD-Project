package academy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.FormMyAddressBook;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.MyAddressBook;

public class LandAddressBook extends Base {

	public static Logger log = LogManager.getLogger(LandAddressBook.class.getName());

	public WebDriver driver;	

	@BeforeTest
	public void initilaize() throws IOException {
		//System.setProperty("log4j.configurationFile","C:\\Monika\\Testing\\Project\\DollarDaysProject\\src\\main\\resources\\log4j2.xml");
		driver = initializeDriver();
		log.info("Info: Driver is initialized");

		driver.get(prop.getProperty("url"));
		log.debug("Debug: Navigated to HomePage");

		driver.manage().window().maximize() ;

	}

	@Test(dataProvider="getLoginData", priority = 1)
	public void basePageNavigation(String Username,String Password) {
		//one is inheritance
		// creating object to that class and invoke method of it
		log.info("Info: basePageNavigation");
		LandingPage l = new LandingPage(driver);
		l.getLogin().click(); //driver.findElement (By.xpath)
		l.getSignIn().click();//driver.findElement(By.xpath)

		LoginPage lp = new LoginPage(driver);
		//		lp.getemail().sendKeys(Username);
		//		lp.getpassword().sendKeys(Password);
		lp.getemail().sendKeys(prop.getProperty("username"));
		lp.getpassword().sendKeys(prop.getProperty("password"));
		lp.getsubmit().click();		
	}

	@Test(priority = 2)
	public void navigateToAddressPage() {
		MyAddressBook mab = new MyAddressBook(driver);
		mab.getpathtoaddresbook().click();
		mab.getaddressbook().click();
		mab.getaddanewship().click();
	}

	@Test(dataProvider="getAddressBookData", priority = 3)
	public void addressBookDetails(String firstName,String lastName,String companyName,String streetAddress,
			String apt,String country,String city,String state,String phonenumber,String ext, String zipCode)

	{
		// Address Book
		FormMyAddressBook fmab = new FormMyAddressBook(driver);
		fmab.getFirstName().sendKeys(firstName);
		fmab.getLastName().sendKeys(lastName);
		fmab.getCompanyName().sendKeys(companyName);
		fmab.getStreetAddress().sendKeys(streetAddress);
		fmab.getApt().sendKeys(apt);
		fmab.getCountry().sendKeys(country);
		fmab.getCity().sendKeys(city);
		fmab.getState().sendKeys(state);
		fmab.getPhonenumber().sendKeys(phonenumber);
		fmab.getExt().sendKeys(ext);
		fmab.getZipCode().sendKeys(zipCode); 
		//fmab.getSaveChange().click();
		fmab.getFirstRadioButton().click();
		fmab.getSecondRadioButton().click(); // click on Radio Button
		fmab.getthirdRadioButton().click(); // Click on Radio button
		fmab.getSaveChange().click();// Click on Save Change


		//compare the text form the browser with actual text

		Assert.assertEquals(fmab.getSaveChange().getText(), "New Address Saved");
		//} catch(AssertionError ae) {
		log.error("Address is not saved");
	}



	@DataProvider
	public  Object[][] getLoginData() {
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


	@DataProvider
	public  Object[][] getAddressBookData() {
		//rows stands for how many diffrent data types test should run
		//coloumn stands for how many values per each test
		Object[][] data = new Object[2][11];
		//0th row
		data[0][0]  = "Mo";
		data[0][1]	="Ma";
		data[0][2]	="testComp";
		data[0][3]	="tst Street";
		data[0][4]	="tst apt";
		data[0][5]	="United States of America";
		data[0][6]	="Charlotte";
		data[0][7]	="North Carolina";
		data[0][8]	="7042343456";
		data[0][9]	="33";
		data[0][10]	="28277";

		//1st row
		data[1][0] = "am";
		data[1][1] = "ss";
		data[1][2] ="test";
		data[1][3] ="4000";
		data[1][4] = "22";
		data[1][5] = "United States of America";
		data[1][6] = "Farnklin";
		data[1][7] = "Tn";
		data[1][8] = "6155432549";
		data[1][9] = "37";
		data[1][10] = "37067";



		return data;
	}

	/*@AfterTest
	public void teardown() 
	{
		driver.close();
		log.info("dollardays website is closed");
	}*/


}




