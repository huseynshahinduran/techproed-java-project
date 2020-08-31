package com.tecproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Review {
    /*
    1. Create a class : Day2Review
2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
4. Daha sonra Navigate to https://www.amazon.com/
5. Navigate back to youtube
6. Refresh the page
7. Navigate forward to amazon
8. Maximize the window
9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
11.Quit the browser

     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com/");

        String actualTitle=driver.getTitle();
        String expectedTitle="youtube";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("Actual YouTube Title: "+actualTitle);
            System.out.println("Expected YouTube Title: "+expectedTitle);
        }

        System.out.println();

        String actualURL=driver.getCurrentUrl();
        String expectedURL="https://www.youtube.com/";

        if (actualURL.equals(expectedURL)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("Actual YouTube URL: "+actualURL);
            System.out.println("Expected YouTube URL: "+expectedURL);
        }

        System.out.println();

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);


        String actualTitle1=driver.getTitle();
        String expectedTitle1="Amazon";

        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Actual Amazon Title: "+actualTitle1);
            System.out.println("Expected Amazon Title: "+expectedTitle1);
        }

        System.out.println();

        String actualURL1=driver.getCurrentUrl();
        String expectedURL1="https://www.amazon.com/";

        if(actualURL1.equals(expectedURL1)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("Actual Amazon URL: "+actualURL1);
            System.out.println("Expected Amazon URL: "+expectedURL1);
        }

        driver.quit();

    }
}
