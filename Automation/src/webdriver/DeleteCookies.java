package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		driver.manage().deleteAllCookies();
		System.out.println("all cookies deleted successffully");

	}

}
