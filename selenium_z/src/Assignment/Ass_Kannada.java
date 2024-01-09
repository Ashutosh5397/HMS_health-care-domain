package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_Kannada {
	public void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://en.wikipedia.org/wiki/List_of_Kannada_films_of_2023");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Kabzaa']/../../../td[4]")).getLocation();
	}
}
