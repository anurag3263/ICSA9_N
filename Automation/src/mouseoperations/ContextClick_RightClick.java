package mouseoperations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ContextClick_RightClick {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement  forgotton=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act= new Actions(driver);
		act.contextClick(forgotton).perform();
		
		Robot ro= new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_ENTER);
		//ro.keyRelease(KeyEvent.VK_DOWN);
		//ro.keyRelease(KeyEvent.VK_ENTER);


	}

}
