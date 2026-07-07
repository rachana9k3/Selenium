package org.rachanakore.ex02_SeleniumMiniprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mp5_katalon_xpaths1 {

    @Test
    public void verifyXpaths(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeappoint_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        makeappoint_btn.click();

        WebElement enterUN = driver.findElement(By.xpath("//input[@name='username']"));
        enterUN.sendKeys("John Doe");

        WebElement enterpwd = driver.findElement(By.xpath("//input[@name='password']"));
        enterpwd.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_btn.click();


        driver.quit();

    }
}
