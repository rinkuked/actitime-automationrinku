package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSnapdeal {
    public static void main(String[]arga)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://snapdeal.com/");
        Select ss=new Select(driver.findElement(By.xpath("//span[text()='Women's Fashion']")));

    }
}
