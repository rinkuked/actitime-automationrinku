package com.actitimeautomation.sample;

import com.actitimeautomation.pages.loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customertest {
    public static void main(String[] args) throws Exception {
        //launch browser
        WebDriver driver = new ChromeDriver();
        //nevigate to website
        driver.get("https://online.actitime.com/cyber/timetrack/enter.do");

        //create object of login page class
        loginpage loginpage = new loginpage(driver);
        loginpage.login("skd_71", "monika@123");

      Thread.sleep(5000);// click on task module
        driver.findElement(By.id("container_tasks")).click();
        //click  on add new
        driver.findElement(By.className("plusIcon")).click();

        // click on new customer
        driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        Thread.sleep(5000);
        //create cust with name
       driver.findElement(By.xpath("//div[@class='customerInfoDiv']/descendant::input")).sendKeys("shr");

       //enter customer description
     driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("this is from US");
     //click on creat customer
        driver.findElement(By.xpath("//div[@class='commitButtonPlaceHolder']/div[1]")).click();


        /////senario create project

        Thread.sleep(5000);
        //click on task

        driver.findElement(By.id("container_tasks")).click();

//click  on add new
        driver.findElement(By.className("plusIcon")).click();

        //click on new project
        driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
        Thread.sleep(5000);

        // create proj with name
        driver.findElement(By.xpath("//div[@class='sectionDetails']/input")).sendKeys("manual");

        //add description
        driver.findElement(By.xpath("//textarea[@placeholder='Add Project Description']")).sendKeys("this is m,anual testing project");
Thread.sleep(5000);
//driver.findElement(By.xpath("//div[text()='Rin']")).click();

Thread.sleep(5000);
                driver.findElement(By.xpath("//div[text()='Create Project']")).click();

//task
//click  on add new
  driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();


//click on new task
      driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
      driver.findElement(By.xpath(" //td[@class='nameCell first']//input")).sendKeys("functional test acses");

    }
}