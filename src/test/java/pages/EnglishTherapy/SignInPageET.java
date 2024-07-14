package pages.EnglishTherapy;

import org.openqa.selenium.By;
import pages.AutomationExcercise.BasePage;

public class SignInPageET extends BasePageET {
    public String password ="12345678";
    public String phoneNumber = "01748911159";
    public String Email = "admin@gmail.com";
    public By emailInputBox = By.xpath("//input[@id='email']");
    public By passwordInputBox = By.xpath("//input[@id='password']");
    public By logInButton = By.xpath("//button[@id='submit']");
    public By ErrorMsg = By.xpath("//div[normalize-space()='Please enter a valid email address.']");

}