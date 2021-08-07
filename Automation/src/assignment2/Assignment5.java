//Assignment (css selector) : 
// 5. open "https://www.instagram.com" , click on signup link (linktext locator) , enter the mobile number , 
//fullname , Username and password 
package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='emailOrPhone']")).sendKeys("anurag123@");
		driver.findElement(By.cssSelector("input[name='fullName']")).sendKeys("anurag");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("anurag34567@!");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("fdtgcgfdhf");
	}

}
