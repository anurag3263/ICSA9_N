package extraconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_2")).click();
	WebElement birthtooltip=	driver.findElement(By.id("birthday-help"));
	String tooltiptext=birthtooltip.getAttribute("title");
	if(tooltiptext.equalsIgnoreCase("Click for more Information"))
	{
		System.out.println("System tooltip matching");
	}
	else
	{
		System.out.println("System tooltip NOT matching");
	}
	}
}
