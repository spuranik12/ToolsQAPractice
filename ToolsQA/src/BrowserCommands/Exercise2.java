package BrowserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		//Launch new chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Storing URL into string variable
		String URL = "http://demoqa.com/frames-and-windows/";
		
		//open url
		driver.get(URL);
		
		//open new window button on browser
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		
		//close browser
		//driver.close(); //closes only current window handled by driver.
		driver.quit(); //closes are windows in browser which are openend by driver.
		
	}
}
