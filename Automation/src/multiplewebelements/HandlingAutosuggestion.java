package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;//when you have to use keys operation as enter ,down ,left ,right
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement searchbar= driver.findElement(By.xpath("//input[@type='text']"));
		searchbar.sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(suggestion.size());
		
		//suggestion.get(5).click();// we don't use this method because index value will not be same everytime
		
		/*
		 * for(int i=0;i<6;i++) // loop is controlling search and enter process
		 *  {
		 * searchbar.sendKeys(Keys.ARROW_DOWN); 
		 * } 
		 * searchbar.sendKeys(Keys.ENTER);
		 */
		for(int i=0;i<suggestion.size();i++)
			
		{
			
			if(suggestion.get(i).getText().equalsIgnoreCase("selenium rich foods"))
			{
				System.out.println(suggestion.get(i).getText());
				suggestion.get(i).click();
				break;
			}
		}
	}

}
