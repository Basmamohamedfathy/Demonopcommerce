package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P04_wishList {
    public WebElement Add_item (int itemNum)
    {

        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])["+itemNum+"]"));
    }
    public WebElement AddItemFromOwnPage ()
    {

        return Hooks.driver.findElement(By.id("add-to-wishlist-button-4"));

    }
    public WebElement wishlistTab ()
    {

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]"));
    }

}
