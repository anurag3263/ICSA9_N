package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[1]")).sendKeys("anurag");
		driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]")).sendKeys("123456");

	}

}
