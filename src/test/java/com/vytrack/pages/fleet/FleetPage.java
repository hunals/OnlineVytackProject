package com.vytrack.pages.fleet;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetPage {

    static WebDriver driver= Driver.getDriver();




    public void fleetPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void navigateToModule(String tab, String module){
        String tabLocator = "//span[contains(text(),'"+tab+"') and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[(text()='"+module+"') and contains(@class, 'title title-level-2')]";
        SeleniumUtils.clickWithWait(Driver.getDriver(), By.xpath(tabLocator), 5);
        SeleniumUtils.waitPlease(1);
        Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
//        SeleniumUtils.clickWithWait(driver, By.xpath(moduleLocator), 5);
//        SeleniumUtils.waitPlease(2);
    }

}
