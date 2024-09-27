package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    
    WebDriver driver;
    
    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By SearchBox = By.xpath("//*[@id=\"APjFqb\"]");

    public void search(String searchinput) {
        driver.findElement(SearchBox).sendKeys(searchinput);
    }
}
