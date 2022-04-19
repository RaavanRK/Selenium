package rk_nium;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiPracti_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.id("container_reports")).click();
		driver.findElement(By.xpath("//div[@class='graphicButton createChart button']")).click();
		driver.findElement(By.xpath("//div[@class='addToDashboard']")).click();
		driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("Timings Chart");
		driver.findElement(By.xpath("//td[@class='saveNewConfigButton greyButton']")).click();
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn createChartModeElement name']")).click();
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
