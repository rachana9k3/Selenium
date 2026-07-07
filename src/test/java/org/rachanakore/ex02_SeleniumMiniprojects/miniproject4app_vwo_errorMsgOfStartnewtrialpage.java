package org.rachanakore.ex02_SeleniumMiniprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class miniproject4app_vwo_errorMsgOfStartnewtrialpage {

    @Test
    public void verifyErrorMsg() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");

        Thread.sleep(5000);

        WebElement emailentry = driver.findElement(By.className("input-text"));
        emailentry.sendKeys("abc");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        List<WebElement> buttonlist = driver.findElements(By.tagName("button"));
        buttonlist.get(0).click();

        Thread.sleep(3000);

        WebElement errormsg = driver.findElement(By.className("invalid-reason")); //here in clas name 'invalid-reason' is unique
        //crosscheck it with finding the name, if it shows first occurence and idf it is visible we can use that4
        Assert.assertEquals(errormsg.getText(),"The email address you entered is incorrect.");


        Thread.sleep(3000);



        driver.quit();



    }
}
