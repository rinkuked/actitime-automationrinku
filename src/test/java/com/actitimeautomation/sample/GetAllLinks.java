package com.actitimeautomation.sample;

import io.opentelemetry.api.trace.StatusCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class GetAllLinks {
    public static void main(String[] argts) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get(" https://amazon.in");
        List<WebElement> tagElements = driver.findElements(By.tagName("a"));
        System.out.println(tagElements.size());
        for (WebElement element : tagElements) {
            String link = element.getAttribute("href");
          if (link != null)
            {
                //convert string in url
                URL url=new URL(link);
                URLConnection connection= url.openConnection();
                HttpURLConnection httpURLConnection  = (HttpURLConnection)connection;
                httpURLConnection.connect();
                int statusCode=httpURLConnection.getResponseCode();
                //print broken url
                if (statusCode>299)
                {
                    System.out.println(statusCode+ ""+link);
                }
                httpURLConnection.disconnect();




            }



        }
    }
}
