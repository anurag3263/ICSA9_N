package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement enter=driver.findElement(By.id("pass"));
		enter.sendKeys("anurag");
		System.out.println(enter.getAttribute("value").length());
		/*
		 * String textvalue=enter.getAttribute("value");
		 * System.out.println(textvalue.length());
		 */
	}

}
