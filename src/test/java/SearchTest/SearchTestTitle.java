package SearchTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class SearchTestTitle {
	
		
		ChromiunDriver driver;
		
		@BeforeTest
		public void openbrowser() {
			System.out.println("Initialising chrome browser....");
			driver=new ChromeDriver();
		}
		
		@Test
		public void validatebrowser() {
			driver.get("https://google.com");
			System.out.println("Title is "+driver.getTitle());
			
			//validate
			Assert.assertEquals(driver.getTitle(), "Google");
		}
		
		@AfterTest
		public void closebrowser() {
			System.out.println("Closing chrome browser......");
			driver.close();
		}
	}

