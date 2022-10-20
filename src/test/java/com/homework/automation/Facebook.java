package com.homework.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static ChromeDriver driver;
	public static Select select;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sukhpinder");
		driver.findElement(By.name("lastname")).sendKeys("brar");
		driver.findElement(By.name("reg_email__")).sendKeys("sukhpindersandhu720@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sukh");
		
		select = new Select(driver.findElement(By.id("month")));// code for drop down
		select.selectByVisibleText("Oct");
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("2022");
		driver.findElement(By.xpath("//div[@id=\"custom_gender_container\"]/preceding::label")).click();// code for radio button
				
		
		

	}

}
