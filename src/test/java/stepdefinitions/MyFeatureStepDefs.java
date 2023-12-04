package stepdefinitions;

import POM.LogIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MyFeatureStepDefs {

    private WebDriver driver;

    @When("^UI Login with user \"(.*)\" and password \"(.*)\"$")
    public void UI_Login(String user,String password) {
        LogIn login = new LogIn(Hooks.getDriver());
        login.userName().setText(user);
        login.password().setText(password);
        login.Login().click();
    }

    @Then("^I should see the result$")
    public void iShouldSeeTheResult() {
        try {
            WebElement menu = Hooks.getDriver().findElement(By.cssSelector("div nav"));
            menu.click();
            Thread.sleep(5000);
            int flag = 0, kikaIndex=-1;
            WebElement menuChilds = Hooks.getDriver().findElement(By.cssSelector("div>ul"));
            List<WebElement> allChildElements = menuChilds.findElements(By.xpath("*"));
            for(int i=0;i<allChildElements.size();i++){
                if (allChildElements.get(i).getText().equals("Kika")) {
                    flag = 1;
                    kikaIndex = i;
                }
            }
            if (flag == 1)
                System.out.println("kika is exist");
            if(kikaIndex!= -1){
                allChildElements.get(kikaIndex).click();
            }
            Thread.sleep(5000);
            WebElement name = Hooks.getDriver().findElement(By.id("name"));
            WebElement email = Hooks.getDriver().findElement(By.id("email"));
            WebElement message = Hooks.getDriver().findElement(By.id("message"));
            Thread.sleep(5000);
            WebElement submit = Hooks.getDriver().findElement(By.cssSelector("[type=\"submit\"]"));
            name.sendKeys("Ameen");
            email.sendKeys("ameens@radware.com");
            message.sendKeys("Hello World");
            submit.click();
            System.out.println("clicked");
            Thread.sleep(5000);


        }catch (Exception e ){

        }

    }

    @When("^UI Navigate to \"(.*)\"$")
    public void uiNavigateTo(String arg0) {
    }
}
