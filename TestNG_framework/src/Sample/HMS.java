package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HMS {
	@Test
	void add() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://106.51.87.42:9007/");
	Thread.sleep(3000);
	driver.close();
}
}