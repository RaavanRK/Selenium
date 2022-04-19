package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement kd=driver.findElement(By.xpath("//a[@data-group='kids']"));
		Actions a=new Actions(driver);
		a.moveToElement(kd).perform();;
		driver.findElement(By.xpath("//a[@data-reactid='345']")).click();
		
		driver.navigate().to("https://www.actitime.com/");
		WebElement ele=driver.findElement(By.linkText("Pricing"));
	//	Actions a=new Actions(driver);
		a.moveToElement(ele, -200, 0).perform();
		
	}

}
