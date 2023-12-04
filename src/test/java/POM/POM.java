package POM;

import org.openqa.selenium.WebDriver;

public class POM {
    protected WebDriver driver;

    public POM(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
