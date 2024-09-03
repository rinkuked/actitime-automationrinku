package com.actitimeautomation.sample;

import com.actitimeautomation.pages.BaseClass;
import com.actitimeautomation.pages.loginpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderExample extends BaseClass
{
    WebDriver driver;
    @BeforeClass
    public void setup() {
        LaunchBrowser("chrome");
        driver = super.driver;
        driver.get("https://online.actitime.com/cyber9/");

    }
    @DataProvider
    public  Object[][]getTestData()
    {
        Object[][]obj=new Object[][]
                {

                        {"uname1","pass1"},
                        {"uname2","pass2"}
                };
        return obj;
    }
    @DataProvider
    public  Object[][] getTestDataFromExcel() throws IOException {
        ExcelHandling excelHandling = new ExcelHandling();
        String filePath = "C:/Users/kedar/Documents/book11.xlsx";
        Object[][] exceldata = excelHandling.getExcelData(filePath, "Sheet1");
        return exceldata;
    }
    @Test(dataProvider ="getTestDataFromExcel")
    public void VerifyLogin(Object usernane,Object password) throws InterruptedException {
        loginpage loginpage = new loginpage(driver);
        loginpage.login(usernane.toString(),password.toString());
        Thread.sleep(5000);
    }
    @Test(dataProvider = "getSampleData",dataProviderClass = TestDataProvider.class)
    public void test(Object param1, Object param2,Object param3)
    {

      System.out.println(param1 + " "+param2 + "" + param3);
    }


    }
