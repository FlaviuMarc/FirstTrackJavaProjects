import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
        public void sortTest(){
            String userEmail = RandomStringUtils.randomAlphanumeric(3) + "@testFastTrackIT.com";
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

            driver.get("http://testfasttrackit.info/selenium-test/");
            driver.findElement(By.cssSelector("#search")).sendKeys("Shirts");
            driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();
            driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select"));
            Select sortByElement = new Select(driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select")));
            sortByElement.selectByIndex(1);

    }
    @After
    public void closeDriver() {
        driver.quit();
    }
}
