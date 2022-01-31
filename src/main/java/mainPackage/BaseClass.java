package mainPackage;

import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest
	public void m1()
	{
		System.out.println("base class method");
	}

}
