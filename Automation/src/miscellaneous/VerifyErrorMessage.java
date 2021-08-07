package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		WebElement next=driver.findElement(By.xpath("//span[.='Next']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",next);
		
		//WebElement errormessage=driver.findElement(By.xpath("(//div[.='Enter an email or phone number'])[2]"));
		WebElement errormessage=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		String actualerrormessage=errormessage.getText();
		if(actualerrormessage.equalsIgnoreCase("Enter an email or phone number"))
		{
			System.out.println("both are matching");
		}
		else
		{
			System.out.println("both are matching");
		}
	}

}
