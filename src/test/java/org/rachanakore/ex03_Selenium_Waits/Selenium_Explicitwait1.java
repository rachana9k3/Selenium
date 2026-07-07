package org.rachanakore.ex03_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_Explicitwait1 {

    @Test
    public void ExplicitWait1(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement pwdInputBox = driver.findElement(By.id("login-password"));
        pwdInputBox.sendKeys("admin@123");

        WebElement submitbtn = driver.findElement(By.id("js-login-btn"));
        submitbtn.click();

        WebElement errorMsg = driver.findElement(By.id("js-notification-box-msg"));

        //explicit wait -- it will wait untill the condition is met

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driverWait.until(ExpectedConditions.visibilityOf(errorMsg));



        Assert.assertEquals(errorMsg.getText(),"Your email, password, IP address or location did not match");


        driver.quit();

    }
}
