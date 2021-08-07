package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.yahoo.com/");
	WebElement search=driver.findElement(By.xpath("//input[@id='header-search-input']"));
	search.sendKeys("selenium");
	Thread.sleep(3000);
	List<WebElement> autosuggestion=driver.findElements(By.xpath("//b[contains(text(),'selenium')]/.."));
	System.out.println(autosuggestion.size());
	for(int i=0;i<autosuggestion.size();i++)
	{
		if(autosuggestion.get(i).getText().equalsIgnoreCase("selenium hq"))
		{
			autosuggestion.get(i).click();
			break;
		}
	}
	
	}

}
