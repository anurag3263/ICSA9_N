package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("anuragchaturvedi");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("7309766225");

	}

}
