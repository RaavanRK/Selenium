package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaChildWindowPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@class='mt-4 btn btn-primary']")).click();
		
		String parentWindowID = driver.getWindowHandle();	
		System.out.println(parentWindowID);
		
														// getWindowHandles() returns linkedHashSet
		Set<String> wins = driver.getWindowHandles();	// like arraylist set doesnt follows insertion order
		wins.remove(parentWindowID);	// removes parent window ID from set so that only child window
											// could be terminated 
		for(String wi : wins) {						// using for loop for fetching the data without index
			System.out.println(wi);
			driver.switchTo().window(wi);
			driver.close();						// closing the window one by one from set(here only child)
			Thread.sleep(3000);
		}
		
		/* FETCH THE TEXT FROM CHILD WINDOW  */
		
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//button[contains(.,'New Window Message')]")).click();
		Set<String> win2 = driver.getWindowHandles();
		win2.remove(parentWindowID);
		for (String wi2 : win2) {
			driver.switchTo().window(wi2);
			Thread.sleep(2000);
			System.out.println(wi2);
			driver.getTitle();
			System.out.println(driver.findElement(By.tagName("body")).getText());
			driver.close();
			
		}
	}

}
