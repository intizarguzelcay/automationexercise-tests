package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    private final By homeLink = By.xpath("//a[i[@class='fa fa-home']]");
    private final By productsLink = By.xpath("//a[@href='/products']");
    private final By cartLink = By.xpath("//a[@href='/view_cart']");
    private final By SignUpLoginLink  = By.xpath("//a[@href='/login']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickHomeLink(){
        click(homeLink);
    }

    public void clickProductsLink(){

        click(productsLink);
    }

    public void clickCartLink(){

        click(cartLink);
    }

    public void clickSignUpLoginLink(){
        click(SignUpLoginLink);
    }

}



