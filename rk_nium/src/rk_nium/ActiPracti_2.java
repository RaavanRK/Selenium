package rk_nium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiPracti_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.id("container_reports")).click();
		driver.findElement(By.xpath("//div[@class='graphicButton createChart button']")).click();
		driver.findElement(By.xpath("//div[@class='selectorsContainer']")).click();
		driver.findElement(By.xpath("//div[@class='x-form-radio-wrap-inner ']/label[contains(.,'Selected Staff')]")).click();
		driver.findElement(By.xpath("//a[@class='triState selectionEnabled']/span[contains(.,'Users Without Department')]")).click();
		driver.findElement(By.xpath("//div[@class=' x-btn greyButton close-button ']")).click();
		driver.findElement(By.xpath("//div[@class='greyButton withIcon commitBtn createChartModeElement name']")).click();
		
		
	}

}
