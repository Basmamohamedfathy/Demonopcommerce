package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P03_homePage;

public class D07_compareListStepDef {
    P03_homePage home=new P03_homePage();
    P02_login login=new P02_login();
    @Given("user log in with valid data")
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
    @And("user click on Add to compare list")
    public void AddToComparelist() throws InterruptedException {
        home.Add_to_comparelist(1).click();Thread.sleep(500);
        home.Add_to_comparelist(2).click();Thread.sleep(500);
        home.Add_to_comparelist(3).click();Thread.sleep(500);
        home.Add_to_comparelist(4).click();Thread.sleep(500);
    }
    @And("Add to compare list done successfully")
    public void Add_to_compare_done() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.findElement(By.className("content")).isDisplayed());
        soft.assertTrue(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your product comparison"));
        soft.assertAll();
        home.compareproducts().click();
        Assert.assertTrue(Hooks.driver.findElement(By.className("compare-products-table")).isDisplayed());
    }
}
