package NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {
	
//	Launch new Browser
//	Open DemoQA.com website
//	Click on Registration link using “driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();“
//	Come back to Home page (Use ‘Back’ command)
//	Again go back to Registration page (This time use ‘Forward’ command)
//	Again come back to Home page (This time use ‘To’ command)
//	Refresh the Browser (Use ‘Refresh’ command)
//	Close the Browser
	
	public static void main(String[] args) {
		
		//launch browser
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Storing URL into variable & open URL in browser
		String URL = "http://www.DemoQA.com";
		driver.get(URL);
		
		//click on registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		
		//come back to home page using back command
		driver.navigate().back();
		
		//Again go to registration page using forward command
		driver.navigate().forward();
		
		//Again come back to Home Page using To command
		driver.navigate().to(URL);
		
		//Refresh browser using refresh command
		driver.navigate().refresh();
		
		//close browser
		driver.close();
		
	}
}
