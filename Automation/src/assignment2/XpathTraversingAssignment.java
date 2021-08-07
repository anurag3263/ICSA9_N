//1. open "https://filehippo.comr , click on popular software button , click on download button of VLC media player 

package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversingAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		/*
		 * driver.get("https://filehippo.com/");
		 * driver.findElement(By.xpath("//a[.='Popular software']")).click();
		 * //Thread.sleep(3000); driver.findElement(By.
		 * xpath("//p[.='VLC Media Player 64-bit']/../../../..//span[.='Download']")).
		 * click();
		 */

		//login to "https://demo.actitime.com/login.do" , click on settings link , click on types of work link , 
		//click on create type of work button , enter the name , click on create type of work button , 
		//click on delete link of the type on type of work created 
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Types of Work']/..")).click();
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Anurag");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Anurag']")).click();
		driver.findElement(By.xpath("//input[@value='Delete This Type of Work']")).click();
	}
	

}
