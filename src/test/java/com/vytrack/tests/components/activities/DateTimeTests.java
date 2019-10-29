package com.vytrack.tests.components.activities;

import com.vytrack.pages.activities.DateTimePage;
import com.vytrack.pages.login_navigation.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.SeleniumUtils;
import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.VYTrackUtils;
import org.testng.annotations.Test;

public class DateTimeTests extends TestBase {


    @Test
    public void test1(){
        LoginPage loginPage = new LoginPage();
        DateTimePage dateTimePage = new DateTimePage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Activities", "Calendar Events");
        VYTrackUtils.waitUntilLoaderScreenDisappear();

        dateTimePage.createCalendarEventBtn.click();
        dateTimePage.startDateLocator.sendKeys("Nov 10, 2019");
        SeleniumUtils.waitPlease(3);
        dateTimePage.endDateLocator.sendKeys("Oct 29, 2019");
        SeleniumUtils.waitPlease(3);

    }

    @Test
    public void test2() {
        LoginPage loginPage = new LoginPage();
        DateTimePage dateTimePage = new DateTimePage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Activities", "Calendar Events");
        VYTrackUtils.waitUntilLoaderScreenDisappear();

        dateTimePage.createCalendarEventBtn.click();
        dateTimePage.startDateLocator.sendKeys("Nov 10, 2019");
        dateTimePage.startTimeLocator.sendKeys("12:00 PM");
        SeleniumUtils.waitPlease(3);

    }

    @Test
    public void test3() {
        LoginPage loginPage = new LoginPage();
        DateTimePage dateTimePage = new DateTimePage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Activities", "Calendar Events");
        VYTrackUtils.waitUntilLoaderScreenDisappear();

        dateTimePage.createCalendarEventBtn.click();
        dateTimePage.startDateLocator.sendKeys("Nov 10, 2019");
        dateTimePage.startTimeLocator.sendKeys("11:30 PM");
        SeleniumUtils.waitPlease(3);

    }


}
