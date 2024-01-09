package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Personal/Desktop/assignment.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
}
}