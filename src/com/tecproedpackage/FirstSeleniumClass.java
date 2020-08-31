package com.tecproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");
        //driver olusturduk
        WebDriver driver=new ChromeDriver();
        //url git
        driver.get("https://www.google.com");

    Thread.sleep(5000); // Bekleme suresi(5s) wait

        /*
        close() ve quit() her iki metot da tarayiciyi kapatir.
        close() ==> mevcut sayfayi kapatir.
        quit() ==> acilan tum sayfalari kapatir. close()'dan daha guclu.
         */

    driver.quit();

    }
}
