package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.redbus.in/");
        driver.findElement(By.xpath("//input[@class='sc-bxivhb dsDRlf']")).sendKeys("pune");
//driver.findElement(By.xpath("//input[@class=\'sc-bxivhb dsDRlf\']")).sendKeys("mumbai");
        driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("mumbai");
        driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();

driver.manage().window().maximize();
Thread.sleep(5000);
        driver.manage().window().minimize();
        Thread.sleep(5000);

        String cc=driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).getText();
        System.out.println(cc);
        // 	at com.actitimeautomation.sample.RedBus.main(RedBus.java:30)boolean flag=driver.findElement(By.xpath("//div[@class='la nbelCalendarContainer']")).isDisplayed();
       // System.out.println(flag);

 String title=driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.WINDOW);


    }
}