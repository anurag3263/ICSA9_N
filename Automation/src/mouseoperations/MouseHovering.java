package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement  offer=driver.findElement(By.xpath("//a[.='Offers']"));
		Actions act= new Actions(driver);
		act.moveToElement(offer).perform();
		WebElement watch=driver.findElement(By.xpath("//a[.='Watches at Min 60%']"));
		act.moveToElement(watch).click(watch).perform();

	}

}
