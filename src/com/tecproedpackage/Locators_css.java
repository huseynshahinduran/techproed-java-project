package com.tecproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

public class Locators_css {
/*
    Bir class oluşturun : Locators_css
    Main method oluşturun ve aşağıdaki görevi  tamamlayın.
    Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
    Locate email textbox
    Locate password textbox ve
    Locate signin button
    Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
    Username :  testtechproed@gmail.com
    Password : Test1234!
 */




    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");
//                                                                  tagName[attribute='value']
        WebElement emailTextBox=driver.findElement(By.cssSelector("input[type='email']"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
//                                                                      #id value
        WebElement passwordTextBox=driver.findElement(By.cssSelector("#session_password"));
        passwordTextBox.sendKeys("Test1234!");
//                                                                  .class value
        WebElement singInButton=driver.findElement(By.cssSelector(".btn"));
        singInButton.click();


    }


}
