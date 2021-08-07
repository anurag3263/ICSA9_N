package miscellaneous;

import org.openqa.selenium.os.WindowsUtils;



public class KillWindowProcess {

	public static void main(String[] args) {
		WindowsUtils.killByName("chromedriver.exe");
		WindowsUtils.killByName("geckodriver.exe");
		System.out.println(WindowsUtils.thisIsWindows());

	}

}
