package tests;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.DriverManager;

import static utils.DriverManager.getDriver;

public class HomePageTest {

   private WebDriver driver;
   private HomePage homePage;


   @BeforeClass
   public void setUP(){
      driver = DriverManager.getDriver();  // Driver'ı al
      homePage = new HomePage(driver);    // homePage nesnesini oluştur
   }

   @Test
   public void testAllHeaderLinksAreDisplayed(){
      By[] locators={
              By.xpath("//a[i[@class='fa fa-home']]"),
              By.xpath("//a[@href='/products']"),
              By.xpath("//a[@href='/view_cart']"),
              By.xpath("//a[@href='/login']"),
      };
      for (By locator : locators) {
         WebElement element = driver.findElement(locator);
         Assert.assertTrue(element.isDisplayed(), locator.toString() + " is not visible.");
      }
   }


   @Test
    public void testHomeLinkClick(){
       homePage.clickHomeLink();
       String expectedTitle ="Automation Exercise";
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle,expectedTitle,"Page title does not match after clicking on home page.");
   }

   @Test
   public void testProductsLinkClik(){
      homePage.clickProductsLink();
      String expectedUrl = "https://www.automationexercise.com/products";
      String actualUrl = driver.getCurrentUrl();
      Assert.assertEquals(expectedUrl,actualUrl,"Page URL does not match after clicking on products page.");
   }


   @Test
   public void testCartLink(){
      homePage.clickCartLink();
      String expectedUrl ="https://www.automationexercise.com/view_cart";
      String actualUrl = driver.getCurrentUrl();
      Assert.assertEquals(expectedUrl,actualUrl,"Page URL does not match after clicking on cart page.");
   }

   @Test
   public void testSignUpLoginLink(){
      homePage.clickSignUpLoginLink();
      String expectedUrl = "https://www.automationexercise.com/login";
      String actualUrl = driver.getCurrentUrl();
      Assert.assertEquals(expectedUrl,actualUrl,"Page URL does not match after clicking on SignUp/Login page. ");
   }

   @AfterClass
   public  void quitDriver() {
      if (driver != null) {
         driver.quit();
         driver = null;
      }
   }
}
