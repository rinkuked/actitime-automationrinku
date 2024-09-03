package com.actitimeautomation.sample;

import com.actitimeautomation.pages.loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyBoard {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/cyber9/");
        driver.findElement(By.id("username")).sendKeys("rk_71");
        driver.findElement(By.name("pwd")).sendKeys("monika@123");
        // Actions act=new Actions(driver);
        //act.keyDown(Keys.ENTER).build().perform();
        //act.keyUp(Keys.ENTER).build().perform();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);


    }
}