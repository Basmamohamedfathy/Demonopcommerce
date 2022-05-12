package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P03_homePage {
    public WebElement currencies_list ()
    {

        return Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"] > option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }
    public WebElement searchEle ()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton ()
    {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }
    public WebElement search_page ()
    {

        return Hooks.driver.findElement(By.className("page-body"));
    }

    public WebElement Add_to_comparelist (int itemNum)
    {

        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])["+itemNum+"]"));
    }
    public WebElement compareproducts ()
    {

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }
    public WebElement selectCategory ()
    {

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement subcategoryTab ()
    {

        return Hooks.driver.findElement(By.cssSelector("img[alt=\"Picture for category Shoes\"]"));
    }
    public WebElement selectColor ()
    {

        return Hooks.driver.findElement(By.cssSelector("input[data-option-id=\"15\"]"));
    }


}

