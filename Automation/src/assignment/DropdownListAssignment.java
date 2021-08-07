package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?");
		WebElement citydropdown=driver.findElement(By.xpath("//select[@type='select']"));
		Select sel=new Select(citydropdown);
		//sel.selectByVisibleText("");
		sel.selectByValue("IQ");
	
		
		//WebElement selectedoptions=sel.getFirstSelectedOption();
		//System.out.println(selectedoptions.getText());

	}

}
