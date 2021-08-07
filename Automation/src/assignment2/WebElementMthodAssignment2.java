//lowercase to upercase and viceversa
package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMthodAssignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		  WebElement enter=driver.findElement(By.id("email"));
		  enter.sendKeys("qspiders");
		  //enter.sendKeys(Keys.SPACE);
		  
		 // enter.sendKeys(Keys.UP);//assignment 2
		 // enter.sendKeys(Keys.HOME);//assignment 2
		  
		//  enter.sendKeys("pyspider");//assignment  3
		 
		//enter.sendKeys(Keys.UP);   //for taking control to beginning of the word
		enter.sendKeys(Keys.TAB);   //for changing text field
		
		driver.findElement(By.id("pass")).sendKeys("jspiders");  //assignment 6
		
		
	}

}
