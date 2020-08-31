package com.tecproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators_xpath {
    /*
        Bir class olusturun: Locators_xpath
        Main method olusturun ve aşağıdaki görevi tamamlayın.
        Kullanici http://a.testaddressbook.com/sign_in adresine gitsin.
        Locate email textbox
        Locate password textbox ve
        Locate signin button
        Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        Username :  testtechproed@gmail.com
        Password : Test1234!
        Ardından, beklenen(expected) user id  testtechproed@gmail.com dogrulayin(verify)
        Addresses ve Sign Out metinlerinin görüntülendiğini(isDisplayed) doğrulayin.
        Sayfadaki toplam link sayısını bulun ve konsolda yazdirin.
        Sayfadan çıkış yapın(Sign Out)
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox = driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordTextBox.sendKeys("Test1234!");

        WebElement signButton = driver.findElement(By.xpath("//input[@type='submit']"));
        signButton.click();

        driver.manage().window().maximize();
        //                                              //*[.='text name']
        WebElement userID=driver.findElement(By.xpath("//*[.='testtechproed@gmail.com']"));
        String actualUserID=userID.getText();
        String expectedUserID="testtechproed@gmail.com";

        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID: "+actualUserID);
            System.out.println("EXPECTED USER ID: "+expectedUserID);
        }
//                                                           //tagName[.='text name']
        WebElement addressLink=driver.findElement(By.xpath("//a[.='Addresses']"));
        String actualAddressLink=addressLink.getText();
        String expectedAddressLink="Addresses";

        if (actualAddressLink.equals(expectedAddressLink)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL ADDRESSES LINK: "+actualAddressLink);
            System.out.println("EXPECTED ADDRESSES LINK: "+expectedAddressLink);
        }

        WebElement singOutLink=driver.findElement(By.xpath("//a[.='Sign out']"));
        String actualSingOutLink=singOutLink.getText();
        String expectedSingOutLink="Sign Out";

        if(actualSingOutLink.equals(expectedSingOutLink)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL SING OUT LINK: "+actualSingOutLink);
            System.out.println("EXPECTED SING OUT LINK: "+expectedSingOutLink);
        }

        List<WebElement> listOfLinkElement=driver.findElements(By.tagName("a"));
        System.out.println("SYFADAKI TOPLAM LINK SAYISI: "+listOfLinkElement.size());

        for(WebElement element:listOfLinkElement){
            System.out.println(element.getText());
        }

        singOutLink.click();










    }

}
