package Pro.Training.Tech.Students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\Students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		//Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement createanaccount=driver.findElement(By.linkText("Create new account"));
		createanaccount.click();
		Thread.sleep(6000);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(month);
		ob.selectByIndex(1);
		Thread.sleep(6000);
		ob.selectByValue("6");
		Thread.sleep(6000);
		ob.selectByVisibleText("Aug");
		WebElement males=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
		males.click();
	}

}
