//open "https://Qspiders.com , click on contact link , print the mobile number of Noida branch , USA branch 

package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversingAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Contact']/..")).click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//p[.='Noida']/../..//span[contains(text(),'+91')]"));
		System.out.println(ele.getText());

	}

}
