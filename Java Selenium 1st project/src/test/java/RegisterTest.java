import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class RegisterTest {
    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void validRegisterTest(){
        String userEmail = RandomStringUtils.randomAlphanumeric(3) + "@testFastTrackIT.com";
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");


        driver.get("http://testfasttrackit.info/selenium-test/customer/account/create/");
        WebElement registerButton = driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));

        driver.findElement(By.cssSelector("#firstname")).sendKeys("ABC");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("ABC");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("ABC");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ana@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));

        registerButton.click();
    }
    @After
    public void closeDriver(){
        driver.quit();
    }
}
