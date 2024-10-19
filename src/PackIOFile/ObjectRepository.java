package PackIOFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.UserDataHandler;

public class ObjectRepository {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		Logger logger=CommonFile.getlogger();
		
		Properties pro1=CommonFile.createProperty();
		logger.info("Property file object created..");
		 driver=CommonFile.createDriver("chrome");
		logger.info(" driver object created..");
		Thread.sleep(2000);
		driver.get(pro1.getProperty("URL"));
		logger.info(" url is launched..");
		Thread.sleep(2000);

		driver.findElement(By.xpath(pro1.getProperty("Email"))).sendKeys(pro1.getProperty("testdata1"));
		logger.info("data is entered in email field..");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro1.getProperty("Pass"))).sendKeys(pro1.getProperty("testdata2"));
		logger.info("data is entered in password field..");
		
		
	}

}
