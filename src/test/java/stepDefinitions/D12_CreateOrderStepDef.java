package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P05_shoppingCart;

public class D12_CreateOrderStepDef {
    P02_login login=new P02_login();
    P05_shoppingCart cart=new P05_shoppingCart();
    @Given("user log in with valid email")
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
    @And("user click on Add items to Shopping cart")
    public void selectItems() throws InterruptedException
    {
        cart.Add_item(3).click();Thread.sleep(500);
        cart.Add_item(2).click();
        cart.AddItemFromOwnPage().click();


    }
    @And("navigate to shopping cart")
    public void shopping_cart()

    {
        cart.shoppingCartTab().click();
    }
    @And("agree with the terms of service")
    public void agreeWithTerms()
    {

      cart.termsofservice().click();

    }
    @When("user click checkout  button")
    public void checkoutButton()
    {

      cart.checkout().click();

    }
    @And("user enter valid data to Billing address section")
    public void Billing_address()  {

        cart.Country().click();
        cart.City().sendKeys("cairo");
        cart.Address("BillingNewAddress_Address1").sendKeys("cairo");
        cart.Address("BillingNewAddress_Address2").sendKeys("cairo");
        cart.postal_code().sendKeys("11549");
        cart.Phone_number().sendKeys("0123456789");
        cart.Fax_number().sendKeys("1111");
        cart.Continue_button().click();

    }
   @And("user enter valid data to Shipping method section")
    public void Shipping_method()
    {

        cart.ShippingMethod().click();
        cart.Continue_button1().click();

    }
    @And("user enter valid data to Payment method section")
    public void Payment_method()
    {

        cart.PaymentMethod().click();
        cart.Continue_button2().click();

    }
    @And("Payment information section")
    public void Payment_information()
    {

        cart.Continue_button3().click();

    }
    @Then("user Confirm order")
    public void confirm_order()
    {

        cart.Confirm().click();

    }
    @And("the order done successfully")
    public void order_done() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
       Thread.sleep(1000);
        soft.assertTrue(Hooks.driver.findElement(By.tagName("strong")).getText().contains("Your order has been successfully processed!"));
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/checkout/completed"),true);
        soft.assertAll();
        cart.Continue_button4().click();

    }


}
