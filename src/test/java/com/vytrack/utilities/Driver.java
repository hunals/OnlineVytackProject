package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver driver;

    private Driver(){

    }

    public static WebDriver getDriver(){
        if(driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hunal\\OneDrive\\Belgeler\\selenium dependencies\\drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "C:\\Users\\hunal\\OneDrive\\Belgeler\\selenium dependencies\\drivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Illegal browser name!");
            }
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver = null;
        }
    }

}

//    public static WebDriver getDriver(){
//    if(driver == null) {
//        if (ConfigurationReader.getProperty("browser").equals("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\hunal\\OneDrive\\Belgeler\\selenium dependencies\\drivers\\geckodriver.exe");
//            driver = new FirefoxDriver();
//        }else if(ConfigurationReader.getProperty("browser").equals("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hunal\\OneDrive\\Belgeler\\selenium dependencies\\drivers\\chromedriver.exe");
//            driver = new ChromeDriver();
//        }else{
//            throw new RuntimeException("Wrong browser name!");
//        }
//    }
//    return driver;
//}
//}
