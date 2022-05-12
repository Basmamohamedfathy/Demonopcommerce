package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import pages.P02_login;


public class D02_loginStepDef {
    P02_login login=new P02_login();
    @Given("navigate to home page and click login Tab")
    public void loginTab() {

        login.loginTab().click();

    }
    @And("user enter valid data to Returning Customer section")
    public void enterCustomerData()
    {

        login.emailEle().sendKeys("automation1@gmail.com");
        login.passwordEle().sendKeys("PASSWODR2022");

    }
    @And("user click log in  button")
    public void loginButton() {
        login.loginButton().click();

    }
    @And("going to home page done successfully")
    public void home_page()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(login.accountTab().isDisplayed(),true);
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),true);
        soft.assertAll();

    }

}
