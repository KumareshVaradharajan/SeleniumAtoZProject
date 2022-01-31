package testPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CountLinksOnTheFooterSection {
	
	
	@Test
	public void footerSectionLinkCount()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\Driver\\Chrome driver folder\\Driver v96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	
	 //Count Links On The Footer Section
	  
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		int size = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(size);
		
}

}
