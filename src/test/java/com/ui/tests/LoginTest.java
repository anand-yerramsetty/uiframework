package com.ui.tests;

import com.ui.pages.HomePage;
import static org.testng.Assert.*;

import com.ui.pojo.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.constants.Browser.*;

public class LoginTest {

    HomePage homePage;

    @BeforeMethod(description="load the homepage of the website")
    public void setup(){
        homePage=new HomePage(CHROME);
    }

    @Test(description= "verifies the valid user is able to login", groups={"e2e","sanity"}, dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
    public void loginTest(User user){
//        assertEquals(homePage.goToLogInPage().doLoginWith("megopa5539@arugy.com","password").getUserName(),"Anand yerram");
        assertEquals(homePage.goToLogInPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),"Anand yerram");
    }

    @Test(description= "verifies the valid user is able to login", groups={"e2e","sanity"}, dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginCSVDataProviderdealst")
    public void loginCSVTest(User user){
        assertEquals(homePage.goToLogInPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),"Anand yerram");
    }


    @Test(description= "verifies the valid user is able to login", groups={"e2e","sanity"}, dataProviderClass = com.ui.dataProviders.LoginDataProvider.class, dataProvider = "LoginTestExcelDataProvider")
    public void loginExcelTest(User user){
        assertEquals(homePage.goToLogInPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),"Anand yerram");
    }

}