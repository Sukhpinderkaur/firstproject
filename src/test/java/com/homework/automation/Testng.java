package com.homework.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {
	public static	WebDriver driver;
	@Test (priority = 1)
	public void test1()
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		
	}
	@Test (priority = 2)
	public void test2()
	{
		String title = driver.getTitle();
		String currenturl = driver.getCurrentUrl();
		if(driver.getTitle().equals(title)&&driver.getCurrentUrl().equals(currenturl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		WebElement signin = driver.findElement(By.className("signin"));
		if(signin.isDisplayed()&&signin.isEnabled())
		{
			System.out.println("pass");
			signin.click();	
		
		}
		else
		{
			System.out.println("fail");
		}
		String title1 = driver.getTitle();
		String currenturl1 = driver.getCurrentUrl();
		if(driver.getTitle().equals(title1)&&driver.getCurrentUrl().equals(currenturl1))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		WebElement textbox1 = driver.findElement(By.id("login1"));
		WebElement textbox2 = driver.findElement(By.id("password"));
		if(textbox1.isDisplayed()&&textbox1.isEnabled())
		{
			if(textbox2.isDisplayed()&&textbox2.isEnabled())
			{
			System.out.println("displayed and enabled");
			textbox1.sendKeys("seleniumpanda@rediffmail.com");
			textbox2.sendKeys("Selenium@123");
			}
			else
			{
				System.out.println("fail");
			}
		}
		else
		{
			System.out.println("fail");
		}
		WebElement signin2 = driver.findElement(By.className("signinbtn"));
		if (signin2.isDisplayed()&&signin2.isEnabled())
		{
			System.out.println("pass");
			signin2.click();
		}
		else
		{
			System.out.println("fail");
		}
		String title2 = driver.getTitle();
		String currenturl2 = driver.getCurrentUrl();
		if(driver.getTitle().equals(title2)&&driver.getCurrentUrl().equals(currenturl2))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
	}
	}
		@Test (priority = 3)
		public void test3()
		{
			 WebElement logout = driver.findElement(By.className("rd_logout"));
			 if(logout.isDisplayed()&&logout.isEnabled())
			 {
				 System.out.println("logout pass");
				 logout.click();
			 }
			 else
			 {
				 System.out.println("logout fail");
			 }
			 WebElement logouttext = driver.findElement(By.xpath("//p[contains(text(),'You have successfully signed out of Rediffmail.')]"));
			 if(logouttext.isDisplayed()&&logouttext.isEnabled())
			 {
				 System.out.println("displayed logout buttton");
			 }
			 else
			 {
				 System.out.println("logout button fail");
			 }
			 WebElement home = driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]"));
			 if(home.isDisplayed()&&home.isEnabled())
			 {
				 System.out.println("home pass");
				 home.click();
			 }
			 else
			 {
				 System.out.println("fail");
			 }
		}
		
	}
	
	


