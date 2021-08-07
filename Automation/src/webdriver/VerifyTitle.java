package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\google.co.in");
		String actualTitle=driver.getTitle();
		if(actualTitle.equals("google"))     // case sensitive 
		//if(actualTitle.equalsIgnoreCase("google"))   //use to ignore case sensitive
		{
			System.out.println("titles are matching");
		}
		else
		{
			System.out.println("titles are not matching");
		}
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.contains("com"))
		{
          System.out.println("it's present");
	}else
	{
         System.out.println("it's not present");
}
}
}