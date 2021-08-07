package miscellaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleInsecureWebsites {
	
	public static void main(String[] args) {
		
	
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);//SSL Certificate (secure socket layer)
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("url of insecure websites");
		
    }
}
