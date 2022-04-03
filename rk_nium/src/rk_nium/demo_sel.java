package rk_nium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class demo_sel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium",Keys.ENTER);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.getClass());
		System.out.println(links.size());
		
		for(WebElement link_name /*local name given*/: links /*from where you want to fetch*/) {
			System.out.println(link_name.getText());
		}
		
	}

}
