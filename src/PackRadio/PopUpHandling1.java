package PackRadio;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Skills\\Selenium WebDriver By Shammi Sir\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		driver.findElement(By.id("tabButton")).click();
		Set<String> tabIds=driver.getWindowHandles();
		System.out.println(tabIds.size());
		
		Iterator<String> itr=tabIds.iterator();
		String tab1=itr.next();
		String tab2=itr.next();
		System.out.println("Newly opened tab."+driver.getCurrentUrl());
		System.out.println("Newly opened tab.."+driver.getTitle());
		driver.switchTo().window(tab2);
		System.out.println("Newly opened tab."+driver.getCurrentUrl());
		System.out.println("Newly opened tab.."+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tab1);
		
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> windowsIds=driver.getWindowHandles();
		System.out.println(windowsIds.size());
		
		Iterator<String> itr2=windowsIds.iterator();
		String win1=itr2.next();
		String win2=itr2.next();
		
		driver.switchTo().window(win2);
		System.out.println("Window title is "+driver.getTitle());
		System.out.println("Window url is "+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		driver.findElement(By.id("messageWindowButton")).click();
		
		
	}

}
