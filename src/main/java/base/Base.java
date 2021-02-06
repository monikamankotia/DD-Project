package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public Properties prop;
	private OutputType<File> OutputType;
	public WebDriver initializeDriver() throws IOException
	{
		WebDriver driver = null;
		 prop = new Properties();
		FileInputStream fls = new FileInputStream("C:\\Monika\\Testing\\Project\\DollarDaysProject\\src\\main\\java\\resources\\data.properties");
		
		
		prop.load(fls);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Monika\\Testing\\selenium-software\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			//execute in chrome driver
		}
		else if (browserName.equals("firefox"))
			
		{
			driver = new FirefoxDriver();
			//execute in firefox driver
		}
		else if (browserName.equals("IE"))
		{
			//execute in InternetExplorer
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		return driver;
		
	}
	public String getScreenshotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}

}
