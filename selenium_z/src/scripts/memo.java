package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DriverCommand;

public class memo {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.shaadi.com");
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	}
}
