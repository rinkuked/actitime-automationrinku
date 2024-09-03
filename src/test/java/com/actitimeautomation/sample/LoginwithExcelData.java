package com.actitimeautomation.sample;

import com.actitimeautomation.pages.loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LoginwithExcelData {
    public  static void main(String[]args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://online.actitime.com/cyber9/");
        //create object of login page class
        loginpage loginpage = new loginpage(driver);

        ExcelHandling exelHandling=new ExcelHandling();
        String filePath = "C:/Users/kedar/Documents/book11.xlsx";
        Object [][] excelData=exelHandling.getExcelData(filePath,"sheet1");
        for(int i=0;i<=excelData.length-1;i++)
        {

            String username=excelData[i][0].toString();
            String password=excelData[i][1].toString();
            loginpage.login(username,password);
            //Thread.sleep(5000);

        }


    }
}
