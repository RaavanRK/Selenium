package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement wmn=driver.findElement(By.xpath("//ul[1]/li[1]/a[@title='Women']"));
		Actions a=new Actions(driver);
		a.moveToElement(wmn).perform();
		driver.findElement(By.xpath("//li[1]/a[@title='T-shirts']")).click();
		WebElement ts=driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		a.moveToElement(ts).perform();
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Close window']")).click();
		
	}

}
