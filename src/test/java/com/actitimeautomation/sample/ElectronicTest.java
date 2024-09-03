package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElectronicTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(" https://amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("electronics");
        driver.findElement(By.id("nav-search-submit-button")).click();
       List <WebElement> name= driver.findElements(By.tagName("span"));
       System.out.println(name.size());

       for( WebElement element:name)
       {
          String namep =element.getAttribute("class");
             String names =element.getText();
           System.out.println(names);

       }
    }
}
