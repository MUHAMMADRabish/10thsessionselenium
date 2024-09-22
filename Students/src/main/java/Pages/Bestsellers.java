package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bestsellers {
	WebDriver driver;
	@FindBy(linkText = "Kindle Store") public WebElement Stores;
	
	public Bestsellers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void StoresToClick() {
		Stores.click();
	}
	

}

//i)Locate the element 
//page factory constructor
//create a method for each element according to action