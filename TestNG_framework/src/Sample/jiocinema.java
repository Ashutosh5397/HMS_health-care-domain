package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jiocinema {
	@Test
	void add() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.jiocinema.com");
	Thread.sleep(3000);
	driver.close();
}
}
