package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import HomePage.Homepage;
import Reports.PageObjectManage;
import utilis.TestContextSetup;
import org.openqa.selenium.By;

public class testSteps {
    TestContextSetup testContextSetup;
    Homepage homepage;
    PageObjectManage pageObjectManage;
    WebDriver driver;

    public testSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.homepage = testContextSetup.pageObjectManager.getHomePage();
        this.driver = testContextSetup.driver;
    }

    @When("Click on login button")
    public void click_on_login_button() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(homepage.getLogin().isDisplayed());
        homepage.getLogin().click();
    }

    @When("Click on username and input email")
    public void click_on_username_and_input_email() throws InterruptedException {
        Thread.sleep(2000);
        // Ensure the Google icon is displayed and click it
        Assert.assertTrue(homepage.getGoogleIcon().isDisplayed());
        homepage.getGoogleIcon().click();

        // Find the username/email input field and enter the email
        WebElement emailField = driver.findElement(By.xpath("//input[@type='email' or @name='username']"));
        emailField.sendKeys("dmrafiun@gmail.com");
    }

    @When("Click on Google logo")
    public void click_on_google_logo() throws InterruptedException {
        // Code for clicking on Google logo
    }

    // Add other step definitions as needed
}
