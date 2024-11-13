package HomePage;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    @Getter
    WebDriver driver;

    By username = By.xpath("/html/body/div[7]/div/div/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/input");

    By LOGIN = By.xpath("//*[@id='anonLogin']/a");

    By Googlelogo = By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[2]/div/div[5]/div[1]/div/svg");

    By mobile = By.xpath("//p[normalize-space()='Mobiles']");

    By slect_Location = By.xpath("//button[normalize-space()='Select Location']");

    By Dhaka = By.xpath("//button[normalize-space()='Dhaka']");

    By Mirpur = By.xpath("//button[normalize-space()='Mirpur']");
    By topProduct = By.xpath("(//li[@class='top-ads-container--1Jeoq gtm-top-ad'])[1]");

    By ProductDetails = By.xpath("//span[normalize-space()='For sale by']");

    By Search = By.xpath("//input[@type='search']");
    By MobilesSearch = By.xpath("//ol");

    By Previous = By.xpath("(//div[@class='action-button--1O8tU'])[1]");
    By Next = By.xpath("//div[normalize-space()='Next']");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(LOGIN);
    }

    public WebElement getUsername() {
        return driver.findElement(username);
    }

    public WebElement getGoogleIcon() {
        return driver.findElement(Googlelogo);

    }

    public WebElement getMobile() {
        return driver.findElement(mobile);
    }

    public WebElement selectLocation() {
        return driver.findElement(slect_Location);
    }

    public WebElement Dhaka() {
        return driver.findElement(Dhaka);
    }

    public WebElement Mirpur() {
        return driver.findElement(Mirpur);
    }

    public WebElement topProduct() {
        return driver.findElement(topProduct);
    }

    public WebElement ProductDetails() {
        return driver.findElement(ProductDetails);
    }

    public WebElement Search() {

        return driver.findElement(Search);

    }

    public WebElement MobilesSearch() {

        return driver.findElement(MobilesSearch);

    }

    public WebElement Previous() {

        return driver.findElement(Previous);

    }

    public WebElement Next() {

        return driver.findElement(Next);

    }

}
