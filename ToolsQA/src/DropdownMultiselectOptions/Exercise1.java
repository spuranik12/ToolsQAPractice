package DropdownMultiselectOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise1 {
	
//	Launch new Browser
//	Open “http://toolsqa.wpengine.com/automation-practice-form/”
//	Select ‘Continents’ Drop down ( Use Id to identify the element )
//	Select option ‘Europe’ (Use selectByIndex)
//	Select option ‘Africa’ now (Use selectByVisibleText)
//	Print all the options for the selected drop down and select one option of your choice
//	Close the browser
	
	public static void main(String[] args) {
		//Step 1-Instantiate browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Step 2- Launch URL
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		
		//Step 3- Select ‘Continents’ Drop down ( Use Id to identify the element )
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		
		//Step 4- Select option ‘Europe’ (Use selectByIndex)
		oSelect.selectByIndex(2);
		
		//Step 5- Select option ‘Africa’ now (Use selectByVisibleText)
		oSelect.selectByVisibleText("Africa");
		
		//Step 6- Print all the options for the selected drop down and select one option of your choice
		//First get the size of all options
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		
		//Use for loop to print all options
		for(int i =0; i<iListSize; i++){
			//store value into variable
			String sValue = oSelect.getOptions().get(i).getText();
			//print stored value
			System.out.println(sValue);
			//select required option using if condition
			if(sValue.equals("North America")){
				oSelect.selectByIndex(i);
				break;
			}
		}
		
		//Step 7- Kill browser
//		driver.quit();
	}
}
