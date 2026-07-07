package org.rachanakore.ex02_SeleniumMiniprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class miniproject2_katalon {

    @Test
    public void miniproject2() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement clickbtn = driver.findElement(By.id("btn-make-appointment"));
        clickbtn.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginbtn = driver.findElement(By.id("btn-login"));
        loginbtn.click();

        Thread.sleep(3000);

        driver.getCurrentUrl();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


        driver.quit();

    }
}
