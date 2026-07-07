package org.rachanakore.ex02_SeleniumMiniprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class miniproject1_wingify {

    @Test
    public void test_miniproject1() throws Exception{

        //EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--start-maximized");  can use both

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement pwdInputBox = driver.findElement(By.id("login-password"));
        pwdInputBox.sendKeys("admin@123");

        WebElement submitbtn = driver.findElement(By.id("js-login-btn"));
        submitbtn.click();

        Thread.sleep(3000);

        WebElement errorMsg = driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(errorMsg.getText(),"Your email, password, IP address or location did not match");

        //---------------------
        //linktext - fullmatch and partial match

        WebElement linkTextFullMatch = driver.findElement(By.linkText("Start a FREE TRIAL"));
        linkTextFullMatch.click();

        WebElement linkTextPartialMatch = driver.findElement(By.linkText("Start a FREE"));
        linkTextPartialMatch.click();

        driver.quit();


    }
}
