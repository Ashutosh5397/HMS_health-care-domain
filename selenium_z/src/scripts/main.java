package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.shaadi.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
}
}