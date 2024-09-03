package com.actitimeautomation.sample;
import com.actitimeautomation.pages.loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tasktest {
    public static void main(String[] args)throws InterruptedException {
        //luanch browser
        WebDriver driver = new ChromeDriver();
        //navigate to website
        driver.get("https://online.actitime.com/cyber9/");

//create object of login page class
        loginpage loginpage = new loginpage(driver);
        loginpage.login("rk_71", "monika@123");


        //wait for 5 sec
        Thread.sleep(5000);
        //click on task module
        driver.findElement(By.id("container_tasks")).click();

        //wait for 5 sec
        Thread.sleep(5000);
        // verify check box is selected or not
         driver.findElement(By.xpath("//tr[@class='headers']/descendant::div[2]")).click();

         Thread.sleep(5000);


        }

    }

