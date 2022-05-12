package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P03_homePage;


public class D09_CategoriesStepDef {
    P03_homePage home=new P03_homePage();
    P02_login login=new P02_login();
    @Given("user login with valid email")
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
    @And("select Category")
    public void selectCategory() {

    home.selectCategory().click();
    }
    @And("open sub-Category")
    public void subCategory() {

        home.subcategoryTab().click();
    }
    @And("open page done successfully")
    public void openSubCategory()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.findElement(By.linkText("Shoes")).isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/shoes"),true);
        soft.assertAll();

    }
}
