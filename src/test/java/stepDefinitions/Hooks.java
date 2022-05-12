package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static String Chromepath=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
    public static WebDriver driver;
    @Before
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver",Chromepath);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com");
    }
    @After
    public static void quitBrowser()
    {
        driver.quit();
    }
}
