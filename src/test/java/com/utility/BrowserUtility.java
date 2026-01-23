package com.utility;

import com.constants.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BrowserUtility {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public BrowserUtility(WebDriver driver) {
        this.driver = driver;
    }

    public BrowserUtility(String browserName) {
     if(browserName.equalsIgnoreCase("chrome")) {
         driver = new ChromeDriver();
     } else if (browserName.equalsIgnoreCase("edge")) {
         driver= new EdgeDriver();
     }
     else {
    System.err.println("Invalid Browser Name ... Please select Chrome or Edge");
     }
    }

    public BrowserUtility(Browser browserName) {
        if(browserName==Browser.CHROME) {
            driver = new ChromeDriver();
        } else if (browserName==Browser.EDGE) {
            driver= new EdgeDriver();
        }else if (browserName==Browser.FIREFOX) {
            driver= new FirefoxDriver();
        }
    }

    public void goToWebsite(String url){
        driver.get(url);
    }

    public void maximizeWindow(){
    driver.manage().window().maximize();
    }

    public void clickOnElement(By webelement){
        driver.findElement(webelement).click();
    }

    public void enterText (By webelement, String text) {
        driver.findElement(webelement).sendKeys(text);
    }

    public String getVisibleText(By WebElement){
        WebElement element=driver.findElement(WebElement);
        return element.getText();
    }
}
