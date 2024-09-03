package com.actitimeautomation.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class icognitoWindow {
    public static void main(String[] arg) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        // Create a new instance of the ChromeDriver with the modified options
        WebDriver driver = new ChromeDriver(options);
    }
}