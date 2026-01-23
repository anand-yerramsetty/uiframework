package com.ui.pages;

import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BrowserUtility {

    private static final By EMAIL_TEXT_BOX_LOCATOR =By.xpath("//input[@id='email']");
    private static final By PASSWORD_TEXTBOX_LOCATOR =By.id("passwd");
    private static final By SUBMIT_BUTTON_LOCATOR =By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage doLoginWith(String email,String password){
        enterText(EMAIL_TEXT_BOX_LOCATOR,email);
        enterText(PASSWORD_TEXTBOX_LOCATOR,password);
        clickOnElement(SUBMIT_BUTTON_LOCATOR);

        MyAccountPage myAccountPage=new MyAccountPage(getDriver());
        return myAccountPage;

    }

}
