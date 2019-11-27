import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;
    @Before
    public void initDriver() {
        System.setProperty("webdriver.crome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
    }
        @Test
        public void validLoginTest () {
            driver.get("http://testfasttrackit.info/selenium-test/customer/account/login/");
            WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
            driver.findElement(By.cssSelector("#email")).sendKeys("flaviumarc_cj@yahoo.com");
            driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
            loginButton.click();
            WebElement welcomeMessageElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
            Assert.assertEquals(welcomeMessageElement.getText(), ("Hello, Flavius Mark!"));



    }
public void closeDriver(){
        driver.quit();
}
}
