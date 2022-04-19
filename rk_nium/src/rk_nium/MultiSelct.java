package rk_nium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/DemoSelect.html");
		
		WebElement ele = driver.findElement(By.id("b"));
		Select s = new Select(ele);
		
		if(s.isMultiple()){
		//	s.selectByIndex(0);			//select one by one
		//	s.selectByIndex(2);			//select one by one
			
			List<WebElement> opts = s.getOptions();
			for (WebElement opt : opts)					// select all using loop
			{
				s.selectByVisibleText(opt.getText());
				Thread.sleep(1000);
				
			}
		}
		System.out.println(s.getFirstSelectedOption().getText());	//show first selected opt
		System.out.println("--------------------");
		
		List <WebElement> sopts = s.getAllSelectedOptions();	//list selected opt
		for (WebElement abc : sopts)					//fetch all selected opts
		{ 					
			System.out.println(abc.getText());
			
		}
		
		s.deselectByIndex(0);		//deselect one by one
		Thread.sleep(1000);
		s.deselectByIndex(2);		//deselect one by one
		Thread.sleep(1000);
		s.deselectAll();			// deselect all
		
		Thread.sleep(2000);
		driver.close();
	}

}
