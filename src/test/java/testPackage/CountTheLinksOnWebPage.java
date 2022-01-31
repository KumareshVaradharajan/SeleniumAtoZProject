package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountTheLinksOnWebPage {
	
	@Test
	public void linkCount()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\Driver\\Chrome driver folder\\Driver v96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println(size);
		
		List<WebElement> l = driver.findElements(By.tagName("a"));
		
		for(WebElement wb : l)
		{
			System.out.println(wb.getText());
		}
		
		
	}

}
