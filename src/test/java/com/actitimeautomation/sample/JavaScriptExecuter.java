package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/cyber9/");
        driver.findElement(By.id("username")).sendKeys("rk_71");
        driver.findElement(By.name("pwd")).sendKeys("monika@123");
        JavaScriptExecuter js = (JavaScriptExecuter) driver;

    }

}
