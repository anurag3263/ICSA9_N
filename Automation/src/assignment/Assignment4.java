 //open "https://www.facebook.com" and click on create a page link  (using linkText & partialLinkText - also print the text) 

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		//driver.findElement(By.className("_8esh")).click();
		//WebElement link=driver.findElement(By.linkText("Create a Page"));
		WebElement link=driver.findElement(By.partialLinkText("Create a "));
		System.out.println(link.getText());
		link.click();

	}

}
