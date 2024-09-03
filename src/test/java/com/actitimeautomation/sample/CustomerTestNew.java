package com.actitimeautomation.sample;

import com.actitimeautomation.pages.BaseClass;
import com.actitimeautomation.pages.Customerpage;
import com.actitimeautomation.pages.loginpage;
import com.actitimeautomation.pages.propertiesHandling;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class CustomerTestNew extends BaseClass {
    WebDriver driver;
    propertiesHandling pp;
    Customerpage cc;

    @BeforeClass
    public void setup() throws IOException
    {
       pp= new propertiesHandling();
       String browser= pp.getProperty("browser");
       LaunchBrowser(browser);
       driver=super.driver;
       driver.get(pp.getProperty("actitimeurl"));
       loginpage loginpage= new loginpage(driver);
       String username= pp.getProperty("username");
      String password= pp.getProperty("password");
      loginpage.login(username,password);

      cc= new Customerpage(driver);

    }

@Test
    public  void verifyCreateCustomer() throws InterruptedException {
    cc.createCustomer("succes2");
    cc.verifyCustomer("succes2");
}
}
