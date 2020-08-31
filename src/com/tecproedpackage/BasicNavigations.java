package com.tecproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");
        //driver olusturduk
        WebDriver driver=new ChromeDriver();
        //url git
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        //driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().back();//geri gider
        Thread.sleep(2000);
        driver.navigate().forward();//ileri gider
        Thread.sleep(2000);
        driver.navigate().refresh();//sayfayi yeniler
        Thread.sleep(2000);
        driver.manage().window().maximize();//sayfayi buyultuyor
        Thread.sleep(5000);
        driver.quit();

        /*
        1. Aynı class ta, Navigate to amazon home page  https://www.amazon.com/
        2. Navigate back to google
        3. Navigate forward to amazon
        4. Refresh(yenile) the web page
        5. Maximize the window
        6. Close/Quit the browser
         */











    }

}
