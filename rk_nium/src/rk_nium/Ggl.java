package rk_nium;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Ggl {

	
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
			String title1=driver.getTitle();
			System.out.println(title1);
			
			WebElement ele=driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"));
			Actions a=new Actions(driver);
			a.moveToElement(ele).doubleClick().perform();
			Thread.sleep(1000);
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			Thread.sleep(1000);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(3000);
			
		/*	driver.navigate().refresh();
			Thread.sleep(1000);
			WebElement ele2=driver.findElement(By.id("inputWrapper"));
			ele2.sendKeys("hell",Keys.ENTER);
			Thread.sleep(1000);
			ele2.click();		*/
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
			
			String title2= driver.getTitle();
			System.out.println(title2);

			System.out.println(title1.equals(title2));




			
			
			
					
			
		
	}

}
