package com.vytrack.tests.components.login_navigation;

import com.vytrack.pages.login_navigation.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.SeleniumUtils;
import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.VYTrackUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {



    @Test
    public void loginTest1(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.clickRememberMe();
        loginPage.login(username, password);
        Assert.assertEquals(VYTrackUtils.getPageSubTitle(), "Dashboard");

    }


    @Test
    public void loginTest2(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.getProperty("salesmanagerusername");
        String password = ConfigurationReader.getProperty("salesmanagerpassword");
        loginPage.clickRememberMe();
        loginPage.login(username, password);
        Assert.assertEquals(VYTrackUtils.getPageSubTitle(), "Dashboard");

    }

    @Test
    public void loginTest3(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.getProperty("driverusername");
        String password = ConfigurationReader.getProperty("driverpassword");
        loginPage.clickRememberMe();
        loginPage.login(username, password);
        Assert.assertEquals(VYTrackUtils.getPageSubTitle(), "Quick Launchpad");

    }
    @Test
    public void negativeLoginTest1(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("user199", "wrongpassword");
        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid user name or password.");
        SeleniumUtils.waitPlease(2);
    }

}
