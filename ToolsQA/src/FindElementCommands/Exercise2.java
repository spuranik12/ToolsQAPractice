package FindElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise2 {
	
//	Launch new Browser
//	Open URL http://toolsqa.wpengine.com/automation-practice-form/
//	Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
//	Identify Submit button with ‘tagName’, convert it in to string and print it on the console
//	Click on the Link “Link Test” (Use ‘linkTest’ locator)
	
	public static void main(String[] args) {
		
		//Instantiate Web driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		
		//click on partial link test
		driver.findElement(By.partialLinkText("Partial")).click();
		
		//identify submit button & convert into string
		String btnText = driver.findElement(By.tagName("button")).toString();
		System.out.println(btnText);
		
		//click on link test
		driver.findElement(By.linkText("Link Test")).click();
	}
	
}
