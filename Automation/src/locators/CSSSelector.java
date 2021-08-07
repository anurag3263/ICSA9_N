package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("input[aria-label='Email address or phone number']")).sendKeys("Qspider");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("anu123");
		
	}

}
