package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver fb=new ChromeDriver();
		fb.manage().window().maximize();
		fb.get("https://www.facebook.com/");
		
		WebElement uname=fb.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		uname.sendKeys("amrish puri");
		
		WebElement pass=fb.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		pass.sendKeys("sadf");
		//fb.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		
		fb.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	}

}
