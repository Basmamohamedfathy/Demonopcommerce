package pages;
import org.openqa.selenium.By;
public class P01_register {
    public By registerTab ()
    {
      return By.className("ico-register");
    }
    public By firstName ()
    {
        return By.name("FirstName");
    }
    public By lastName ()
    {
        return By.name("LastName");
    }
    public By date (String name,String value)
    {
        By date=By.cssSelector("select[name=\""+name+"\"] > option[value=\""+value+"\"]");
        return date;
    }
    public By gender ()
    {
        return By.id("gender-female");
    }
    public By email ()
    {
        return By.name("Email");
    }
    public By company ()
    {
        return By.name("Company");
    }
    public By password ()
    {
        return By.name("Password");
    }
    public By confirmPassword ()
    {
        return By.name("ConfirmPassword");
    }
    public By registerButton ()
    {
        return By.name("register-button");
    }

}
