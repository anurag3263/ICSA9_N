package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anurag/Downloads/AbsoluteXpath.html");
        driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Anurag");
        driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Chaturvedi");
	}

}
