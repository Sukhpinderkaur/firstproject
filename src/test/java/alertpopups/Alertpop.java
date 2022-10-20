package alertpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		
		driver.findElement(By.className("signinbtn")).click();
		
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());//this is used for reterive the message of popups
		alert.accept();//this is used for accept popups like click on ok button
		//alert.dismiss();//this is used for close popups
		
		
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	

	}

}
