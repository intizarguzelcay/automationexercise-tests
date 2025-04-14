package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    //Constructor - Takes WebDriver and creates page elements
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this); //Find web elements
    }


    protected WebElement find(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator){
        find(locator).click();
    }

    protected void sendKeys(By locator, String text){

        find(locator).sendKeys(text);
    }


    public boolean isPageTitleCorrect(String expectedTitle){

        return driver.getTitle().equals(expectedTitle);
    }

    public WebDriver getDriver(){

        return driver;
    }
}
