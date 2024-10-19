package PackRadio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		//   //table[@class='dataTable']/tbody/tr/td/a
		//   //table[@class='dataTable']/tbody/tr/td[4]
		
		List<WebElement> companies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		List<WebElement> currentPrizes=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	
		Thread.sleep(1000);
		System.out.println("Companies count.."+companies.size());
		System.out.println("current prizes .."+currentPrizes.size());
		
		
		String expresult="Hind. Composites";
		
		
		for(int i=0;i<companies.size();i++)
		{
			if(companies.get(i).getText().equalsIgnoreCase(expresult))
			{
				System.out.println("Companies id  "+companies.get(i).getText()+"   resp current prize is.."+currentPrizes.get(i).getText());
				companies.get(i).click();
				break;
			}
			
		}
		
		
		
	}

}
