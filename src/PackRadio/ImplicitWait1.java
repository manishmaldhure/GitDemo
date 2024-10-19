package PackRadio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("how stuff works");
		List<WebElement> AllSuggestions=driver.findElements(By.xpath("//ul[@role='listbox'][1]/li"));
		
		System.out.println(AllSuggestions.size());
		String expresult="how stuff works videos";
		Thread.sleep(2000);
		for(int i=0;i<AllSuggestions.size();i++)
		{
			if(AllSuggestions.get(i).getText().equalsIgnoreCase(expresult))
			{
				AllSuggestions.get(i).click();
				break;
			}
		}
		
		
	}

}
