package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P02_login;

import pages.P04_wishList;

public class D06_WishlistStepDef {
    P02_login login=new P02_login();
    P04_wishList wish =new P04_wishList();
    @Given("user login with valid data")
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
    @And("user click on Add to Wishlist")
    public void Add_to_Wishlist() throws InterruptedException {
     wish.Add_item(3).click();Thread.sleep(500);
     wish.Add_item(2).click();
     wish.AddItemFromOwnPage().click();

    }
    @And("success message is appeared")
    public void success_message() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.findElement(By.className("content")).isDisplayed());
        soft.assertTrue(Hooks.driver.findElement(By.className("content")).getText().contains("The product has been added to your wishlist"));
        soft.assertAll();


    }
    @And("Add done successfully")
    public void Add_to_Wishlist_done()
    {
        wish.wishlistTab().click();
        Assert.assertTrue(Hooks.driver.findElement(By.className("wishlist-content")).isDisplayed());

    }


}
