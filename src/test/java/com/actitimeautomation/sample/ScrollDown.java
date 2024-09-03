package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {
    public static void main(String[] rga) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/cyber9/");
        //create object of actions class
        Actions action = new Actions(driver);
        action.sendKeys(driver.findElement(By.id("username")), "rk_71").build().perform();
        action.sendKeys(driver.findElement(By.name("pwd")), "monika@123").build().perform();

        action.click(driver.findElement(By.xpath("//a[@id='loginButton']//div"))).build().perform();
        Thread.sleep(5000);
        action.click(driver.findElement(By.id("container_tasks"))).build().perform();
        Thread.sleep(5000);

        action.scrollToElement(driver.findElement(By.xpath("//div[text()='floraa']"))).click(driver.findElement(By.xpath("//div[text()=\"floraa\"]"))).build().perform();
    }
}