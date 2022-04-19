package rk_nium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliWaitActi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		// selenium 3 not in use now
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		// selenium 4 
		
		driver.findElement(By.xpath("//td/input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager",Keys.ENTER);
		
		
		WebDriverWait ww= new WebDriverWait(driver, Duration.ofSeconds(10));	// create instance for checking condition
		ww.until(ExpectedConditions.titleContains("Enter"));					// check condition 
		
		ww.until(ExpectedConditions.urlContains("https://demo.actitime.com/user/submit_tt.do"));
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();	// logout
		
		Thread.sleep(3000);
	//	driver.quit();
	}

}
