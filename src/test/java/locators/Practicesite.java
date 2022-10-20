package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicesite {
public static ChromeDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("sukhpinder@gmail.com");
		driver.findElement(By.id("uniform-id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("sukhpinder");
		driver.findElement(By.className("is_required validate form-control")).sendKeys("kaur");
		driver.findElement(By.id("passwd")).sendKeys("sukh");
		
		
		
	

	}

}
