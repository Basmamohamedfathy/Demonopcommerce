package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P05_shoppingCart {
    public WebElement Add_item (int itemNum)
    {

        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])["+itemNum+"]"));
    }
    public WebElement AddItemFromOwnPage ()
    {

        return Hooks.driver.findElement(By.id("add-to-cart-button-4"));

    }
    public WebElement shoppingCartTab ()
    {

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]"));
    }
    public WebElement termsofservice ()
    {

        return Hooks.driver.findElement(By.id("termsofservice"));
    }
    public WebElement checkout ()
    {

        return Hooks.driver.findElement(By.id("checkout"));
    }
    public WebElement Country ()
    {

        return Hooks.driver.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"] > option[value=\"123\"]"));
    }
    public WebElement City ()
    {

        return Hooks.driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement Address (String id)
    {

        return Hooks.driver.findElement(By.id(id));
    }
    public WebElement postal_code ()
    {

        return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement Phone_number ()
    {

        return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement Fax_number ()
    {

        return Hooks.driver.findElement(By.id("BillingNewAddress_FaxNumber"));
    }
    public WebElement Continue_button ()
    {

        return Hooks.driver.findElement(By.className("new-address-next-step-button"));
    }
    public WebElement ShippingMethod ()
    {

        return Hooks.driver.findElement(By.id("shippingoption_0"));
    }
    public WebElement PaymentMethod ()
    {

        return Hooks.driver.findElement(By.id("paymentmethod_0"));
    }
    public WebElement Confirm ()
    {

        return Hooks.driver.findElement(By.className("confirm-order-next-step-button"));
    }
    public WebElement Continue_button1 ()
    {

        return Hooks.driver.findElement(By.className("shipping-method-next-step-button"));
    }
    public WebElement Continue_button2 ()
    {

        return Hooks.driver.findElement(By.className("payment-method-next-step-button"));
    }
    public WebElement Continue_button3 ()
    {

        return Hooks.driver.findElement(By.className("payment-info-next-step-button"));
    }
    public WebElement Continue_button4()
    {

        return Hooks.driver.findElement(By.className("order-completed-continue-button"));
    }



}
