package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenMozilla {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.close();
	}

}
