package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.bluestone.com/");
		 Thread.sleep(2000);
		 WebElement login=driver.findElement(By.xpath("//div[@class='showLoginBox']"));
		 login.click();
		 Thread.sleep(2000);
		 
		 WebElement email=driver.findElement(By.xpath("//a[@class='btn btn-flat']"));
		 email.click();
		 driver.findElement(By.xpath("//input[@class='validate[required,custom[email]] text-input form-control elowrcase']")).sendKeys("sdlfkj@lsdlkfj");
		// email.sendKeys("sljkl@sldjk");
		 driver.findElement(By.xpath("//input[@class='validate[required] text-input form-control form-password']")).sendKeys("dfdf");
		 
		 driver.findElement(By.xpath(xpathExpression))
		 
	}

}
