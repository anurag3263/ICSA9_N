/*open "https://opensource-demo.orangehrmlive.comr , "
"enter the username as "Admin" and password as "admin123" and "
"click on login button using id locator and compare the title and current url of loginpage and homepage */
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		/*driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.name("Submit")).click();*/
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String actualTitle=driver.getTitle();
		System.out.println(driver.getTitle());
				if(actualTitle.equals("OrangeHR")) {
					System.out.println("titles are matching");
				}else
				{
					System.out.println("not matching");
				}
				String actualUrl=driver.getCurrentUrl();
				System.out.println(driver.getCurrentUrl());
				if(actualUrl.equals("https://opensource-demo.orangehrmlive.com")) {
					System.out.println("matching");
				}else {
					System.out.println("not matching");
				}
				}
		

	}


