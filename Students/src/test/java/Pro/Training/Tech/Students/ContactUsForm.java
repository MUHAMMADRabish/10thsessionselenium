package Pro.Training.Tech.Students;

import org.testng.annotations.Test;

import Common.Reusable;
import Pages.Contact;

import org.testng.annotations.DataProvider;

public class ContactUsForm extends Reusable{
  @Test(dataProvider = "dp")
  public void f(String n, String s , String k) throws InterruptedException {
	  Contact ob=new Contact(driver);
	  ob.FirstNameTexts(n);
	  ob.LastNameTexts(s);
	  ob.EmailTexts(k);
	 
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Shahbaz", "Saleem","Saleem@gmail.com" },
      new Object[] { "Sana", "Lodhi","Sana@gmail.com" },
      new Object[] { "John", "Saltana","John@gmail.com" },
      
    };
  }
}
