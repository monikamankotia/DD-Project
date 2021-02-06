package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormMyAddressBook {

	public WebDriver driver;
	By FirstName = By.xpath("//*[@id=\"ctl00_cphContent_txtfirstname\"]");
	By LastName = By.xpath("//*[@id=\"ctl00_cphContent_txtlastname\"]");
	By CompanyName = By.xpath("//*[@id=\"ctl00_cphContent_txtAddrshipcompany\"]");
	By StreetAddress = By.xpath("//*[@id=\"ctl00_cphContent_txtAddrshipaddr1\"]");
	By Apt  = By.xpath("//*[@id=\"ctl00_cphContent_txtAddrshipaddr2\"]");
	By Country = By.xpath("//*[@id=\"ctl00_cphContent_ddlcountry\"]");
	By City = By.xpath("//*[@id=\"ctl00_cphContent_txtAddrshipcity\"]");
	By State = By.xpath("//*[@id=\"ctl00_cphContent_ddlshipstate\"]");
	By Phonenumber = By.xpath("//*[@id=\"ctl00_cphContent_txtAddrshipphone\"]");
	By Ext =By.xpath("//*[@id=\"ctl00_cphContent_txtAddrshipphoneExt\"]");
	By ZipCode = By.xpath("//*[@id=\"txtAddrshipzip\"]");
    //By SaveChange = By.xpath("//*[@id=\"ctl00_cphContent_btnAddAddress\"]");
	By FirstRadioButton = By.xpath("//*[@id=\"divTxtShipAddr\"]/div/div[12]/div/ul/li[1]/label");
	By SecondRadioButton = By.xpath("//*[@id=\"divTxtShipAddr\"]/div/div[12]/div/ul/li[2]/label");
	By ThirdRadioButton = By.xpath("//*[@id=\"divTxtShipAddr\"]/div/div[12]/div/ul/li[3]/label");
	By SaveChange = By.xpath("//*[@id=\"ctl00_cphContent_btnAddAddress\"]");
	
	
	
	public FormMyAddressBook(WebDriver driver) {
		// TODO Auto-generated constructor 
		this.driver = driver;
	}
	public WebElement getFirstName()
	{
		return driver.findElement(FirstName);
	}
	public WebElement getLastName()
	{
		return driver.findElement(LastName);
	}

	public WebElement getCompanyName()
	{
		return driver.findElement(CompanyName);
	}
	public WebElement getStreetAddress()
	{
		return driver.findElement(StreetAddress);
	}

	public WebElement getApt()
	{
		return driver.findElement( Apt);
	}
	public WebElement getCountry()
	{
		return driver.findElement(Country);
	}

	public WebElement getCity()
	{
		return driver.findElement( City);
	}
	public WebElement getState()
	{
		return driver.findElement(State);
	}
	public WebElement getPhonenumber()
	{

		return driver.findElement(Phonenumber);
	}

	public WebElement getExt()
	{
		return driver.findElement(Ext);

	}
     public WebElement getZipCode()
     {
    	 return driver.findElement(ZipCode);
     }

  /*   public WebElement getSaveChange()
     {
    	 
    	 return driver.findElement(SaveChange);
     }*/
      public WebElement getFirstRadioButton()
      {
    	  
    	  return driver.findElement(FirstRadioButton);
      }
      public WebElement getSecondRadioButton() 
      {
    	 return driver.findElement(SecondRadioButton); 
    	  
      }
      public WebElement getthirdRadioButton() 
      {
    	  return driver.findElement(ThirdRadioButton);
      }
      
      public WebElement getSaveChange()
      {
     	 
     	 return driver.findElement(SaveChange);
      }
    
      
      
}











