package com.webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Webdriver {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.quit();
		

		WebDriverManager.firefoxdriver().setup();
	 driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https:\\www.rediff.com");
	driver.quit();
	}

}
// these browsers are opening with the help of dependencies which are added in pom.xml file  so there is no need of any setproperty method