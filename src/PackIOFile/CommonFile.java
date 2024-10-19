package PackIOFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonFile {
	//private static ChromeDriver driver;

	public static  WebDriver driver;
	
	public static WebDriver createDriver(String br)
	{
		
		if(br.equalsIgnoreCase("chrome"))
		{
			System.out.println("chrome browser..");
		System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
		else if (br.equalsIgnoreCase("firefox")) {
			
			System.out.println("firefox browser..");
			System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		else
		{
			System.out.println("invalid input..");
		}
		return driver;
	}

	public static Properties createProperty() throws IOException
	{
		File src1=new File("D:\\MVM\\Eclipse_WorkSpace\\TestProjectShammi\\Repository\\config.properties");
		File src2=new File("D:\\MVM\\Eclipse_WorkSpace\\TestProjectShammi\\Repository\\testdata.properties");
		File src3=new File("D:\\MVM\\Eclipse_WorkSpace\\TestProjectShammi\\Repository\\locators.properties");
		
		FileInputStream fis1=new FileInputStream(src1);
		FileInputStream fis2=new FileInputStream(src2);
		FileInputStream fis3=new FileInputStream(src3);
		
		Properties pro1=new Properties();
		pro1.load(fis1);
		pro1.load(fis2);
		pro1.load(fis3);
		return pro1;
	}
	
	public static Logger getlogger()
	{
		Logger logger=Logger.getLogger("CommonFile");
		PropertyConfigurator.configure("D:\\MVM\\Eclipse_WorkSpace\\TestProjectShammi\\Repository\\log4j.properties");
		
		return logger;
	}
	
}
