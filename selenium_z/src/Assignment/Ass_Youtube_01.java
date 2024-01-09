package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_Youtube_01 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	search.sendKeys("heeriye");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(.,'Heeriye (Official Video) Jasleen Royal ft Arijit Singh| Dulquer Salmaan| Aditya Sharma |')])[2]")).click();
}
}