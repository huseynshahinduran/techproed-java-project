package com.tecproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Login_Page {

    /*
        Bir class oluşturun : Face_Login_Page
	    1. https://www.facebook.com/ facebook sayfasina gidin.
        2. username ve password gecerli mi test edin.
	        Username = "testusername"
	        Password  =  "testpassword"
	        Step 1. locate username box
	        Step 2. locate password box
	        Step 3. locate signin button
	        Step 4. click sign in button
     */

    /*
        Aynı classi kullanarak;
        1.Asagidaki web elementlerini locate edin ve textlerini konsolda yazdirin.
        "Sign Up"
        "Connect with friends and the world around you on Facebook."
        2.First name , Last name, Mobile number or email, New password text boxlarini locate edin ve verilen test datalarini
        text boxlara gonderin.
        First name = testfirstname
        Last name = testlastname
        Mobile number or email = test@gmail.com
        New Password = testpassword

     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/husey/OneDrive/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement emailTextBox=driver.findElement(By.cssSelector("#email"));
        WebElement passwordTextBox=driver.findElement(By.cssSelector("#pass"));
        WebElement logInButton=driver.findElement(By.cssSelector("#u_0_b"));

        emailTextBox.sendKeys("testusername");
        passwordTextBox.sendKeys("testpassword");
        logInButton.click();

        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();

        WebElement singUpText=driver.findElement(By.xpath("//span[.='Create an account']"));
        System.out.println(singUpText.getText());

        WebElement elementText=driver.findElement(By.cssSelector("._5iyx"));
        System.out.println(elementText.getText());

        WebElement nameTextBox=driver.findElement(By.cssSelector("#u_0_m"));
        nameTextBox.sendKeys("testfirstname");

        WebElement surnameTextBox=driver.findElement(By.cssSelector("#u_0_o"));
        surnameTextBox.sendKeys("testlastname");

        WebElement mobileNumberOrEmail=driver.findElement(By.cssSelector("#u_0_r"));
        mobileNumberOrEmail.sendKeys("test@gmail.com");

        WebElement newPassword=driver.findElement(By.cssSelector("#password_step_input"));
        newPassword.sendKeys("testpassword");

    }

}
