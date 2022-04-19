package ananymousInnerClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/rk/DemoWait.html");			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		 
		
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		ww.until(new ExpectedCondition<Boolean>() { // custom wait condition is created as ananymous inner class

			@Override						// overrided the apply method for custom use
			public Boolean apply(WebDriver dvr) {
				boolean eleDisplayed = dvr.findElement(By.id("iamtextbox")).isDisplayed(); // checking if element is displayed or not
				
				return eleDisplayed;
			}
			
		});		// after execution of this block next line will be executed
		
		driver.findElement(By.id("iamtextbox")).sendKeys(" aa gya bey ...");

	}

}
