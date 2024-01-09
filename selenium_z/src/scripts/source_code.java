package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class source_code {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		String code = driver.getPageSource();
		System.out.println(code);
		driver.close();
}
}