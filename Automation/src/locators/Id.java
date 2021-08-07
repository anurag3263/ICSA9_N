package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		 username.sendKeys("Anurag");
		//driver.findElement(By.id("email")).sendKeys("Chaturvedi");//we can use either method to select and insert value
        driver.close();
	}

}
