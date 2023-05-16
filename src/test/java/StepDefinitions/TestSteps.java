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

import java.time.Duration;
// cucumber hooks
public class TestSteps {
    public WebDriver driver= null;

    @Before
    public void openBrowser(){
        System.out.println("I am in before hooks");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void quitBrowser(){
        System.out.println("I am in After hooks");
        driver.quit();
    }
    @Given("user in login page")
    public void user_in_login_page() {
      driver.get("https://www.facebook.com");
        System.out.println("Given Step");
    }
    @When("user enters uname and pass")
    public void user_enters_uname_and_pass() {
        driver.findElement(By.id("email")).sendKeys("rhasan");
        driver.findElement(By.id("pass")).sendKeys("PQR!234");
        System.out.println("When Step");
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String uname, String pass) {
        driver.findElement(By.id("email")).sendKeys(uname);
        driver.findElement(By.id("pass")).sendKeys(pass);
        System.out.println("user enters "+ uname+ "and "+ pass);
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_rakihasan_ddt_and_abc_ddt(String unameddt, String passddt) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(unameddt);
        driver.findElement(By.id("pass")).sendKeys(passddt);
        Thread.sleep(4000);
    }

    @And("user click submit")
    public void user_click_on_submit() {
      //  driver.findElement(By.name("login")).click();
        System.out.println("And Step");
    }

    @Then("user successfully login")
    public void user_successfully_log_in() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(),"Facebook - log in or sign up");
        System.out.println("Then Step");
        Thread.sleep(3000);

    }

}
