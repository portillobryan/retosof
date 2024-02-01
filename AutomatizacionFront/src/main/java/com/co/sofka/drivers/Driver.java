package com.co.sofka.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;

public class Driver {
    private static WebDriver driver;

    public Driver() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","--disable-infobars",
                "-enable-print-preview", "--kiosk-printing", "--incognito"
        );
        driver = new ChromeDriver(options);

    }

    public static WebDriver inThePage(String url) {
        driver.get(url);
        return driver;
    }

    public static WebDriver inTheStage() {
        return driver;
    }
}
