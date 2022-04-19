package rk_nium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB2_is {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		System.out.println(ele.isDisplayed());		//check element is displayed or not
		System.out.println(ele.isEnabled());		//check element is enabled or not
		ele.click();
		System.out.println(ele.isSelected());		// works only for select tab
		
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		ele2.click();
		
		
		System.out.println(ele2.isSelected());		// shows selected or not
		
		driver.navigate().to("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium");
		Thread.sleep(2000);
		searchbox.clear();		// clears the textbox
		
		System.out.println(searchbox.getTagName());		// shows tag name
		
		System.out.println(searchbox.getCssValue("color"));		//shows colour of element
		
		System.out.println(searchbox.getCssValue("border"));		// shows border detail
		
		System.out.println(searchbox.getAttribute("data-ved"));		// fetches attrib value
		
		Point loc= searchbox.getLocation();		// finds locations of element
		System.out.println(loc);
		System.out.println(loc.getX()+"    "+loc.getY());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
