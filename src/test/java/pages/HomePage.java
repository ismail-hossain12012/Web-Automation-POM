package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url = "https://gozayaan.com/";

   public By signInButton = By.xpath("//button[normalize-space()='Sign In']");
   public By userIcon = By.id("__BVID__35__BV_toggle_");
}
