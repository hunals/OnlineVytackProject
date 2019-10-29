package com.vytrack.tests.components.activities;

import com.vytrack.pages.activities.CalendarEventsPage;
import com.vytrack.pages.login_navigation.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.SeleniumUtils;
import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.VYTrackUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaledarEventsTest extends TestBase {

    @Test
    public void verifyTitleColumn(){
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarPage = new CalendarEventsPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Activities", "Calendar Events");

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        calendarPage.selectGridSetting("Title", false);
        SeleniumUtils.waitPlease(3);

        Assert.assertFalse(calendarPage.verifyHeaderExists("Title"), "Title column name still visible.");

        calendarPage.gridSettingsElement.click();
        calendarPage.selectGridSetting("Title", true);

        Assert.assertTrue(calendarPage.verifyHeaderExists("Title"), "Title column is not visible.");

    }
}
