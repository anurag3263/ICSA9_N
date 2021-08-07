package miscellaneous;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddingExtension {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\Anurag\\Downloads\\selectorshub.crx"));
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

}
