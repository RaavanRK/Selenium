package rk_nium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.bluestone.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("RINGS",Keys.ENTER);
		 Thread.sleep(2000);
		 
		 List<WebElement> count=driver.findElements(By.xpath("//span[@class='total-designs']"));
		 for(WebElement cnt:count)
			 System.out.println(cnt.getText());
		 
	/*	List<WebElement> rings=driver.findElements(By.xpath("//ul[@class='product-grid search-box-result']/li"));
		Thread.sleep(5000);
		System.out.println(rings.size());	*/

}
}
