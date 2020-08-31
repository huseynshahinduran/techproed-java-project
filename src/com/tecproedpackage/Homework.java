package com.tecproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String actualFacebookTitle=driver.getTitle();
        String expectedFacebookTitle="facebook";

        if (actualFacebookTitle.equals(expectedFacebookTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual Facebook Title: "+actualFacebookTitle);
            System.out.println("Expected Facebook Title: "+expectedFacebookTitle);
        }

        String actualFacebookURL=driver.getCurrentUrl();
        String expectedFacebookURL="https://www.facebook.com/";

        if (actualFacebookURL.equals(expectedFacebookURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual Facebook URL: "+actualFacebookURL);
            System.out.println("Expected Facebook URL: "+expectedFacebookURL);
        }

        driver.navigate().to("https://walmart.com/");

        String actualWalmartTitle=driver.getTitle();
        String expectedWalmartTitle="Walmart.com";

        if (actualWalmartTitle.equals(expectedWalmartTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual Walmart Title: "+actualWalmartTitle);
            System.out.println("Expected Walmart Title: "+expectedWalmartTitle);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();



    }
}
