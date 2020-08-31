package com.tecproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");

        WebElement signInButton=driver.findElement(By.name("commit"));
        signInButton.click();

        driver.manage().window().maximize();
        Thread.sleep(Long.parseLong("1500"));

        WebElement userID=driver.findElement(By.className("navbar-text"));
        userID.getText();
        String actualUserID=userID.getText();
        String expectedUserID="testtechproed@gmail.com";
        if (actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual UserID: "+actualUserID);
            System.out.println("Expected UserID: "+expectedUserID);
        }

        WebElement addresses=driver.findElement(By.linkText("Addresses"));
        addresses.getText();
        String actualAddresses=addresses.getText();
        String expectedAddresses="Addresses";
        if (actualAddresses.equals(expectedAddresses)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual Addresses: "+actualAddresses);
            System.out.println("Expected Addresses: "+expectedAddresses);
        }

        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        signOut.getText();
        String actualSignOut=signOut.getText();
        String expectedSignOut="Sign Out";
        if (actualSignOut.equals(expectedSignOut)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual Sign Out: "+actualSignOut);
            System.out.println("Expected Sign Out: "+expectedSignOut);
        }

        //By.partialLinkText();
        //Addresses link
        WebElement addressPartialLink = driver.findElement(By.partialLinkText("Address"));
        String actualAddressPartialLinkText=addressPartialLink.getText();
        System.out.println("ADDRESSES PARTIAL LINK TEXT: "+actualAddressPartialLinkText);

        //Sign Out link
        WebElement singOutPartialLink = driver.findElement(By.partialLinkText("Sign"));
        String actualSingOutPartialLinkText=singOutPartialLink.getText();
        System.out.println("SING OUT PARTIAL LINK TEXT: "+actualSingOutPartialLinkText);

        //Sayfadaki toplam link sayisini bulun ve bu linkleri konsolda yazdirin.
        //findElement(); methodu yalnizca tek bir elementi locate icin kullanilir. String return eder.
        //findElements(); methodu birden fazla element return eder. List<WebElement>

        List<WebElement> listOfWebElement = driver.findElements(By.tagName("a"));
        System.out.println("Bu web sayfasinda "+listOfWebElement.size()+" tane link vardir.");

        System.out.println("1. Link Text: "+listOfWebElement.get(0).getText());
        System.out.println("2. Link Text: "+listOfWebElement.get(1).getText());
        System.out.println("3. Link Text: "+listOfWebElement.get(2).getText());


        //for each kullanarak tum link elementlerini yazdiralim

        for (WebElement element: listOfWebElement){
            System.out.println(element.getText());
        }





driver.quit();


    }
}
