package PackRadio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//	WebDriver driver
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//2nd Way..
		
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		Thread.sleep(1000);
		System.out.println(radios.get(0).isDisplayed());
		Thread.sleep(1000);
		System.out.println(radios.get(1).isEnabled());
		Thread.sleep(1000);
		System.out.println(radios.get(2).isSelected());
		Thread.sleep(1000);
		
		radios.get(2).click();
		System.out.println(radios.get(2).isSelected());
		
		// 3rd Way..
		Thread.sleep(2000);
		List<WebElement> radioList=driver.findElements(By.cssSelector("[class*='_58mt']"));
		System.out.println("Total radion buttons are.."+radioList.size());
		String expresult="Malee";
		String selresult = null;
		int m = 0;
		for(int i=0;i<radioList.size();i++)
		{
			if(radioList.get(i).getText().equalsIgnoreCase(expresult))
			{
				radioList.get(i).click();
				selresult=radioList.get(i).getText();
				break;
			}
			
		}
		System.out.println("Radio selected is .."+selresult);
		Assert.assertEquals(selresult, expresult);
		
		Thread.sleep(7000);
		driver.close();
	}

}
