package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement  forgotton=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act= new Actions(driver);
		//act.sendKeys(Keys.CONTROL).click(forgotton).perform();
        act.sendKeys(Keys.LEFT_CONTROL).click(forgotton).perform();
	}

}
