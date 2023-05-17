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
public class TestSteps {
    public static WebDriver driver;
    LoginPage loginPage = new LoginPage(driver);


    @Before
    public void openBrowser(){
        System.out.println("I am in before hooks");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
/*
    @After
    public void quitBrowser(){
        System.out.println("I am in After hooks");
        driver.quit();
    }

 */
    @Given("user in login page")
    public void user_in_login_page() {
      driver.get("https://www.facebook.com");
        System.out.println("Given Step");
    }
    @When("user enters uname and pass")
    public void user_enters_uname_and_pass() throws InterruptedException {

      // loginPage=new LoginPage(driver);
     //   loginPage.enterCredentials("rhasan","PQR!234");
        driver.findElement(By.id("email")).sendKeys("rhasan");
        driver.findElement(By.id("pass")).sendKeys("PQR!234");
        System.out.println("When Step");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and_password(String email, String pass) throws InterruptedException {
        loginPage.enterCredentials(email,pass);
    }




    @And("user click submit")
    public void user_click_on_submit() {
      //  driver.findElement(By.name("login")).click();
        System.out.println("And Step");
      //  loginPage.clickLogin();
    }

    @Then("user successfully login")
    public void user_successfully_log_in() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(),"Facebook - log in or sign up");
        System.out.println("Then Step");
        Thread.sleep(3000);

    }

}
