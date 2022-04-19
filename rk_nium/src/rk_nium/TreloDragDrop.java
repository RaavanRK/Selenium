package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TreloDragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.linkText("Log in")).click();
	}

}
