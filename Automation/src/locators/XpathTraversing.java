package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anurag/Downloads/XpathTraversing.html");
		
		//HTML to c
		
		driver.findElement(By.xpath("/html//div[2]/input[1]")).click();
		
		//Body to E
		
		driver.findElement(By.xpath("//body//div[3]/input[1]")).click();
		
		//F to HTML
		
		WebElement ele=driver.findElement(By.xpath("//div[3]/input[2]/../../.."));
		System.out.println(ele.getTagName());
		
		// C to Body
		
		System.out.println(driver.findElement(By.xpath("//div[2]/input[1]/../..")).getTagName());
		
		//E To Body to B
		
		driver.findElement(By.xpath("//div[3]/input[1]/../..//div[1]/input[2]")).click();


	}

}
