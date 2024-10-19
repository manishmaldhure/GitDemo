package PackRadio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	//	Thread.sleep(2000);
		WebDriverWait wt=new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("iframe")));
	//	WebElement frame1=driver.findElement(By.xpath("//div[contains(@class,'themeContainer')]"));
		WebElement frame1=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame1);
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='close']")).click();
		driver.switchTo().defaultContent();
	}

}
