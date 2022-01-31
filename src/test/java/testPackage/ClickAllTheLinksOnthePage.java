package testPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickAllTheLinksOnthePage {
	
	@Test
	public void clickLinksAndOpenInNewTab()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\Driver\\Chrome driver folder\\Driver v96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement section = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		int sectionLinkSize = section.findElements(By.tagName("a")).size();
		System.out.println(sectionLinkSize);
		
		for(int i=1; i<sectionLinkSize; i++)
		{
			WebElement section1 = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
			section1.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
		
		Set<String>	windows = driver.getWindowHandles();
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext())
		{
		driver.switchTo().window(itr.next());
		System.out.println( driver.getTitle());
		}
	}

}
