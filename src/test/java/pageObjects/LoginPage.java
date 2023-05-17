package pageObjects;

import StepDefinitions.TestRunner2;
import StepDefinitions.TestSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestRunner2 {

    public LoginPage(WebDriver ldriver){
        driver=ldriver;
        PageFactory.initElements(ldriver, this);
    }


    @FindBy(id="email")
    WebElement userid;

    @FindBy(id="pass")
    WebElement pass;

    @FindBy(name="login")
    WebElement LogIn;



    public void enterCredentials(String user, String passwrd) throws InterruptedException {
        userid.sendKeys(user);
        Thread.sleep(3000);
        pass.sendKeys(passwrd);
        Thread.sleep(3000);
        System.out.println("user enters :"+ user+ " And "+ passwrd);

    }

    public void clickLogin(){
       // LogIn.click();
        System.out.println("user click on login" );
    }

}
