package extraconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver(op);
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
	}

}
