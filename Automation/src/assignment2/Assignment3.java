//Assignment (css selector)
//3. open "apptivo online crm" , enter the firstname , lastname , email address , password
package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apptivo.com/app/signup.jsp?planCode=PLAN_25&itm_campaign=direct&itm_medium=button&itm_source=home&itm_content=top-header&itm_term=ultimate-signup");
		//driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.cssSelector("input[title='First Name']")).sendKeys("anurag");
		driver.findElement(By.cssSelector("input[title='Last Name']")).sendKeys("chaturvedi");
		driver.findElement(By.cssSelector("input[title='Email']")).sendKeys("anuragchaturvedi@gmail.com");
		driver.findElement(By.cssSelector("input[title='Password']")).sendKeys("Anu120796@");

	}

}
