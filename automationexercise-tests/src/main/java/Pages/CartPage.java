package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    public void goToProductsPage() {
        driver.get("https://www.automationexercise.com/products");
    }

    public void goToCartPage(){
        driver.get("https://www.automationexercise.com/view_cart");
    }

    public void searchProduct(String productName) {
        By searchInput = By.id("search_product");
        By searchButton = By.id("submit_search");

        sendKeys(searchInput, productName);
        click(searchButton);
    }

    public void addToCart(){
        By addToCartButton = By.xpath("//a[contains(@class, 'add-to-cart')]");
        By continueShoppingButton = By.xpath("//button[@class='btn btn-success close-modal btn-block' and contains(text(), 'Continue Shopping')]");

        click(addToCartButton);
        click(continueShoppingButton);

    }

    public boolean isCartTableVisible() {
        return driver.findElement(By.id("cart_info_table")).isDisplayed();
    }


    public boolean isProductVisible() {
        try {
            List<WebElement> productRows = driver.findElements(By.xpath("//tr[starts-with(@id, 'product-')]"));
            return productRows.size() > 0;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void proceedToCheckoutButton(){
       By proceedToCheckout=  By.cssSelector("a.btn.btn-default.check_out");
       click(proceedToCheckout);
    }

    public void reviewOrder(){
       By reviewOrderImage = By.xpath("//h2[contains(text(), 'Review Your Order')]");
    }

}
