package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        String windowid = driver.getWindowHandle();
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe")));

 WebElement src=driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
        WebElement des=driver.findElement(By.id("trash"));
        Actions actions = new Actions(driver);
//actions.clickAndHold(src).release(des).build().perform();
        actions.dragAndDrop(src,des).build().perform();
driver.switchTo().window(windowid);
    }
}