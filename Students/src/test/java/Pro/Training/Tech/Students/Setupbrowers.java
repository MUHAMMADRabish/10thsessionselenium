package Pro.Training.Tech.Students;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Setupbrowers {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
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
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(16000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
  }
  @Test
  public void Bkeyboards() throws InterruptedException {
	  WebElement search=driver.findElement(By.name("field-keywords"));
		search.sendKeys("Computer");
		Actions ob=new Actions(driver);
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//Selectall, Copy the text, Clear
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		search.clear();
	    search.click();
		//Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.quit();
  }

}
