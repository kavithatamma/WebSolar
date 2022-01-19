package com.gic.solarmgt.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.gic.solarmgt.functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddProductTestSteps extends CommonFunctions {

    @When("^I click on Products link$")
    public void i_click_on_Products_link()  {
        driver.findElement(By.xpath("/html/body/div/aside/div/div[4]/div/div/nav/ul/li[5]/a")).click();

    }

    @When("^I click on Add Product option$")
    public void i_click_on_Add_Product_option()  {
        driver.findElement(By.xpath("/html/body/div/aside/div/div[4]/div/div/nav/ul/li[5]/ul/li[1]/a/p")).click();

    }

    @When("^Product Add page should be loaded$")
    public void product_Add_page_should_be_loaded()  {
        String actualProdPageTitle = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div[1]/h1")).getText();
        String expPageTitle = "Product Add";
        Assert.assertEquals(expPageTitle,actualProdPageTitle);


    }

    /*@When("^I select category option from dropdown menu as \"(.*?)\"$")
    public void i_select_category_option_from_dropdown_menu_as(String arg1)  {
        Select drpCategory = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section/div/div[2]/form/div[1]/div[1]/div[1]/select")));
        drpCategory.selectByVisibleText("Test Category 1");

    }*/

    @When("^I select category option from dropdown menu$")
    public void i_select_category_option_from_dropdown_menu()  {
        Select drpCategory = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section/div/div[2]/form/div[1]/div[1]/div[1]/select")));
        drpCategory.selectByVisibleText("Test Category 1");
    }

    @When("^I enter Product Sku in the Product Sku field as\"(.*?)\"$")
    public void i_enter_Product_Sku_in_the_Product_Sku_field_as(String prodSku)  {
        driver.findElement(By.id("sku")).sendKeys(prodSku);

    }

    @When("^I enter Product Name in the Product Name field as \"(.*?)\"$")
    public void i_enter_Product_Name_in_the_Product_Name_field_as(String prodName)  {
        driver.findElement(By.id("name")).sendKeys(prodName);

    }

    @When("^I enter Product description in the Product description field as \"(.*?)\"$")
    public void i_enter_Product_description_in_the_Product_description_field_as(String prodDesc)  {
 driver.findElement(By.name("description")).sendKeys(prodDesc);
    }

    @When("^I select Unit value from Unit dropdown menu$")
    public void i_select_Unit_value_from_Unit_dropdown_menu()  {
        Select drpUnit = new Select(driver.findElement(By.name("unit")));
        drpUnit.selectByVisibleText("Watt");
    }

    @When("^I enter Unit Price in the Unit Price field as \"(.*?)\"$")
    public void i_enter_Unit_Price_in_the_Unit_Price_field_as(String varUnitPrice)  {
        driver.findElement(By.id("price")).sendKeys(varUnitPrice);

    }

    @When("^I enter installation charge in the installation charge field as \"(.*?)\"$")
    public void i_enter_installation_charge_in_the_installation_charge_field_as(String instlCharges)  {
        driver.findElement(By.id("installation_charge")).sendKeys(instlCharges);

    }

    @When("^I enter Product Warranty Details in the Product Warranty Details field as \"(.*?)\"$")
    public void i_enter_Product_Warranty_Details_in_the_Product_Warranty_Details_field_as(String prodWarDet)  {
        driver.findElement(By.name("warranty_details")).sendKeys(prodWarDet);

    }

    @When("^I select Product Image in the Product Image field$")
    public void i_select_Product_Image_in_the_Product_Image_field()  {
       // WebElement chooseFile = driver.findElement(By.id("custom-input"));
        //chooseFile.sendKeys("/Users/ankita/Downloads/edureka.png");
        WebElement browse = driver.findElement(By.id("product_image"));
        browse.sendKeys("C:\\Kavi\\ERP\\SolarCrmProject\\Images\\solar-panel-1.jpg");

    }

    @When("^I click on Create Product button$")
    public void i_click_on_Create_Product_button()  {
        driver.findElement(By.xpath("/html/body/div/div[1]/section/div/div[2]/form/div[2]/div/input")).click();

    }

    @Then("^Product should be added successfully$")
    public void product_should_be_added_successfully()  {
        String actualProdMsg = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]")).getText();
        String expProdMsg = "Product added successfully";
        Assert.assertEquals(expProdMsg,actualProdMsg);

    }

}
