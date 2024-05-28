package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    public WebElement getElement(By locator){
        return browser.findElement(locator);
    }

    public void writeOnElement(By locator, String text ){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public Boolean displayStatus(By locator){
        return getElement(locator).isDisplayed();
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }
}
