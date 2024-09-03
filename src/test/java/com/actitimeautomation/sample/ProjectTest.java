package com.actitimeautomation.sample;

import com.actitimeautomation.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class ProjectTest  extends BaseClass {
    WebDriver driver;
    propertiesHandling pp;
    ProjectPage projectPage;
    Customerpage cc;

    @BeforeClass
    public void setup() throws IOException {
        pp= new propertiesHandling();
        projectPage=new ProjectPage(driver);
        String browser= pp.getProperty("browser");
        LaunchBrowser(browser);
        driver=super.driver;
        driver.get(pp.getProperty("actitimeurl"));
        loginpage loginpage= new loginpage(driver);
        String username= pp.getProperty("username");
        String password= pp.getProperty("password");
        loginpage.login(username,password);

        projectPage=new ProjectPage(driver);
        cc=new Customerpage(driver);
    }


    @Test
    public  void verifyCreateCustomer() throws InterruptedException {
        cc.createCustomer("success5");
        cc.verifyCustomer("success5");
    }

    @Test
    public  void verifyCreateProject() throws InterruptedException {
        projectPage.createProject("actitime");
        projectPage.verifyProject("actitime");
    }

}
