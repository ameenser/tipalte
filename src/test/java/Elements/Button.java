package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends Element{

    public Button(String selector,WebDriver driver){
        super(selector,driver);
    }

    public void click(){
        driver.findElement(By.cssSelector("[data-debug-id='"+selector+"']")).click();
    }

}
