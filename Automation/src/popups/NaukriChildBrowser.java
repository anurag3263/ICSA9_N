package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		//System.out.println(driver.getWindowHandle());
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
        ArrayList<String> al= new ArrayList<>(allwindows);
        System.out.println(al.size());
        driver.switchTo().window(al.get(2));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(al.get(1));
        System.out.println(driver.getTitle());
        driver.close();
	}

}
