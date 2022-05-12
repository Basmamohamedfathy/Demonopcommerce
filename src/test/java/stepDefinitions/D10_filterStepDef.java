package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P03_homePage;

public class D10_filterStepDef {
    P03_homePage home=new P03_homePage();
    P02_login login=new P02_login();
    @Given("user log in with valid email and password")
    public void login() {
        login.loginTab().click();
        login.emailEle().sendKeys("automation1@gmail.com");
        login.passwordEle().sendKeys("PASSWODR2022");
        login.loginButton().click();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(login.accountTab().isDisplayed(),true);
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),true);
        soft.assertAll();
    }
    @And("select specific category like Apparel > Shoes")
    public void select_specific_category()  {
        home.selectCategory().click();
        home.subcategoryTab().click();

    }
    @And("select color")
    public void select_color() {
      home.selectColor().click();
    }
    @And("select color done successfully")
    public void select_color_done() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15"),true);
    }
}
