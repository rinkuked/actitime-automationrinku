package com.actitimeautomation.sample;

import org.testng.annotations.*;

public class TestNGAnnotations {
    {
        System.out.println("this is non static block");
    }

    public TestNGAnnotations() {
        System.out.println("this is a constructor");

    }

    @BeforeClass
    public void beforeclass() {
        System.out.println("this is before class");

    }

    @AfterClass
    public void afterclass() {
        System.out.println("this is after class");

    }

    @BeforeMethod
    public void beforemethod() {
        System.out.println("this is before method");

    }


    @AfterMethod
    public void aftermethod() {
        System.out.println("this is after methood");

    }

    @Test
    public void test1() {

        System.out.println("this is test 1method ");
    }


    @Test
    public void test2() {

        System.out.println("this is test2 method ");
    }

    @Test
    public void test3() {

        System.out.println("this is test 1method ");
    }


    @BeforeSuite
    public void beforesuit() {
        System.out.println("this is beforr suit method ");
    }

        @AfterSuite
        public void aftersuit() {
            System.out.println("this is after suit method ");

        }
}