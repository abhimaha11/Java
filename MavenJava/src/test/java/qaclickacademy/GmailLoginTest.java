package qaclickacademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GmailLoginTest {
	
	@Test
	public void GmailLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/tm_sathyav/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.xpath("//[@class='gmail-nav__nav-links-wrap']/a/a")).click();
		driver.findElement(By.xpath("//*[@class='Xb9hP']/input")).sendKeys("a.mahajan11");
		
		
			
	}

}
