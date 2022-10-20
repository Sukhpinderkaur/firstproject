package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
	public static	WebDriver driver;

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com");
	
	String title = driver.getTitle();//gettitle method will return the current title of rediff web page
	String currenturl = driver.getCurrentUrl();//this method will return current url page of current page
	if(driver.getTitle().equals(title)&&driver.getCurrentUrl().equals(currenturl))//comparision 
	{
		System.out.println("pass");
		driver.findElement(By.className("signin")).click();
	}
	else
	{
		System.out.println("fail");
	}
	String title1 = driver.getTitle();//this will return the title of signin page bcz in above sign in page opened
	String currenturl1 = driver.getCurrentUrl();//return current url of sign in page
	if(driver.getTitle().equals(title1)&&driver.getCurrentUrl().equals(currenturl1))
	{
		System.out.println("pass");
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	
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
        	 driver.findElement(By.className("rd_logout")).click(); 
         }
         else
         {
        	 System.out.println("fail");
         }
         WebElement signout = driver.findElement(By.xpath("//p[contains(text(),'You have successfully signed out of Rediffmail.')]"));
         if(signout.isDisplayed())//is displayed method is used for visiblity of text
         {
        	 System.out.println("pass");
         }
         else
         {
        	 System.out.println("fail");
         }
         driver.quit();
         }
	}


