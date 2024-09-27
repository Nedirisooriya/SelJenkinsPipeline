package testscenarios;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GoogleSearchPage; // Assuming you have a GoogleSearchPage class

public class GoogleTestPage {

    WebDriver driver;

    @BeforeTest
    public void beforetest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

    @Test
    public void googlesearch() throws InterruptedException {
        GoogleSearchPage page = new GoogleSearchPage(driver); // Pass the WebDriver instance to the GoogleSearchPage constructor
        page.search("facebook");
        Thread.sleep(3000);
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
