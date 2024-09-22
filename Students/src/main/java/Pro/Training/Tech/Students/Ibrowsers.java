package Pro.Training.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//how to setup the browser and how to open the 
		//website into the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		//Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		/*Thread.sleep(6000);
		driver.navigate().back();
		//Thread.sleep(6000);
		driver.navigate().forward();
	String sessions=driver.getWindowHandle();//Get sessionid for the browser
	System.out.println(sessions);
	String titles=driver.getTitle();
	System.out.println(titles);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();*/
		
	/*i) id ii)linktext iii)partiallinktext iv)ClassName v)Name vi)Xpath
	 * vii)Css selector viii)Tagname
	 */
		WebElement emailenters =driver.findElement(By.id("email"));
		
		emailenters.sendKeys("Asim@protrainingtech.com");
		WebElement psswrd=driver.findElement(By.name("pass"));
		psswrd.sendKeys("jk");
		//WebElement forgtlk=driver.findElement(By.linkText("Forgot password?"));
		WebElement forgtlk=driver.findElement(By.partialLinkText("Forgot"));
		
		forgtlk.click();
	
	}

}









