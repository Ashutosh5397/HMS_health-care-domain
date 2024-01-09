package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keys_Action {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		WebElement text1 = driver.findElement(By.xpath("(//input)[1]"));
		WebElement text2 = driver.findElement(By.xpath("(//input)[2]"));
		WebElement text3 = driver.findElement(By.xpath("(//input)[3]"));
		WebElement text4 = driver.findElement(By.xpath("(//input)[4]"));
		text1.sendKeys("😎");
		Thread.sleep(2000);
		text1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		text1.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		text2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		text2.sendKeys("😎");
		Thread.sleep(2000);
		text2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		text2.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		text3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		text3.sendKeys("😎");
		Thread.sleep(2000);
		text3.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		text3.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		text4.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		text4.sendKeys("😎");
		Thread.sleep(2000);
		text4.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		text4.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		text1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(5000);
		driver.close();
			}
}
