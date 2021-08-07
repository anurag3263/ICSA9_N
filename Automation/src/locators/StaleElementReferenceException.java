package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		System.out.println(link.getText());// before clicking it's okk
		link.click();
		//System.out.println(link.getText());// can't perform because page got refreshed after click operation
		
		WebElement newlink=driver.findElement(By.linkText("Forgotten account?"));
		System.out.println(newlink.getText());
	}

}
