//Assignment cssSelector
//open "https://login.yahoo.com/account/create?" , enter the firstname , lastname , email address , 
//mobile number , birth day , birth year & gender
package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?");
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Anurag");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Chaturvedi");
		driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("anuragchaturvedi0");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("anu12345");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("9555366363");
		//driver.findElement(By.cssSelector("div[id='gender-container']")).sendKeys("male");

	}

}
