package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();

	}

}
