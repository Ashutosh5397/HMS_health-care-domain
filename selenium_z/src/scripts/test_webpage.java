package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_webpage 
{
@Test
void add() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.fb.com");
	Thread.sleep(2000);
	driver.close();
}
   @Test
   void mul() throws InterruptedException {
   System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.shaadi.com");
	Thread.sleep(2000);
	driver.close();
}
   @Test
   void zo() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.close();
}
}
