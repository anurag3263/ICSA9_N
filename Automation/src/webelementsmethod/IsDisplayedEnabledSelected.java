package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedEnabledSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement enter=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(enter.isDisplayed());
		System.out.println(enter.isEnabled());
		 System.out.println(enter.isSelected());
		enter.click();                                        //if we don't perform click then isSelect give result as false
        System.out.println(enter.isSelected());
	}

}
