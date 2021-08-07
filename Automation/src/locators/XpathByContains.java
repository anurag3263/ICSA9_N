package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://login.yahoo.com/account/create?");
		// Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[contains(@placeholder,'number')]")).sendKeys("123456779");
		 
		/*
		 * driver.get("https://login.yahoo.com/");
		 * driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		 */
	}

}
