package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchActi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver chdr=new ChromeDriver();
		chdr.manage().window().maximize();
		chdr.get("http://190.210.184.180/login.do");
		
		WebElement uName = chdr.findElement(By.name("username"));
		uName.sendKeys("admin");
		
		WebElement pass = chdr.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		
	//	WebElement login = chdr.findElement(By.name(""));
	//	login.click();
	}

}
