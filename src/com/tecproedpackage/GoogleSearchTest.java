package com.tecproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

        /*
            1. Bir class oluşturun : GoogleSearchTest
            2. Main method oluşturun ve aşağıdaki görevi  tamamlayın.
                A.google web sayfasına gidin. https://www.google.com/
                b. Search(ara) “city bike”
                c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
                d. “Shopping” e tıklayın.
                e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement googleTextBox = driver.findElement(By.name("q"));
        googleTextBox.sendKeys("city bike");
        googleTextBox.submit();

        WebElement allResult=driver.findElement(By.id("result-stats"));
        System.out.println("Goruntelenme Sayisi: "+allResult.getText());

        driver.findElement(By.linkText("Shopping")).click();

        driver.findElement(By.className("TL92Hc")).click();







    }


}
