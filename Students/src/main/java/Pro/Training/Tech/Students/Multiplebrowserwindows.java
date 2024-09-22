package Pro.Training.Tech.Students;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplebrowserwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(16000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow);
		WebElement bestsellers=driver.findElement(By.linkText("Best Sellers"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		bestsellers.click();
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();
	
		
		Set<String> windowhandlesbrowsers=driver.getWindowHandles();
		Iterator<String> iterators=windowhandlesbrowsers.iterator();
		String FirstWindowHandle=iterators.next();
		String SecondWindowHandle=iterators.next();
		System.out.println("This is first handle ="+FirstWindowHandle);
	    System.out.println("This is second handle ="+SecondWindowHandle);
		driver.switchTo().window(SecondWindowHandle);
		Thread.sleep(6000);
		WebElement stores=driver.findElement(By.linkText("Kindle Store"));
		stores.click();
	}

}
