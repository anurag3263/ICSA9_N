package multiplewebelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anurag/Downloads/MultipleElements.html");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
      for(int i=0;i<links.size();i++)
      {
    	  System.out.println(links.get(i).getText());
      }
	}

}
