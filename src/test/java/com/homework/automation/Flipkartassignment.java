package com.homework.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartassignment {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> sarees = driver.findElements(By.cssSelector("div._2WkVRV"));
		System.out.println("total number of sarees:=" + sarees.size());
	
		List<WebElement> price = driver.findElements(By.cssSelector("div._30jeq3"));
		for(int i =0;i<sarees.size();i++)
		{
			
		
		System.out.println(sarees.get(i).getText() +"............"+sarees.get(i).getText());
		}
		

	}

}
