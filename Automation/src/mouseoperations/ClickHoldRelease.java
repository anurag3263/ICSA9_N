package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldRelease {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement  forgotton=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act= new Actions(driver);
		act.clickAndHold(forgotton).perform();
		Thread.sleep(3000);
		act.release(forgotton).perform();

	}

}
