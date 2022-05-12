package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P03_homePage;

public class D04_searchStepDef {
P03_homePage home=new P03_homePage();
P02_login login=new P02_login();
@Given("user login successfully")
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
    @And("user enter any product name in search field")
    public void search()
    {

        home.searchEle().sendKeys("htc");

    }
    @And("user click search button")
    public void searchButton()
    {

        home.searchButton().click();

    }
    @And("search done successfully")
    public void search_done()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(home.search_page().isDisplayed(),true);
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=htc"),true);
        soft.assertAll();


    }
}
