package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement datedropdown=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select sel=new Select(datedropdown);
		sel.selectByValue("5");
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select sel1=new Select(monthdropdown);
		sel1.selectByValue("10");
		WebElement yeardropdown=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select sel2=new Select(yeardropdown);
		sel2.selectByValue("1996");
	}

}
