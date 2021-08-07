//Assignment (css selector)
//open "https://www.instagram.com" , enter the username , password and click on login button
package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ianuragchaturvedi");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("anurag120796@");
       driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
