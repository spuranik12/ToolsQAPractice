package FindElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {
	
//	Launch new Browser
//	Open URL http://toolsqa.wpengine.com/automation-practice-form/
//	Type Name & Last Name (Use Name locator)
//	Click on Submit button (Use ID locator)
	
	public static void main(String[] args) {
		//Instantiate Web driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		
		//Type first name
		driver.findElement(By.name("firstname")).sendKeys("First");
		
		//Type last name
		driver.findElement(By.name("lastname")).sendKeys("Last");
		
		//click on submit
		driver.findElement(By.id("submit")).click();
	}
}
