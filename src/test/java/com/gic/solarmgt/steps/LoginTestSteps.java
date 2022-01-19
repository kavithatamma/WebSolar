package com.gic.solarmgt.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.gic.solarmgt.functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginTestSteps extends CommonFunctions {
    //private WebDriver driver;
    @Given("^I am on the Home page \"(.*?)\"$")
    public void i_am_on_the_Home_page(String url){
        //WebDriverManager.chromedriver().setup();
         //driver =new ChromeDriver();
        driver.get(url);

    }

    @When("^I enter user name in the user name field as \"(.*?)\"$")
    public void i_enter_user_name_in_the_user_name_field_as(String email)  {
        driver.findElement(By.id("email")).sendKeys(email);

    }

    @When("^I enter password in the password field as \"(.*?)\"$")
    public void i_enter_password_in_the_password_field_as(String password)  {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("^I click on sign in button$")
    public void i_click_on_sign_in_button(){
        driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/div[2]/button")).click();


    }

    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully()  {
        String actual=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/ol/li")).getText();
        Assert.assertEquals("Dashboard",actual);
        //driver.close();
    }

}
