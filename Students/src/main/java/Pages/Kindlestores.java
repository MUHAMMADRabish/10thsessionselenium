package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kindlestores {
	WebDriver driver;
@FindBy(xpath = "//*[text()='Best Sellers in Kindle Store']")
public WebElement Kindlestorestexts;
public Kindlestores(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public String  Kindlestoresget() {
	String storesjk=Kindlestorestexts.getText();
	return storesjk;
	
}
}
