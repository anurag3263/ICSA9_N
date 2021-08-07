/*open "https://demo.actitime com" , enter the username as "admin" , enter the password as "manager" , 
click on keep me logged in checkbox and click on login button using id or name locator */
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
	    driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);// Because  web page load slower than selenium 
		System.out.println(driver.getTitle());
		
		

	}

}
