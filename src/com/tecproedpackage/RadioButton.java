package com.tecproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    /*
        Bir class oluşturun  : RadioButton
        Main method oluşturun ve aşağıdaki görevi  tamamlayın.
        Facebook web sayfasına gidin.  https://www.facebook.com/
        Radio button elementlerini locate edin.
        Seçili değilse istediginiz radio buttonu  tıklayın.
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(1000);

        WebElement femaleRadioButton=driver.findElement(By.cssSelector("#u_0_6"));

        WebElement maleRadioButton=driver.findElement(By.cssSelector("#u_0_7"));

        if(!maleRadioButton.isSelected()){
            maleRadioButton.click();
            System.out.println("PASS");
        }else{
            System.out.println("Onceden secilmis!");
        }

        WebElement customRadioButton=driver.findElement(By.cssSelector("#u_0_8"));

    }
}
