package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Agar Tum Saath Ho");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(.,'Heeriye (Official Video) Jasleen Royal ft Arijit Singh| Dulquer Salmaan| Aditya Sharma |')])[2]")).click();
	}
}
