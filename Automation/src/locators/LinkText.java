package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));//because get text is method of web element  thats why 
		System.out.println(link.getText());//	we have to  use the web element reference variable
		link.click();

	}

}
