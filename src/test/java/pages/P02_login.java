package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_login {
    public WebElement loginTab ()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement emailEle ()
    {
        return Hooks.driver.findElement(By.name("Email"));
    }
    public WebElement passwordEle ()
    {
        return Hooks.driver.findElement(By.name("Password"));
    }
    public WebElement loginButton ()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] > button[type=\"submit\"]"));
    }
    public WebElement accountTab ()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
}
