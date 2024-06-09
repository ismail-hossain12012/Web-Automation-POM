package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{
    public String password ="@Shanto12012#";
    public String phoneNumber ="01748911159";
    public String Email ="shanto2.qtec@gmail.com";

    public By emailInputBox = By.id("//input[@data-qa='login-email']");
    public By passwordInputBox = By.id("//input[@placeholder='Password']");

    public By logInButton = By.id("//button[normalize-space()='Login']");
    public By ErrorMsg = By.id("//input[@name='password']/following-sibling::p");
}
