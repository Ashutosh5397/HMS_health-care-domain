package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMaps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/maps/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("tactile-searchbox-input")).sendKeys("Kolkata");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Bihar");
}
}