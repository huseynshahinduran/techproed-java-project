package com.tecproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        String actualURL=driver.getCurrentUrl();
        String expectedURL="www.google.com";

        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE: "+actualURL);
            System.out.println("EXPECTED TITLE:"+expectedURL);
        }



    }
}
