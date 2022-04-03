package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver chdr=new ChromeDriver();
		chdr.manage().window().maximize();
		chdr.get("https://demo.actitime.com/login.do");
		
		WebElement uName = chdr.findElement(By.name("username"));
		uName.sendKeys("admin");
		
		WebElement pass = chdr.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		
		WebElement fp=chdr.findElement(By.partialLinkText("Forgotten your"));
		fp.click();
		
	//	WebElement login = chdr.findElement(By.name(""));
	//	login.click();
	}

}
