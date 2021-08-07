package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");// we don't have html file
		driver.findElement(By.id("t1")).sendKeys("qspider");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("jspider");
		driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
	//	driver.navigate().refresh();
	//	driver.switchTo().frame(1);
	//	driver.switchTo().frame("f2");
		driver.switchTo().frame("n3");
		driver.findElement(By.id("t2")).sendKeys("pyspider");

	}

}
