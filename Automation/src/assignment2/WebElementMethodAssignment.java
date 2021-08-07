//enter qspiders in username field and delete e and p seperately
package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement enter=driver.findElement(By.id("email"));
		enter.sendKeys("qspiders");
		/*
		 * for(int i=0;i<2;i++) { enter.sendKeys(Keys.ARROW_LEFT); }
		 * 
		 * enter.sendKeys(Keys.BACK_SPACE);
		 * 
		 * for(int i=0;i<2;i++) { enter.sendKeys(Keys.ARROW_LEFT); }
		 * 
		 * enter.sendKeys(Keys.BACK_SPACE);
		 */
		for(int i=0;i<5;i++)
		{
			enter.sendKeys(Keys.ARROW_LEFT);
		}
			
		enter.sendKeys(Keys.BACK_SPACE);
	}

}
