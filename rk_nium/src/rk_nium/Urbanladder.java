package rk_nium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.urbanladder.com/");
		WebElement sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]/parent::li"));
		
		Actions a=new Actions(driver);
		a.moveToElement(sale).perform();
		
		List<WebElement> salesMenu=driver.findElements(By.xpath(xpathExpression))
		
	}

}
