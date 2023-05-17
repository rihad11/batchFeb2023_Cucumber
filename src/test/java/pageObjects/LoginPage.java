package pageObjects;

import StepDefinitions.TestSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public LoginPage(WebDriver ldriver){
        TestSteps.driver=ldriver;
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
     //   driver.findElement(By.id("email")).sendKeys(user);
       Thread.sleep(3000);
       pass.sendKeys(passwrd);
        Thread.sleep(3000);
      //  driver.findElement(By.id("pass")).sendKeys(passwrd);
        System.out.println("user enters :"+ user+ "And "+ passwrd);

    }

    public void clickLogin(){
       // LogIn.click();
        System.out.println("user click on login" );
    }

}
