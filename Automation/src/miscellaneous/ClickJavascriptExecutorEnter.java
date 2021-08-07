package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickJavascriptExecutorEnter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		WebElement username=driver.findElement(By.id("login-username"));
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='anurag@yahoo.com'", username);

	}

}
