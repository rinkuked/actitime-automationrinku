package com.actitimeautomation.sample;

import com.actitimeautomation.pages.loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class GetAllCustAndInsertInExcel {
    public static void main (String[]args) throws InterruptedException, IOException {

        WebDriver driver= new ChromeDriver();

        driver.get("https://online.actitime.com/cyber9/");

        //create object of login page class
        loginpage loginpage = new loginpage(driver);
        loginpage.login("rk_71", "monika@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Tasks']")).click();
//get all customer names
        List<WebElement> allcust=driver.findElements(By.xpath("//div[contains(@class,'customerNode')]//div[@class='text']"));
        System.out.println(allcust.size());
        //create 2 dimennsioanl array
        Object[][] data=new Object[allcust.size()][1];
for(int i=0;i<= allcust.size()-1;i++)
{
    String customername=allcust.get(i).getText();
data[i][0]=customername;
ExcelHandling excelHandling=new ExcelHandling();
    String filePath = "C:/Users/kedar/Documents/book11.xlsx";
    excelHandling.writeExcelData(filePath,"rin",data);
    driver.quit();
}

    }
}
