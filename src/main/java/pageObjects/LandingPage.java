package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;

	By dropdownsignin = By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img");
	By signin = By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[2]/a");

	//By signin=By.cssSelector("a [href='#']");
	//By id = By.id("header-user");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getLogin()
	{
		return driver.findElement(dropdownsignin);
	}
	public WebElement getSignIn()
	{
		return driver.findElement(signin);
	}


}
