package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.scene.control.Alert;

public class GuruAlertPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v1/");
		driver.findElement(By.name("btnLogin")).click();
		Alert a= new Alert();
		
	
	}

}
