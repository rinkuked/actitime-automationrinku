package com.actitimeautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
    WebDriver driver;
    CommonUtilClass Co;
    public  ProjectPage(WebDriver driver)
    {
        this.driver=driver;


        Co= new CommonUtilClass(this.driver);
    }


    //public By taskModule=By.xpath("//div[@id='container_tasks']");
    @FindBy(xpath = "//div[@id='container_tasks']")
    WebElement taskModule;

    public By addNewButton=By.xpath("//div[text()='Add New']");
    public By createNewProject=By.xpath("//div[@class='item createNewProject']");
    public By  projectNametextArea=By.xpath("//div[@class='sectionDetails']//input[@placeholder='Enter Project Name']");
    public By createProjectButton=By.xpath("//div[text()='Create Project']");
    public By searchText=By.xpath("(//div[@class='searchField']//input[@placeholder='Start typing name ...'])[1]");



    public void createProject(String ProjectName) throws InterruptedException
    {
      //  Co.fluentWait(taskModule);
        //driver.findElement(taskModule).click();

        PageFactory.initElements(driver,this);

        Co.fluentWait(addNewButton);
        driver.findElement(addNewButton).click();
        Co.fluentWait(createNewProject);
        driver.findElement(createNewProject).click();
        Co.fluentWait(projectNametextArea);
        driver.findElement(projectNametextArea).sendKeys(ProjectName);
        Co.fluentWait(createProjectButton);
        driver.findElement(createProjectButton).click();
    }

    public void verifyProject(String ProjectName)
    {
        // Co.fluentWait(searchText);

        driver.findElement(searchText).sendKeys(ProjectName);


    }


}

