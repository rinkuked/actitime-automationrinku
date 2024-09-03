package com.actitimeautomation.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesHandling {
    Properties properties;
    public propertiesHandling() throws IOException {
        //access the config propertis file

        //1.get the path of the project
       String filepath= System.getProperty("user.dir")+"/config.properties";

       //2.access the config properties file

        FileInputStream inputStream=new FileInputStream(filepath);

        //create object of properties class
        properties=new Properties();
        //load file into properties class
        properties.load(inputStream);



    }
    public String getProperty(String key)
    {
        return properties.getProperty(key);



    }

}


