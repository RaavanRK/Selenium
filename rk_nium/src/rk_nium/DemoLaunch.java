package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		//driver.get("www.facebook.com");
	//	Thread.sleep(2000);
	//	driver.navigate().back();
		
	//	Thread.sleep(2000);
	//	driver.navigate().forward();
		
	//	Thread.sleep(2000);
	//	driver.navigate().refresh();
		
	//	driver.navigate().to("https/www.google.com/");
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
	//	search.sendKeys("java");
		search.sendKeys("java",Keys.ENTER);
		
		driver.navigate().to("https://en-gb.facebook.com/");
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("pavan kalyan");
		
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("hulcut");	
		
		WebElement fp= driver.findElement(By.linkText("Forgotten Password?"));
		fp.click();	//using full link text
		WebElement fp2=driver.findElement(By.partialLinkText("Forgotten"));
		fp2.click();	//using partial link text
		
	//	WebElement login=driver.findElement(By.name("login"));
	//	login.click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
