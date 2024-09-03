package com.actitimeautomation.sample;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider
    public  String[][] getSampleData()
    {


        String[][] obj=new String[][]
                {

                        {  "pune","nagpur","solapur"},
                        {  "mumbai","delhi",""}

                };
        return  obj;
    }
}
