package com.qacart.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static Properties props = new Properties();

    public Base() {
        try {
            File file = new File("src/main/java/com/qacart/properties/config.properties");
            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void launchBrowser() {

        if (props.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (props.getProperty("browser").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new Error ("browser is not supported");
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(600000, TimeUnit.MILLISECONDS); // ??
        driver.manage().timeouts().implicitlyWait(600000, TimeUnit.MILLISECONDS);
        driver.get(props.getProperty("url"));
    }
}