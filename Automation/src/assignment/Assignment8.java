//5. open "https://www.myntra.com" and click on offers link 
//(using linkText & partialLinkText - also print the text) 
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.partialLinkText("Offers")).click();

	}

}
