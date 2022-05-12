package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.P01_register;

public class D01_registerStepDef {
    P01_register register=new P01_register();
    @Given("user navigate to home page and click register Tab")
    public void registerTab()
    {
          Hooks.driver.findElement(register.registerTab()).click();

        }
    @And("user enter valid data to Your Personal Details section")
    public void enterPersonalData()
    {

        Hooks.driver.findElement(register.gender()).click();
        Hooks.driver.findElement(register.firstName ()).sendKeys("Basma");
        Hooks.driver.findElement(register.lastName()).sendKeys("Mohamed");
        Hooks.driver.findElement(register.date("DateOfBirthDay","20")).click();
        Hooks.driver.findElement(register.date("DateOfBirthMonth","6")).click();
        Hooks.driver.findElement(register.date("DateOfBirthYear","2001")).click();
        Hooks.driver.findElement(register.email()).sendKeys("automation1@gmail.com");

    }
    @And("user enter valid data to Company Details section")
    public void enterCompanyData()
    {
        Hooks.driver.findElement(register.company()).sendKeys("Automation Company");

    }
    @And("user enter valid data to Your Password section")
    public void enterPasswordData()
    {
        Hooks.driver.findElement(register.password()).sendKeys("PASSWODR2022");
        Hooks.driver.findElement(register.confirmPassword()).sendKeys("PASSWODR2022");
    }
    @And("user click register button")
    public void registerButton()
    {
        Hooks.driver.findElement(register.registerButton()).click();

    }
   @And("Registartion done successfully")
    public void Registartion_done()
   {
       String color = Hooks.driver. findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color");
       SoftAssert soft = new SoftAssert();
       soft.assertTrue(Hooks.driver. findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
       soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
       soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
       soft.assertEquals(color,"rgba(76, 177, 124, 1)");
       soft.assertAll();
    }

}
