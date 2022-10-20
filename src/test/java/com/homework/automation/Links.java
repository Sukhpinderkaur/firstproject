package com.homework.automation;



		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;
		public class Links {
	
			public static WebDriver driver;

			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.bbc.com");
				String rediffPageTitle = driver.getTitle();
				System.out.println("The title of the landing page is: " + rediffPageTitle);

				List<WebElement> rediffLinks = driver.findElements(By.tagName("a"));
				// List<WebElement> rediffLinks = driver.findElements(By.xpath("//a"));

				// total number of links in rediff landing page
				System.out.println("Total links in this page are: " + rediffLinks.size()); // 254

				// out of 254 links how many are getting displayed
				// Let's print all the links

				for (int i = 1; i < rediffLinks.size(); i++) {
					WebElement TotalLinks = rediffLinks.get(i);
					System.out.println(TotalLinks.getText() + " --- " + TotalLinks.isDisplayed());
				}

				System.out.println("************************************************************************");

				// find a particular link - 11th link
				WebElement particularLink = rediffLinks.get(10);

				// how will I find the name of this particular link
				System.out.println("The text of this link is: " + particularLink.getText());

				// what does this particular link hold the url value
				System.out.println("The url this links holds is :" + particularLink.getAttribute("href"));

				// click on this particular link
				particularLink.click();
				String titleCRICKET = driver.getTitle();
				System.out.println("The title of the CRICKET Page is: " + titleCRICKET);

				if (rediffPageTitle.equals(titleCRICKET)) {
					if (rediffPageTitle.equals(titleCRICKET)) {
						System.out.println("Test Case FAIL");
					} else {
						System.out.println("TEST CASE PASS");
					}

					driver.quit();

				}

			}
				


	}


