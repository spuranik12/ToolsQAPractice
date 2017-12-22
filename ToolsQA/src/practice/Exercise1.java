package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
	
//	Launch a new Firefox browser.
//	Open Store.DemoQA.com
//	Get Page Title name and Title length
//	Print Page Title and Title length on the Eclipse Console.
//	Get Page URL and verify if the it is a correct page opened
//	Get Page Source (HTML Source code) and Page Source length
//	Print Page Length on Eclipse Console.
//	Close the Browser.
	
	public static void main(String[] args) {
		
		//create a instance of firefox webdriver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//store url in variable
		String URL = "http://store.demoqa.com/";
		
		//Launch ToolsQA website
		driver.get(URL);
		
		//fetch page title name, length & store in respective variables
		String title = driver.getTitle(); //Title name
		int titleLength =  driver.getTitle().length(); //Title length
		
		//print title & its length
		System.out.println("Title of page is " + title);
		System.out.println("Length of title is " + titleLength);
		
		//store page url into variable;
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.equals(URL)){
			System.out.println("Verification successfull - The correct url is opened");
		}else{
			System.out.println("Verification unsuccessfull - An incorrect url is opened");
			//print actual & expected url in case of fail
			System.out.println("Actual URL : " + actualURL);
			System.out.println("Expected URL : " + URL);
		}
		
		//Store page source, page source length
		String pageSource = driver.getPageSource();
		int pageSourceLength = driver.getPageSource().length();
		
		//print page source length
		System.out.println("Total length of page source is : " + pageSourceLength);
		
		//close browser
		driver.close();
	}
}
