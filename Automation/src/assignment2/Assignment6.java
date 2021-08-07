//Assignment (css selector) : 
//6. open "https://www.facebook.com" , click on create new account button , enter the firstname , surmname , 
//mobile number and new password 

package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("anurag");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("chaubey");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("anurag@123");
		driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys("1233444443@@@");

	}

}
