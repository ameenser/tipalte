package POM;

import Elements.Button;
import Elements.TextInput;
import org.openqa.selenium.WebDriver;

public class LogIn extends POM{

    public LogIn(WebDriver driver){
        super(driver);
    }

    public Button Login(){
        return new Button("button_",driver);
    }

    public TextInput userName(){
        return new TextInput("usernameInput",driver);
    }

    public TextInput password(){
        return new TextInput("passwordInput",driver);
    }

}
