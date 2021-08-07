package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OpenOpera {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "F:\\Driver\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		driver.close();
	}

}
