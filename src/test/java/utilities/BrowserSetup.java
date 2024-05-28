package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BrowserSetup {
    public WebDriver browser;
    @BeforeSuite
    public void startBrowser(){
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterSuite
    public void quitBrowser(){
        browser.quit();
    }

}