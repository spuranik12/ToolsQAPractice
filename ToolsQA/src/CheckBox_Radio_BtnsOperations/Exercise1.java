package CheckBox_Radio_BtnsOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {
	
//	Launch new Browser
//	Open “http://toolsqa.wpengine.com/automation-practice-form/“
//	Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
//	Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
//	Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
//	Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
	
	public static void main(String[] args) {
		
		//Step 1: Instantiate driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Step 2: Launch URL
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		
		//Step 3: Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		//Using list of find elements as name are same.
		List<WebElement> rdio_btns = driver.findElements(By.name("sex"));
		//check whether 1st radio btn is selected or not
		boolean bValue = false;
		bValue = rdio_btns.get(0).isSelected(); 
		
		//If 1st is not selected then select second.
		if(bValue){
			rdio_btns.get(1).click();
		}
		else{
			rdio_btns.get(0).click();
		}
		
		//Step 4: Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
		driver.findElement(By.id("exp-2")).click();
		
		//Step 5: Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
		//Find no of check boxes
		List<WebElement> chkboxes = driver.findElements(By.name("profession"));
		
		//This will tell no of check boxes present
		int numOfCheckboxes = chkboxes.size();
		
		//Start for loop to check from 1st to last checkboxes
		for(int i = 0; i < numOfCheckboxes ; i++){
			//store checkbox variable into string using value attribute
			String checkboxValue = chkboxes.get(i).getAttribute("value");
			//select the checkbox if its value is same as it is specified
			if(checkboxValue.equalsIgnoreCase("Automation Tester")){
				chkboxes.get(i).click();
				//This will take out of loop
				break;
			}
		}
		
		//Step 6: Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
		driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
		
		//Step 7: close browser
		driver.quit(); 
	}
}
