package com.actitimeautomation.sample;

import com.actitimeautomation.pages.BaseClass;
import com.actitimeautomation.pages.propertiesHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;

public class WindowHandlingExampleusingTestNG  extends BaseClass {
    WebDriver driver;
    propertiesHandling pp;
    @BeforeClass
    public void setup() throws IOException {
        pp=new propertiesHandling();
        pp.getProperty("Browser");
        LaunchBrowser("Browser");
        driver = super.driver;


    }

    @Test

    public void verifyWindowHandling() {
     pp.getProperty("actitimeurl");
        driver.get("actitimeurl");
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        String parentId = driver.getWindowHandle();
        System.out.println(parentId);
        //get all window
        Set<String> Allwindow = driver.getWindowHandles();
        System.out.println(Allwindow);
        //iterate through all
        for (String id : Allwindow)
            //check id is not equals parent id
            if (!id.equals(parentId)) {

                System.out.println("Second Tab id:" + id);
                driver.switchTo().window(id);
                String childWindowTitle = driver.getTitle();
                System.out.println(childWindowTitle);
                driver.close();
                break;

            }

            driver.switchTo().window(parentId);
            System.out.println("Parent tab title:" + driver.getTitle());
        }


    }













