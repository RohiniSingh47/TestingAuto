package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLoginRunner {
    private WebDriver driver;

    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^User Navigate to Login Page$")
    public void user_navigate_to_login_page() throws Throwable {
        System.out.println("user_navigate_to_login_page");
    }
    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        System.out.println("User name is "+ username + " password is "+ password);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys(username);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
    }
    @Then("^Message displayed Login Successfully$")
    public void message_displayed_login_successfully() throws Throwable {
        System.out.println("Successfully logged in");
        Thread.sleep(2000);
        driver.close();
    }
}
