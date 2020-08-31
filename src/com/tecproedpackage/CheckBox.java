package com.tecproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    /*
    ir class oluşturun : CheckBox
    Main method oluşturun ve aşağıdaki görevi  tamamlayın.
    Verilen web sayfasına gidin. https://the-internet.herokuapp.com/checkboxes
    Checkbox1 ve checkbox2 elementlerini locate edin.
    Checkbox1 seçili değilse onay kutusunu tıklayın
    Checkbox2 seçili değilse onay kutusunu tıklayın
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }else{
            System.out.println("Checkbox1 daha onceden check edilmis");
        }

        WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if(!checkbox2.isSelected()){
            checkbox2.click();
        }else{
            System.out.println("Checkbox2 daha onceden check edilmis");
        }






    }



}
