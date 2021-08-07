package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterReturn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement enter=driver.findElement(By.xpath("//input[@id='email']"));
		enter.sendKeys("anurag");
		driver.findElement(By.id("pass")).sendKeys("1223455");
	//	enter.sendKeys(Keys.ENTER);
	    enter.sendKeys(Keys.RETURN);

	}

}
