package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		System.out.println(driver.getWindowHandle());
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);

	}

}
