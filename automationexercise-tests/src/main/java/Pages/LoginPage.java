package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {

        super(driver);
    }


    public void goToLoginPage() {
        driver.get("https://www.automationexercise.com/login");
    }


    //Sign_Up
    public void signUp(String name, String email) {
        sendKeys(By.cssSelector("input[data-qa='signup-name']"), name);
        sendKeys(By.cssSelector("input[data-qa='signup-email']"), email);
        click(By.xpath("//button[@data-qa='signup-button']"));
    }

    public void fillAccountInformation(){
        click(By.id("id_gender1"));
        sendKeys(By.id("password"),"Punto1234!" );
        click(By.id("days"));
        click(By.cssSelector("select#days option[value='10']"));
        click(By.cssSelector("select#months option[value='11']"));
        click(By.cssSelector("select#years option[value='2000']"));
        click(By.id("newsletter"));
        click(By.id("optin"));
        sendKeys(By.id("first_name"),"Punto");
        sendKeys(By.id("last_name"),"Punto Işık");
        sendKeys(By.id("company"),"A");
        sendKeys(By.id("address1"),"12 sokak");
        sendKeys(By.id("address2"),"gül mah.");
        click(By.id("country"));
        click(By.cssSelector("select#country option[value='India']"));
        sendKeys(By.id("state"), "b");
        sendKeys(By.id("city"), "c");
        sendKeys(By.id("zipcode"), "245");
        sendKeys(By.id("mobile_number"), "345678567");
        click(By.cssSelector("button[data-qa='create-account']"));
        click(By.cssSelector("a[data-qa='continue-button']"));

    }


    //Logout

    public void logout() {
        click(By.cssSelector("a[href='/logout']"));


    }


    //Login
    public void login(String email, String password) {
        sendKeys(By.cssSelector("input[data-qa='login-email']"), email);
        sendKeys(By.cssSelector("input[data-qa='login-password']"), password);
        click(By.cssSelector("button[data-qa='login-button']"));
    }


}
   
