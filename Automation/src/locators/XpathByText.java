package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();

	}

}
