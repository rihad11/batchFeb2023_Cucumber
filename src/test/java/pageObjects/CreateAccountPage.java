package pageObjects;

import StepDefinitions.TestRunner2;
import StepDefinitions.TestSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends TestRunner2 {

    public CreateAccountPage(WebDriver ldriver){
        driver=ldriver;
        PageFactory.initElements(ldriver, this);
    }


    @FindBy(xpath="//*[starts-with(@id,'u_0_0')]")
    WebElement createAcc;






}
