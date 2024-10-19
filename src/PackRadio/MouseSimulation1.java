package PackRadio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		}catch (Exception e) {
			e.printStackTrace();
		}
		WebElement electro=driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		WebElement groc=driver.findElement(By.xpath("//div[text()='Grocery']"));
		
	//	a.moveToElement(fash).build().perform();
		
		a.sendKeys(groc, Keys.ENTER).build().perform();
		
		
	}

}
