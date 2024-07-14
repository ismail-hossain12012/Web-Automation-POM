package pages.EnglishTherapy;

import org.openqa.selenium.By;
import pages.AutomationExcercise.BasePage;

public class HomePageET extends BasePageET {
    public String url = "https://panel.englishtherapy.com.bd/login";

    public By signInButtonET = By.xpath("//a[normalize-space()='Signup / Login']");
    public By logoutButtonET = By.xpath("//a[normalize-space()='Logout']");

}

