package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }


    public void goToProductsPage() {
        driver.get("https://www.automationexercise.com/products");
    }


    //Search box input

    public void searchProduct(String productName) {
        By searchInput = By.id("search_product");
        By searchButton = By.id("submit_search");

        sendKeys(searchInput, productName);
        click(searchButton);
    }

    //Select category&brands

    private String getSubCategoryCode(String subCategory) {
        switch (subCategory.toLowerCase()) {
            case "dress":
                return "1";
            case "tops":
                return "2";
            case "saree":
                return "7";
            default:
                throw new IllegalArgumentException("Unknown sub-category: " + subCategory);
        }
    }

    public void selectCategory(String category, String subCategory, String brand) {
        By categoryLocator = By.xpath("//a[@href='#" + category + "']");
        By subCategoryLocator = By.cssSelector("a[href='/category_products/" + getSubCategoryCode(subCategory) + "']");
        By brandLocator = By.xpath("//a[contains(@href, '/brand_products') and contains(., '" + brand + "')]");

        click(categoryLocator);
        waitUntilVisible(subCategoryLocator);
        click(subCategoryLocator);
        waitUntilVisible(brandLocator);
        click(brandLocator);
    }

    //View product

    public void viewProduct(){
        By viewProductLocator = By.xpath("//a[@href='/product_details/1' and contains(text(), 'View Product')]");

        click(viewProductLocator);
    }

    //Add to cart
    public void addToCart(){
        By addToCartButton = By.xpath("//a[contains(@class, 'add-to-cart')]");
        By continueShoppingButton = By.xpath("//button[@class='btn btn-success close-modal btn-block' and contains(text(), 'Continue Shopping')]");

        click(addToCartButton);
        click(continueShoppingButton);


    }

}
