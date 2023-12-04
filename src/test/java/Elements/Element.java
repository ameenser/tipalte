package Elements;

import org.openqa.selenium.WebDriver;

public class Element {
    String selector;
    WebDriver driver;

    public Element(String selector, WebDriver driver){
        this.driver = driver;
        this.selector = selector;

    }
}
