package com.actitimeautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

    WebDriver driver;

    public  loginpage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void login(String username,String password)
    {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys(password);
        driver.findElement(By.xpath("//a[@id='loginButton']//div")).click();
    }
}
