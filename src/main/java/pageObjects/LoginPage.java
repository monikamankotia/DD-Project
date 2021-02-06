package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	By email = By.xpath("//*[@id=\"inputLoginUsername\"]");
	By password= By.xpath("//*[@id=\"inputLoginPassword\"]");
	By Submit = By.xpath("//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div[2]/div/div[1]/div/div/div[4]/button");

	//By email = By.id("inputLoginUsername");
	//By password = By.id("inputLoginPassword");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getsubmit()
	{
		return driver.findElement(Submit);
	}


}
