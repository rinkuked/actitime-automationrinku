package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllimage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://amazon.in");
        List<WebElement> imgelement = driver.findElements(By.tagName("img"));
        System.out.println(imgelement.size());
        for (WebElement element : imgelement) {
            String img = element.getAttribute("onload");
            if (img != null) {
                System.out.println(img);
            }
        }
    }
}