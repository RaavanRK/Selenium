package rk_nium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LicPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://licindia.in/Home?lang=en-US");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	/*	WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		ww.until(ExpectedConditions.titleContains("Life Insurance Corporation of India - Home"));
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver2) {
				boolean ele1=driver2.findElement(By.xpath("//ul/li/a[text()='Pay Premium through ']")).isDisplayed();
				return ele1;
			}
			
		});	*/
		
	//	WebElement ele=driver.findElement(By.xpath("//ul/li/a[text()='Pay Premium through ']"));
	//	Actions a=new Actions(driver);		
	//	a.moveToElement(ele).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
	//	ele.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul/li/a[text()='Pay Premium through ']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
