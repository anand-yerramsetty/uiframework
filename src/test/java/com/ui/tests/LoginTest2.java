package com.ui.tests;

import com.ui.pages.HomePage;
import static com.constants.Browser.*;

public class LoginTest2 {

    public static void main(String[] args){

        HomePage homePage=new HomePage(CHROME);
        String username=homePage.goToLogInPage().doLoginWith("megopa5539@arugy.com","password").getUserName();
        System.out.println("Username :"+username);

    }
}
