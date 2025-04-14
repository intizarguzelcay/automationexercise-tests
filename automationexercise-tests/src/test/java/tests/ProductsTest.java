package tests;

import Pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DriverManager;

public class ProductsTest {
    protected WebDriver driver;
    protected ProductsPage productsPage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        productsPage = new ProductsPage(driver);
    }

    @Test
    public void testSearchBoxInput(){
        productsPage.goToProductsPage();
        productsPage.searchProduct("t-shirt");
    }


    @Test
    public void testSelectCategory(){
        productsPage.goToProductsPage();
        productsPage.selectCategory("Women","dress","Polo");
    }

    @Test
    public void testViewProduct(){
        productsPage.goToProductsPage();
        productsPage.selectCategory("Women","dress","Polo");
        productsPage.viewProduct();
    }

   @Test
   public void testAddToCart(){
        productsPage.goToProductsPage();
        productsPage.searchProduct("t-shirt");
        productsPage.addToCart();
   }

    @AfterClass
    public void quitWebDriver(){
        if (driver != null);{
            driver.quit();
            driver=null;
        }

    }
}