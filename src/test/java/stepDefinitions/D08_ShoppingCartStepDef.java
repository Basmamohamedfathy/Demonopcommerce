package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P03_homePage;
import pages.P05_shoppingCart;

public class D08_ShoppingCartStepDef {
    P05_shoppingCart cart=new P05_shoppingCart();
    P02_login login=new P02_login();
    @Given("user login with valid email and password")
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
    @And("user click on Add to Shopping cart")
    public void AddToShoppingCart() throws InterruptedException {
        cart.Add_item(3).click();Thread.sleep(500);
        cart.Add_item(2).click();
        cart.AddItemFromOwnPage().click();

    }
    @And("Add toShopping cart done successfully")
    public void Add_to_Shopping_cart() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.findElement(By.className("content")).isDisplayed());
        soft.assertTrue(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your shopping cart"));
        soft.assertAll();
        cart.shoppingCartTab().click();
        Assert.assertTrue(Hooks.driver.findElement(By.className("cart")).isDisplayed());
    }
}
