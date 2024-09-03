package com.actitimeautomation.sample;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class sanityTestGroup {
    @BeforeGroups(groups = "rinku")
    public void beforeGroup() {
        System.out.println("this is before group method of sanity");
    }

    @AfterGroups(groups = "rinku")
    public void aftergroup() {
        System.out.println("this is after group method sanity");
    }

    @Test()
    public void sanitytest1() {
        System.out.println("this is sanity test1");

    }

    @Test()
    public void sanitytest2() {
        System.out.println("this is sanity test2");

    }

    @Test()
    public  void sanitytest3()
    {
        System.out.println( "this is sanity test3");

    }













}