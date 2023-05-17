package StepDefinitions;


import io.cucumber.java.After;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;

import java.time.Duration;
// cucumber hooks
public class TestSteps extends TestRunner2{

    LoginPage loginPage;


    @Before
    public void openBrowser(){
        System.out.println("I am in before hooks");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @After
    public void quitBrowser() throws InterruptedException {
        System.out.println("I am in After hooks");
        Thread.sleep(9000);
        driver.close();
    }

    @Given("user in login page")
    public void user_in_login_page() {
      driver.get("https://www.facebook.com");
      System.out.println("Given Step");
    }
    @When("user enters uname and pass")
    public void user_enters_uname_and_pass() throws InterruptedException {
        loginPage=new LoginPage(driver);
        loginPage.enterCredentials("rhasan","PQR!234");

    }

    @When("user enters {string} and {string}")
    public void user_enters_and_password(String email, String pass) throws InterruptedException {
        loginPage=new LoginPage(driver);
        loginPage.enterCredentials(email,pass);
    }

/*
    @When("^user enters (.*) and (.*)$")
    public void user_enters_userddt_and_pass_ddt(String user, String pass) throws InterruptedException {
        loginPage.enterCredentials(user,pass);
        Thread.sleep(4000);
    }

*/


    @And("user click submit")
    public void user_click_on_submit() {
          System.out.println("User Click Submit");
      //  loginPage.clickLogin();
    }

    @Then("user successfully login")
    public void user_successfully_log_in() throws InterruptedException {
        System.out.println("User Successfully login");


    }

}
