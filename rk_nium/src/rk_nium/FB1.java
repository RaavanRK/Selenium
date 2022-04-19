package rk_nium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sday=new Select(day);
	//	sday.selectByIndex(9);		//integer index value starting from 0	
	//	sday.selectByValue("7");	//String value=inner text
		sday.selectByVisibleText("12");		//String value
		
		WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select smonth=new Select(month);
	//	smonth.selectByIndex(6);
	//	smonth.selectByValue("11");
		smonth.selectByVisibleText("Aug");
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select syear= new Select(year);
	//	syear.selectByIndex(3);
	//	syear.selectByValue("2017");
		syear.selectByVisibleText("2022");
		
		List<WebElement> dayOpt =smonth.getOptions();
		for (WebElement dOpt : dayOpt) {
			System.out.println(dOpt.getText());
			
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
