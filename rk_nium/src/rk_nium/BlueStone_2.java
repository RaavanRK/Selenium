package rk_nium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.bluestone.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//span[text()='Locate']")).click();
		 List<WebElement> locations=driver.findElements(By.xpath("//ul[@class='side-bar']/li"));
		 for(WebElement loc : locations )
		 {	System.out.println(loc.getText());
		 	driver.findElement(By.xpath("//ul[@class='side-bar']/li")).click();
		 	Thread.sleep(2000);
		 	List<WebElement> add=driver.findElements(By.xpath("//div[@class='address']"));
		 	
		 	
		 	
		 	
			 
		 }
		 
	}

}
