package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextInput extends Element {

    public TextInput(String selector, WebDriver driver){
        super(selector,driver);
    }

    public void setText(String text){
        driver.findElement(By.cssSelector("[data-debug-id='"+selector+"']")).sendKeys(text);
    }

}
