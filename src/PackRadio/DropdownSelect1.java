package PackRadio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//	System.out.println(month.getFirstSelectedOption().getText());
			
		//	driver.findElement(By.xpath("//input[@value='2']")).click();
		//1 st way
		List<WebElement> dropdownList=driver.findElements(By.xpath("//select[@id='month']/option"));
		Thread.sleep(2000);
		dropdownList.get(6).click();
	//	Thread.sleep(1000);
		dropdownList.get(7).click();
	//	Thread.sleep(1000);
		dropdownList.get(8).click();
		Thread.sleep(1000);
		dropdownList.get(0).click();
	//	Thread.sleep(1000);
		dropdownList.get(1).click();
	//	Thread.sleep(1000);
		dropdownList.get(2).click();
		
		//2nd Way
		WebElement bm=driver.findElement(By.id("month"));
		
		Select month=new Select(bm);
		System.out.println(month.getFirstSelectedOption().getText());
	//	Thread.sleep(1000);
		month.selectByIndex(3);
	//	Thread.sleep(1000);
		month.selectByValue("5");
	//	Thread.sleep(1000);
		month.selectByVisibleText("Jun");
		//Thread.sleep(1000);
		System.out.println(month.getFirstSelectedOption().getText());
		
		//3rd Way
		String expResult="Feb";
		List<WebElement> dropdown=month.getOptions();
		System.out.println("dropdown Size.."+dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			if(dropdown.get(i).getText().equalsIgnoreCase(expResult))
			{
				dropdown.get(i).click();
				System.out.println(dropdown.get(i).getText()+" dropdown value is clicked..");
				break;
				
			}
			
		}
		
		bm.sendKeys("Apr");
		
		Thread.sleep(7000);
		driver.close();
	}

}
