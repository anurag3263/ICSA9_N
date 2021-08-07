package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\amazon.in");
		/*String title=driver.getTitle(); 
		   System.out.println(title);*/
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
