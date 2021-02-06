package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddressBook {
	
	
	public WebDriver driver;
	By pathtoaddressbook = By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img");
	By addressbook = By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[7]/a");
	By addanewship = By.xpath("//*[@id=\"aspnetForm\"]/div[5]/div[1]/section/div/div[3]/div/div[2]/div/section/div[1]/div/a/div/h5");
	
	
	public MyAddressBook(WebDriver driver)
	{
		this.driver = driver;
	}	
		
	public WebElement getpathtoaddresbook()
	{
		return driver.findElement(pathtoaddressbook);
	}
	public WebElement getaddressbook()
	{
		return driver.findElement(addressbook);
	}
	public WebElement getaddanewship()
	{
		return driver.findElement(addanewship);
	}
	
		
	}
	
			

