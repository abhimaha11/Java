package qaclickacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GmailLoginTest extends ExcelDrivenTest{
	
	@Test
	public void GmailLogin()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver.manage().window().maximize();
		for (int i=1; i<=3; i++)
		{
			for (int j=1; j<=2; j++)
			{
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//*[@type='email']")).sendKeys("a.mahajan11");
				driver.findElement(By.xpath("//*[@type='password']")).sendKeys("#");
				driver.findElement(By.xpath("//*[@value='Log In']")).click();
			}
		}
		
	}
}
