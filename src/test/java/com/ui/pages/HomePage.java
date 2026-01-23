package com.ui.pages;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import static com.utility.PropertiesUtil.*;

import com.utility.JSONUtility;
import org.openqa.selenium.By;

public class HomePage extends BrowserUtility {

   private static final By SIGN_IN_LINK_LOCATOR =By.xpath("//a[contains(text(),'Sign in')]");

    public HomePage(Browser browserName) {
        super(browserName);
//        goToWebsite("http://www.automationpractice.pl/index.php");
//        goToWebsite(readProperty(QA,"URL"));
        goToWebsite(JSONUtility.readJSON(QA));
    }

    public LoginPage goToLogInPage(){
        clickOnElement(SIGN_IN_LINK_LOCATOR);
        LoginPage loginPage=new LoginPage(getDriver());
        return loginPage;
    }

}
