package org.rachanakore.ex04_Input_select_checkbox_alerts_radio;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

       Thread.sleep(5000);

        WebElement element1 = driver.findElement(By.xpath("//button[@onclick = \"jsAlert()\"]"));
       element1.click();

        //WebElement element2 = driver.findElement(By.xpath("//button[@onclick = \"jsConfirm()\"]"));
        //element2.click();

        //WebElement element3 = driver.findElement(By.xpath("//button[@onclick = \"jsPrompt()\"]"));
       // element3.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
      //alert.dismiss();
       // alert.sendKeys("RACHANA");
       // alert.accept();


        //String result1 = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result1,"You successfully clicked an alert");

        //String result2 = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result2,"You clicked: Ok");

        //String result2 = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result2,"You clicked: Cancel");

        //String result3 = driver.findElement(By.id("result")).getText();
       // Assert.assertEquals(result3,"You entered: RACHANA");
        driver.quit();


    }
}
