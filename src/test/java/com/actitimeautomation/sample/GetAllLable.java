package com.actitimeautomation.sample;

import com.actitimeautomation.pages.BaseClass;
import com.actitimeautomation.pages.propertiesHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class GetAllLable extends BaseClass {
    WebDriver driver;
    propertiesHandling pp;
    @BeforeClass
    public void setup() throws IOException {
        pp = new propertiesHandling();
        pp.getProperty("Browser");
        LaunchBrowser("chrome");
        driver = super.driver;
    }
    @Test
            public void verify()
    {
        pp.getProperty("actitimeurl");
        driver.get("actitimeurl");
        List<WebElement> TagElement = driver.findElements(By.tagName("input"));
        System.out.println(TagElement.size());
        for (WebElement element : TagElement) {
            String link = element.getAttribute("placeholder");
            if (link != null && !link.isEmpty() ) {
                System.out.println(link);
            }
        }

    }


}