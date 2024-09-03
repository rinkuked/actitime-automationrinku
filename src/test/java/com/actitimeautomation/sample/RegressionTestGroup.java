package com.actitimeautomation.sample;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegressionTestGroup {

@Parameters
        ( { "browser"," username"})
    @BeforeGroups( groups ="rinku")
    public void beforeGroup() {
        System.out.println("this is before group method regreesuin");
    }

    @AfterGroups("deepa")
    public void aftergroup() {
        System.out.println("this is before group method regression ");
    }

    @Test(groups = {"rinku"})
    public void Regressiontest1() {
        System.out.println("this is  Regressiontest1");

    }

    @Test(groups = {"deeepa"})

    public void  Regressiontest2() {
        System.out.println("this is  Regressiontest2");

    }

    @Test()
    public  void  Regressiontest3()
    {
        System.out.println( "this is  Regressiontest3");

    }

}
