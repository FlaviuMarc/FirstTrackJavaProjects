import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void validProductTest() {
        driver.get("http://testfasttrackit.info/selenium-test/customer/account/login/");
        WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
        driver.findElement(By.cssSelector("#email")).sendKeys("flaviumarc_cj@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        loginButton.click();
        WebElement welcomeMessageElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertEquals(welcomeMessageElement.getText(), ("Hello, Flavius Mark!"));

        Select sortByElement = new Select (driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-2.parent > a")));
        sortByElement.selectByIndex(2);

        //driver.findElement(By.cssSelector("#header > div > a > img.large")).click();
        //driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-2.active.parent > ul > li.level1.nav-2-3 > a")).click();
        //driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > a")).click();
        //Assert.assertEquals(welcomeMessageElement.getText(), ("CHELSEA TEE"));
    }


}
