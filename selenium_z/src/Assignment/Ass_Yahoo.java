package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_Yahoo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./automation/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://login.yahoo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("narendrakmr2001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Nunu@@123##");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='      Mail ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("shushantkmr1999@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("Check Mail is getting Displayed or Not");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Dear Shushant,\r\n"
				+ "\r\n"
				+ "I am Narendra Kumar.\r\n"
				+ "\r\n"
				+ "I am sendding a mail , can you please check ?\r\n"
				+ "\r\n"
				+ "Thanks & Regards\r\n"
				+ "Narendra Kumar\r\n"
				+ "Mob- 8804245310");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Send']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='  Narendra ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Sign out']")).click();
		Thread.sleep(4000);
		driver.close();
		Thread.sleep(5000);
		WebDriver redriver= new FirefoxDriver();
		Thread.sleep(2000);
		redriver.get("https://login.yahoo.com/");
		Thread.sleep(2000);
		redriver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("shushantkmr1999");
		Thread.sleep(2000);
		redriver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(4000);
		redriver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Susu@@123##");
		Thread.sleep(2000);
		redriver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(6000);
		redriver.findElement(By.xpath("//a[text()='      Mail ']")).click();
		Thread.sleep(5000);
	}
}
