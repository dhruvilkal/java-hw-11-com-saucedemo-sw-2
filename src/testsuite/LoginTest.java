package testsuite;
/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userShouldLoginSuccessfullyWithValid Credentials
 *      Enter “standard_user” username
 *      Enter “secret_sauce” password
 *      Click on ‘LOGIN’ button
 *      Verify the text “PRODUCTS”
 * 2. verifyThatSixProductsAreDisplayedOnPage
 *      Enter “standard_user” username
 *      Enter “secret_sauce” password
 *      Click on ‘LOGIN’ button
 *      Verify that six products are displayed on  page
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    // Declare baseUrl
    String baseUrl = "https://www.saucedemo.com/";


    // Open Browser
    @Before
    public void setUP(){
        openBrowser(baseUrl);
    }

    @Test
    // Method name userShouldLoginSuccessfullyWithValidCredentials
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        // Find Username field and enter username in the field
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        // Find Password field and enter password in the field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Find Login button and click login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Expected text
        String expectedText = "Products";

        // Actual text find and check equal or not
        WebElement actualTextElement = driver.findElement(By.xpath("//span[@class= 'title']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText,actualText);
    }

    @Test
    // Method name verifyThatSixProductsAreDisplayedOnPage
    public void verifyThatSixProductsAreDisplayedOnPage(){

        // Find Username field and enter username in the field
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");

        // Find Password field and enter password in the field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Find Login button and click login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Find six products link and verify product
        // First product Sauce Labs Backpack
        WebElement backPack = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Backpack')]"));
        backPack.click();
        WebElement backButton = driver.findElement(By.id("back-to-products"));
        backButton.click();


        // Second product Sauce Labs Bike Light
        WebElement bikeLight = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Bike Light')]"));
        bikeLight.click();
        WebElement backButton1 = driver.findElement(By.id("back-to-products"));
        backButton1.click();

        // Third product Sauce Labs Bolt T-Shirt
        WebElement boltTShirt = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]"));
        boltTShirt.click();
        WebElement backButton3 = driver.findElement(By.id("back-to-products"));
        backButton3.click();

        // Fourth product Sauce Labs Fleece Jacket
        WebElement fleeceJacket = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Fleece Jacket')]"));
        fleeceJacket.click();
        WebElement backButton4 = driver.findElement(By.id("back-to-products"));
        backButton4.click();

        // Fifth product Sauce Labs Onesie
        WebElement labsOnesie = driver.findElement(By.xpath("//div[contains(text(), 'Sauce Labs Onesie')]"));
        labsOnesie.click();
        WebElement backButton5 = driver.findElement(By.id("back-to-products"));
        backButton5.click();

        // Six product Test.allTheThings() T-Shirt (Red)
        WebElement redTShirt = driver.findElement(By.xpath("//div[contains(text(), 'Test.allTheThings() T-Shirt (Red)')]"));
        redTShirt.click();
        WebElement backButton6 = driver.findElement(By.id("back-to-products"));
        backButton6.click();

    }

    //Close browser
    @After
    public void tearDown(){
        closeBrowser();
    }

}
