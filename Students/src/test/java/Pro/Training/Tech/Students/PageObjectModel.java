package Pro.Training.Tech.Students;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Reusable;
import Pages.Bestsellers;
import Pages.Home;
import Pages.Kindlestores;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class PageObjectModel extends Reusable {
	
  @Test 
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  Thread.sleep(6000);
	  ob.BestSellersClick();
	  Bestsellers oj=new Bestsellers(driver);
	  Thread.sleep(6000);
	  oj.StoresToClick();
	  
	  screenshots();
	  Kindlestores ok=new Kindlestores(driver);
	  String kindlestorestexts=ok.Kindlestoresget();
	  System.out.println(kindlestorestexts);
	  SoftAssert jk=new SoftAssert();
	  
	 jk.assertEquals(kindlestorestexts, "Best Sellers in Kindle Store");
	  //assert, soft-assert
	  System.out.println("This is after assertion");
	jk.assertAll();
	  
  }
  @Test (dependsOnMethods = "f")
  public void seconds() {
	  System.out.println("This is second method");
  }
 
}
