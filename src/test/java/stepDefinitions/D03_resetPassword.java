package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_resetPassword {
    @Given("navigates to home and click log in Tab")
    public void loginTab() {
        Hooks.driver.findElement(By.className("ico-login")).click();
    }
    @And("user click Forgot password Tab")
    public void forgetTab() {
        Hooks.driver.findElement(By.linkText("Forgot password?")).click();
    }
    @And("user fills Your email address field")
    public void enterEmailAddress()
    {
        Hooks.driver.findElement(By.name("Email")).sendKeys("automation1@gmail.com");

    }
    @And("user click Recover button")
    public void clickRecover() {
        Hooks.driver.findElement(By.className("password-recovery-button")).click();
    }
    @And("success message is displayed")
    public void display_msg()
    {
        Assert.assertTrue(Hooks.driver.findElement(By.className("content")).isDisplayed());
        Assert.assertTrue(Hooks.driver.findElement(By.className("content")).getText().contains("Email with instructions has been sent to you."));


    }
}

