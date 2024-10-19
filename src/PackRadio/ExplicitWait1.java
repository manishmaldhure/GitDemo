package PackRadio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		
		System.out.println(driver.findElement(By.id("email")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("email")).getSize().getWidth());
		
		WebDriverWait wt=new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		
		driver.findElement(By.id("pass")).sendKeys("Sanjay");
		
	}

}
