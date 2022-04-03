package rk_nium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSugg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> suggestion= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		for(WebElement sugg : suggestion)
		{
			System.out.println(sugg.getText());
		}
		driver.findElement(By.xpath("//b[text()='script']")).click();
		
	}

}
