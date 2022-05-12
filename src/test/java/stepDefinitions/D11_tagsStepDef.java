package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P04_wishList;

public class D11_tagsStepDef {
    P02_login login=new P02_login();
    @Given("user log and navigate to home page")
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
    @And("navigate to All product tags")
    public void All_product_tags() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/producttag/all");

    }
    @And("user select any tag like apparel")
    public void select_tag() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel-2\"] ")).click();


    }
    @And("Products tagged with 'apparel' appears")
    public void select_done() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/apparel-2"),true);
        Assert.assertTrue(Hooks.driver.findElement(By.tagName("h1")).getText().contains("Products tagged with 'apparel'"));
        soft.assertAll();

    }


}


