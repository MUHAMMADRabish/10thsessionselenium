package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	WebDriver driver;
	@FindBy(id = "form-field-name") 
	WebElement FirstNameField;
    @FindBy(name = "form_fields[field_6c5f814]")
    WebElement LastNameField;
    @FindBy(name = "form_fields[email]")
    WebElement Email;
    
    public Contact(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
    public void FirstNameTexts(String name) throws InterruptedException {
    	FirstNameField.clear();
    	FirstNameField.sendKeys(name);
    	Thread.sleep(6000);
    	
    }
    public void LastNameTexts(String LastName) throws InterruptedException {
    	LastNameField.clear();
    	LastNameField.sendKeys(LastName);
    	Thread.sleep(6000);
    }
    public void EmailTexts(String EmailTexts) throws InterruptedException {
    	Email.clear();
    	Email.sendKeys(EmailTexts);
    	Thread.sleep(6000);
    	
    }

}
