package PackIOFile;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logging1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Logger logger=CommonFile.getlogger();
		
System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		logger.info("driver created..");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info(" window maximized..");
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		driver.findElement(By.id("tabButton")).click();
		Set<String> tabIds=driver.getWindowHandles();
	}

}
