package tests;

import Pages.CartPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DriverManager;

public class CartTest {
    protected WebDriver driver;
    protected CartPage cartPage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        cartPage = new CartPage(driver);

    }

    @Test
    public void cartProductsCheck() {
        cartPage.goToProductsPage();
        cartPage.searchProduct("t-shirt");
        cartPage.addToCart();
        cartPage.goToCartPage();
        cartPage.isCartTableVisible();
        cartPage.isProductVisible();
    }

    @Test
    public void paymentTest() {
        cartPage.goToProductsPage();
        cartPage.searchProduct("t-shirt");
        cartPage.addToCart();
        cartPage.goToCartPage();
        cartPage.proceedToCheckoutButton();
        cartPage.reviewOrder();
    }

    @AfterClass
    public void quitWebDriver() {
        if (driver != null) ;
        {
            driver.quit();
            driver = null;
        }
    }
}




