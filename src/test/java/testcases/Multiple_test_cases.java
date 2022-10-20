package testcases;

import org.testng.annotations.Test;

import dataprovider_multiplecases.Datarespositry;


public class Multiple_test_cases {
	
	@Test(dataProvider = "getdata()", dataProviderClass = Datarespositry.class)

	public void launchurl(String Browser , String username , String password , String employeeid)
	{
		
	}
	
	@Test(dataProvider = "getdata()", dataProviderClass = Datarespositry.class)
	public void clickonsignin(String Browser , String username , String password , String employeeid)
	{
		
	}
	
	@Test(dataProvider = "getdata()", dataProviderClass = Datarespositry.class)
	public void credential(String Browser , String username , String password , String employeeid)
	{
		
	}
	
	@Test(dataProvider = "getdata()", dataProviderClass = Datarespositry.class)
	public void logout(String Browser , String username , String password , String employeeid)
	{
		
	}
	@Test(dataProvider = "getdata()", dataProviderClass = Datarespositry.class)
	public void gobacktolandingpage(String Browser , String username , String password , String employeeid)
	{
		
	}
}
