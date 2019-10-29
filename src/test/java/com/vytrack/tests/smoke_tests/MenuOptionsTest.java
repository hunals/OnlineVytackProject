package com.vytrack.tests.smoke_tests;

import com.vytrack.pages.fleet.FleetPage;
import com.vytrack.pages.login_navigation.LoginPage;
import com.vytrack.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;

public class MenuOptionsTest extends TestBase {

//    String fleeetTab = "//*[@id=\"main-menu\"]/ul/li[1]/a/span";
//    String vehiclesModule = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span";


    @Test
    public void vehiclesModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("driverusername");
        String password = ConfigurationReader.getProperty("driverpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        FleetPage.navigateToModule("Fleet", "Vehicles");

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String expectedTitle = "Car - Entities - System - Car - Entities – System";
        String actualTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String vehiclesPageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
        System.out.println(vehiclesPageName);

    }

    @Test
    public void accountsModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("driverusername");
        String password = ConfigurationReader.getProperty("driverpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Customers", "Accounts");

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Accounts - Customers";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String accountsPageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
        System.out.println(accountsPageName);
    }


    @Test
    public void contactsModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("driverusername");
        String password = ConfigurationReader.getProperty("driverpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        FleetPage.navigateToModule("Customers", "Contacts");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Contacts - Customers";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String contactsPageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(contactsPageName);
    }

    @Test
    public void calendarEventsModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("driverusername");
        String password = ConfigurationReader.getProperty("driverpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        FleetPage.navigateToModule("Activities", "Calendar Events");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Calendar Events - Activities";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String calendarEventsPageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(calendarEventsPageName);
    }

    @Test
    public void dashboardModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Dashboards", "Dashboard");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Dashboard - Dashboards";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(expectedTitle, actualTitle );
        String dashboardPageName = "//h1[@class='oro-subtitle']";

        System.out.println(VYTrackUtils.getPageSubTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(dashboardPageName);
    }

    @Test
    public void vehicles2ModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Fleet", "Vehicles");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Car - Entities - System - Car - Entities – System";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String vehicles2PageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(vehicles2PageName);
    }

    @Test
    public void accounts2ModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Customers", "Accounts");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Accounts - Customers";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String accounts2PageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(accounts2PageName);
    }

    @Test
    public void contactss2ModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Customers", "Contacts");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Contacts - Customers";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String contacts2PageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(contacts2PageName);
    }

    @Test
    public void opportunutiesModuleTest(){
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Sales", "Opportunities");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Open Opportunities - Opportunities - Sales";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String opportunutiesPageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(opportunutiesPageName);
    }

    @Test
    public void callsModuleTest() {
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Activities", "Calls");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "All Calls - Activities";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String callsPageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(callsPageName);
    }

    @Test
    public void calendarEvents2ModuleTest() {
        LoginPage loginPage = new LoginPage();
        FleetPage fleetPage = new FleetPage();
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        loginPage.login(username, password);

        VYTrackUtils.waitUntilLoaderScreenDisappear();
        VYTrackUtils.navigateToModule("Activities", "Calendar Events");
        VYTrackUtils.waitUntilLoaderScreenDisappear();
        String actualTitle = "Calendar Events - Activities";
        String expectedTitle = driver.findElement(By.xpath("/html/head/title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        String calendarEvents2PageName = "//h1[@class='oro-subtitle']";

        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
        System.out.println(calendarEvents2PageName);
    }

}
