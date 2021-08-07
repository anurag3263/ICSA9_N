package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetBrowserSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\google.co.in");
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(500 , 300);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

	}

}
