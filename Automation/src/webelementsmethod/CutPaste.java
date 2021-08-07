package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CutPaste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement enter=driver.findElement(By.xpath("//input[@id='email']"));
		enter.sendKeys("anurag");
		enter.sendKeys(Keys.CONTROL,"a");
		enter.sendKeys(Keys.CONTROL,"x");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(Keys.CONTROL,"v");

	}

}
