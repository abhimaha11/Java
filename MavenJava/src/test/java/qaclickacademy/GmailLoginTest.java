package qaclickacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GmailLoginTest {
	
	@Test
	public void GmailLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/kudyar/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("a.mahajan11");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("#bhishek08");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
	}
	
		
			
	

}
