package extraconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingChatbot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("corover-disha-icon")));
		
		driver.findElement(By.id("corover-disha-icon")).click();
		driver.switchTo().frame("corover-chat-frame");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter your query here']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter your query here']")).sendKeys("train to noida");

	}

}
