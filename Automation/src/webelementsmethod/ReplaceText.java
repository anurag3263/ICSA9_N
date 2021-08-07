package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReplaceText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement enter=driver.findElement(By.xpath("//input[@id='email']"));
		enter.sendKeys("anurag");
		Thread.sleep(3000);// to see script is performing or not
		enter.clear();
		enter.sendKeys("chaturvedi");

	}

}
