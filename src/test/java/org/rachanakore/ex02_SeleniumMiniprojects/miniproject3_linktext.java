package org.rachanakore.ex02_SeleniumMiniprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class miniproject3_linktext {

    @Test
    public void miniproject3_linktext() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        Thread.sleep(3000);

        WebElement linkTextFullMatch = driver.findElement(By.linkText("Start a FREE TRIAL"));
        linkTextFullMatch.click();

       // WebElement linkTextPartialMatch = driver.findElement(By.linkText("Start a FREE"));
        //linkTextPartialMatch.click();

        driver.quit();


    }
}
