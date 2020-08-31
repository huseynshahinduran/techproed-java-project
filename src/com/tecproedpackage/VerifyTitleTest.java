package com.tecproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        String actualTitel = driver.getTitle();
        String expectedTitle="Google";

        if (actualTitel.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE: "+actualTitel);
            System.out.println("EXPECTED TITLE:"+expectedTitle);
        }





    }

}
