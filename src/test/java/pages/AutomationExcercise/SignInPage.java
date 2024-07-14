package pages.AutomationExcercise;

import org.openqa.selenium.By;

public class SignInPage extends BasePage {
    public String password ="01748911159";
    public String phoneNumber = "01748911159";
    public String Email = "shanto2.qtec@gmail.com";
    public By emailInputBox = By.xpath("//input[@data-qa='login-email']");
    public By passwordInputBox = By.xpath("//input[@placeholder='Password']");
    public By logInButton = By.xpath("//button[normalize-space()='Login']");
    public By ErrorMsg = By.xpath("//input[@name='password']/following-sibling::p");

}