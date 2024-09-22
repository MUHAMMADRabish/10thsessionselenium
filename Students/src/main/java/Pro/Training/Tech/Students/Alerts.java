package Pro.Training.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		//Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement submission=driver.findElement(By.name("submit"));
		submission.click();
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		
		
	}

}
