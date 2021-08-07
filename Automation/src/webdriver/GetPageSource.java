package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\google.co.in");
		System.out.println(driver.getPageSource());
		driver.close();
		System.out.println("page source completed");

	}

}
