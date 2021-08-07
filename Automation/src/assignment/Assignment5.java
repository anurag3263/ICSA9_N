//2. open "https://demo actitime.com" and click on forgot your password link and actitime inc. link 
//(using linkText & partialLinkText - also print the text) 
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		WebElement link=driver.findElement(By.linkText("Forgot your password?"));
				System.out.println(link.getText());
				link.click();
				 driver.findElement(By.linkText("Return to login page")).click();
				 WebElement newlink=driver.findElement(By.linkText("actiTIME Inc."));
			     System.out.println(newlink.getText()); 
				 newlink.click(); 
				
				

	}

}
