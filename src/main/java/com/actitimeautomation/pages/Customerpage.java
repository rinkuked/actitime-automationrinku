package com.actitimeautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customerpage {
    WebDriver driver;
    CommonUtilClass Co;
    public  Customerpage(WebDriver driver)
    {
        this.driver=driver;


        Co= new CommonUtilClass(this.driver);
    }



 public By taskModule=By.xpath("//div[@id='container_tasks']");
    public By addNewButton=By.xpath("//div[text()='Add New']");
   public By createNewCustomer=By.xpath(
           "//div[@class='item createNewCustomer']");
   public By customerNametextArea=By.xpath("//div[@class='customerInfoDiv']/descendant::input");
   public By createCustomerbutton=By.xpath("//div[text()='Create Customer']");
   public By searchText=By.xpath("(//div[@class='searchField']//input[@placeholder='Start typing name ...'])[1]");


   public void createCustomer(String customerName) throws InterruptedException
   {
       Co.fluentWait(taskModule);
       driver.findElement(taskModule).click();
       Co.fluentWait(addNewButton);
       driver.findElement(addNewButton).click();
       Co.fluentWait(createNewCustomer);

       driver.findElement(createNewCustomer).click();
       Co.fluentWait(customerNametextArea);
       driver.findElement(customerNametextArea).sendKeys(customerName);
       Co.fluentWait(createCustomerbutton);
       driver.findElement(createCustomerbutton).click();
   }

   public void verifyCustomer(String customerName)
   {
      // Co.fluentWait(searchText);

       driver.findElement(searchText).sendKeys(customerName);


   }

}

