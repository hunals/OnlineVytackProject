package com.vytrack.tests.components.login_navigation;

import com.vytrack.pages.login_navigation.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.SeleniumUtils;
import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.VYTrackUtils;
import org.testng.annotations.Test;

public class PageAccessTests extends TestBase {


    @Test
    public void vehicleContractsTest(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.clickRememberMe();
        loginPage.login(username, password);
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Fleet", "Vehicle Contracts");
        VYTrackUtils.waitUntilLoaderScreenDisappear();

    }


    @Test
    public void vehicleContracts2Test(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.getProperty("salesmanagerusername");
        String password = ConfigurationReader.getProperty("salesmanagerpassword");
        loginPage.clickRememberMe();
        loginPage.login(username, password);
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Fleet", "Vehicle Contracts");
        SeleniumUtils.waitPlease(2);

    }

    @Test
    public void vehicleContracts3Test(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.getProperty("driverusername");
        String password = ConfigurationReader.getProperty("driverpassword");
        loginPage.clickRememberMe();
        loginPage.login(username, password);
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Fleet", "Vehicle Contracts");
        SeleniumUtils.waitPlease(2);

    }

}
