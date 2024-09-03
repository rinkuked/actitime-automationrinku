package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[]args)
    {
//launch the browser
        WebDriver driver=new ChromeDriver();
         //nevigate to the website

        driver.get("https://amazon.in");
//object of select class
        Select select=new Select(driver.findElement(By.id("searchDropdownBox")));

        //select option by text
       // select.selectByVisibleText("Baby");

        //select option by value
        //select.selectByValue("search-alias=baby");
        select.selectByIndex(7);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("daipers");
        select.deselectByIndex(7);

driver.findElement(By.id("nav-search-submit-button")).click();





    }
}
