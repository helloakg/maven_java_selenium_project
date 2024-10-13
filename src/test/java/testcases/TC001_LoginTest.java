package testcases;

import org.testng.Assert;

import baseclass.BaseClass;


public class TC001_LoginTest extends BaseClass{
	
	public void TC001_LoginTest() {
		
		System.out.println("--start executing TC001--");
		System.out.println("--Entered username--");
		System.out.println("--Entered password--");
		System.out.println("--Clicked on login button--");
		System.out.println("--validating login attempt--");
		Assert.assertTrue(true);
		System.out.println("--finished executing TC001--");
		
	}

}
