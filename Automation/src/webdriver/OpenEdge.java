package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.close();
	}

}
