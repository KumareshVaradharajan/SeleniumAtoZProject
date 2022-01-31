package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	
	//@Test
	public void headlessBrowserChrome()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\Driver\\Chrome driver folder\\Driver v96\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
	//	ch.setHeadless(true);
		ch.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(ch);
		
		driver.get("https://www.selenium.dev/documentation/grid/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	
}
