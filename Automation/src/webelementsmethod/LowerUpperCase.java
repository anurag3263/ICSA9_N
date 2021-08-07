package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowerUpperCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement enter=driver.findElement(By.id("email"));
		/*String data="qspider" ;
		String username=data.toUpperCase();*/
		enter.sendKeys(Keys.SHIFT,"qspider");
		/*
		 * String data="QSPIDER"; 
		 * String username=data.toLowerCase();
		 * enter.sendKeys(username);
		 */

	}

}
