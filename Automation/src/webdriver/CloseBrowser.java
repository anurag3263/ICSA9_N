package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    //driver.close();
	driver.quit();
	}

}
