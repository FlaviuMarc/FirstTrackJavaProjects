import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver");
//        WebDriver driver =  new ChromeDriver();
//
//        driver.get("http://testfasttrackit.info/selenium-test/");
//
//    }
    @Test
    public void loginTest(){
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
    }
}
