package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example

{
    public static void main(String[] args) throws Exception
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/rinkukamble/login.do");
        driver.findElement(By.id("username")).sendKeys("rk_71");
        driver.findElement(By.name("pwd")).sendKeys("monika@123");
        driver.findElement(By.xpath("//a[@id='loginButton']//div")).click();


        //senario 1 login feature error mesg with invalid uname and pass

        driver.findElement(By.id("username")).sendKeys("rk_71");
        driver.findElement(By.name("pwd")).sendKeys("monika@123");
        driver.findElement(By.xpath("//a[@id='loginButton']//div")).click();
        Thread.sleep(5000);

        //get error mesg
        String error = driver.findElement(By.xpath("//span[starts-with(text(),'Username or Password')]")).getText();
        System.out.println(error);

        //senario 2 verify error messge
        if(error.equals("Username or Password is invalid. Please try again.")) {
            System.out.println("successfully verify error");
        }
            else
            {
                throw new   Exception("did not match meesge");
            }





            //verify  login feature with blank user name  and valid pass

        driver.findElement(By.name("pwd")).sendKeys("monika@123");
        driver.findElement(By.xpath("//a[@id='loginButton']//div")).click();
        Thread.sleep(5000);



        }

    }
