package qaclickacademy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoogleSearchDropDownList {
	

	@Test
	public void GoogleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/kudyar/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("face");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		List<WebElement> ele = driver.findElements(By.xpath("//*[contains(@id,'sbse')]/div[2]/b"));
		System.out.println(ele.size());
		Actions act = new Actions(driver);
		System.out.println("Print List of options for Google Search - ");
		for (int i=0; i<ele.size();i++)
		{
			System.out.println("face"+ele.get(i).getText());
		}
		int index=8;
		for (int i=0; i<ele.size();i++)
		{
			act.moveToElement(driver.findElement(By.xpath("//*[contains(@id,'sbse')]/div[2]/b")));
			if(i==index-1)
			{
	            act.moveToElement(ele.get(index-1)).click();	
	            act.moveToElement(ele.get(index-1)).perform();
	        }
			
		}
		
	}
	
}
