package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackspaceDelete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement enter=driver.findElement(By.xpath("//input[@id='email']"));
		enter.sendKeys("anurag");
		enter.sendKeys(Keys.CONTROL,"a");//to select all
      // enter.sendKeys(Keys.BACK_SPACE);//it will delete only one text
       enter.sendKeys(Keys.DELETE);//it will not delete any text until we select all
	}

}
