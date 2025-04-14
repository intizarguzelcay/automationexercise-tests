package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.LoginPage;
import utils.DriverManager;

public class LoginPageTest {
    protected WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        loginPage = new LoginPage(driver);
    }


    @Test
    public void testSignUp() throws InterruptedException {
        loginPage.goToLoginPage();
        loginPage.signUp("Punto", "Into@example.com");
        loginPage.fillAccountInformation();
        Thread.sleep(3000);
    }


    @Test
    public void logOut(){
        loginPage.goToLoginPage();
        loginPage.login("Into@example.com", "Punto1234!");
        loginPage.logout();
        String expectedUrl ="https://www.automationexercise.com/login";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,expectedUrl, "Logout sonrası login sayfasına yönlendirilmedi.");
    }


    @Test
    public void logIn(){
        loginPage.goToLoginPage();
        loginPage.login("Into@example.com","Punto1234!");
    }


    @AfterClass
    public  void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
