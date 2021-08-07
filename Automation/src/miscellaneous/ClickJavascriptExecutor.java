package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickJavascriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		WebElement checkbox=driver.findElement(By.id("persistent"));
		 
		JavascriptExecutor js=(JavascriptExecutor)driver; //downcasting
		 js.executeScript("arguments[0].click()", checkbox);

	}

}
