//open myntra and search  for tommy hilfiger and click on perfumes
package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementsAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement searchbar=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchbar.sendKeys("Tommy Hilfiger");
		Thread.sleep(5000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']"));
		//Thread.sleep(4000);
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("tommy hilfiger perfume"))
			{
				suggestions.get(i).click();
				break;
			}
		}
	}

}
