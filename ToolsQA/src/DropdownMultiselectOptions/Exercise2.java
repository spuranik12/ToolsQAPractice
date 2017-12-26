package DropdownMultiselectOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {

	//	Launch new Browser
	//	Open “http://toolsqa.wpengine.com/automation-practice-form/”
	//	Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
	//	Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
	//	Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
	//	Print and select all the options for the selected Multiple selection list.
	//	Deselect all options
	//	Close the browser

	public static void main(String[] args) throws InterruptedException {

		//Step 1-Instantiate browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Step 2- Launch URL
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		
		//Step 3- Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		
		//Step 4- Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
		oSelect.selectByIndex(1);
		Thread.sleep(2000);
		oSelect.deselectByIndex(1);
		
		//Step 5- Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		oSelect.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		oSelect.deselectByVisibleText("Navigation Commands");
		
		//Step 6- Print and select all the options for the selected Multiple selection list.
		//First get list of elements and its size
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		
		//Use for loop to print all options
		for(int i =0; i < iListSize; i++){
			//store value into variable
			String sValue = oSelect.getOptions().get(i).getText();
			//Print all values
			System.out.println(sValue);
			//Now select all options
			oSelect.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		//Step 7- Deselect all
		oSelect.deselectAll();
	}
}
