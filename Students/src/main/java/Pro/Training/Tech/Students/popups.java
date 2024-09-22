package Pro.Training.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.cheapoair.com/");
		//Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(16000);
		//WebElement agree=driver.findElement(By.linkText("Agree"));
		//agree.click();
		//Thread.sleep(6000);
		WebElement flights=driver.findElement(By.xpath("//*[@aria-label='Choose a departure date. expanded']"));
		flights.click();
		Thread.sleep(6000);
		WebElement fl=driver.findElement(By.xpath("//*[@aria-label='26 August 2024']"));
		fl.click();
		
	}

}
