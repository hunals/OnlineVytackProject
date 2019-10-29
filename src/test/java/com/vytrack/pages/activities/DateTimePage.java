package com.vytrack.pages.activities;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateTimePage {

    static WebDriver driver = Driver.getDriver();

    @FindBy(css= "[title='Create Calendar event']")
    public WebElement createCalendarEventBtn;

    @FindBy(css= "[id^='date_selector_oro_calendar_event_form_start']")
    public WebElement startDateLocator;

    @FindBy(css="[id^='date_selector_oro_calendar_event_form_end']")
    public WebElement endDateLocator;

    @FindBy(css= "[id^='time_selector_oro_calendar_event_form_start']")
    public WebElement startTimeLocator;

    @FindBy(css= "[id^='time_selector_oro_calendar_event_form_end']")
    public WebElement endTimeLocator;

    public DateTimePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
