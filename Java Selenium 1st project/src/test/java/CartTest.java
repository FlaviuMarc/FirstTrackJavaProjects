import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CartTest {
    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
         driver = new ChromeDriver();
    }

@Test
    public void valitCartTest(){

        driver.get("http://testfasttrackit.info/selenium-test/customer/account/login/");
        WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
        driver.findElement(By.cssSelector("#email")).sendKeys("flaviumarc_cj@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        loginButton.click();
        WebElement welcomeMessageElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertEquals(welcomeMessageElement.getText(), ("Hello, Flavius Mark!"));

        driver.get("http://testfasttrackit.info/selenium-test/men/shirts.html");
        driver.findElement(By.cssSelector("#product-collection-image-404")).click();
        driver.findElement(By.cssSelector("#swatch17 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#swatch79 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        Assert.assertEquals(welcomeMessageElement.getText() , ("SHOPPING CART"));
    }
    @After
    private void closeDriver(){
        driver.close();
    }
}
