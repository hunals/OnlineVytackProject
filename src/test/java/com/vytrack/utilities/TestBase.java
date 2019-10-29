package com.vytrack.utilities;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.ConfigurationReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.TestRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Actions action;

    @BeforeMethod
    public void setup(){
        driver= Driver.getDriver();
        action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @AfterMethod
    public void teardown(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/screenshots/" + LocalDateTime.now() +"_"+ result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Driver.closeDriver();

    }

}
