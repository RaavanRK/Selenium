package rk_nium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbanLoader {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.urbanladder.com/");
		/*	WebElement sale=driver.findElement(By.xpath("//li/span[contains(.,'Sale')]"));
			System.out.println(sale.getText());	*/
			
			Thread.sleep(2000);
			List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
			for(WebElement menu : menus)
			{
				System.out.println(menu.getText());
			}
			
		}
		
}
