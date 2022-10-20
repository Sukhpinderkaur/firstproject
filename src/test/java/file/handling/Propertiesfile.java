package file.handling;

import java.io.FileInputStream;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Propertiesfile {
public static ChromeDriver driver;
	public static void main(String[] args) throws Exception {
		// in first step create the object of property file
		Properties pros = new Properties();
		System.out.println(System.getProperty("user.dir"));//user.dir used for short the path
		String path = "C:\\Users\\gurha\\eclipse-workspace\\MY_FIRST_MAVEN_PROJECT\\src\\test\\java\\file\\handling\\rediff.properties";
        // create the object of file input stream and it will read the content of file
		FileInputStream fis = new FileInputStream(path);
		//then load the all content of pro
        pros.load(fis);
        System.out.println(pros.getProperty("url"));
       WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pros.getProperty("url"));
		driver.findElement(By.xpath(pros.getProperty("signinxpath"))).click();
		driver.findElement(By.id(pros.getProperty("login1"))).sendKeys(pros.getProperty("username"));
		driver.findElement(By.xpath(pros.getProperty("passwordxpath"))).sendKeys(pros.getProperty("password"));
		
        
        
	}

}
