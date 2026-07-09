package org.rachanakore.ex02_SeleniumMiniprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.rachanakore.ex05_WaitHelpers.WAIT_Helpers_usedInFramework.waitJVM;

public class Katalon_fullAutomation {

    WebDriver driver = new EdgeDriver();

    @BeforeTest
    public void openBrowser(){
       // driver.manage().window().maximize();

    }

    @Test
    public void fullAutomate(){
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeaptbtn = driver.findElement(By.id("btn-make-appointment"));
        makeaptbtn.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();

        waitJVM(3000);

        System.out.println("Appoinment details entering page");
        System.out.println(driver.getCurrentUrl());

        waitJVM(3000);

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.alertIsPresent());


       // Alert alert = driver.switchTo().alert();
       // alert.accept();

        WebElement facilityBox = driver.findElement(By.xpath("//select[@name='facility']"));
        Select select = new Select(facilityBox);

        select.selectByIndex(1);

        WebElement checkbox = driver.findElement(By.id("chk_hospotal_readmission"));
        checkbox.click();

        WebElement visitDate = driver.findElement(By.name("visit_date"));
        visitDate.sendKeys("10/08/2027");


        WebElement commentBox = driver.findElement(By.id("txt_comment"));
        commentBox.sendKeys("details entered");

        WebElement bookappt_btn = driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
        bookappt_btn.click();

        waitJVM(3000);

        System.out.println("Appointment Confirmation");
        System.out.println(driver.getCurrentUrl());

      //  WebElement confirmation = driver.findElement(By.xpath("//h2[text()='Appointment Confirmation']"));
        //System.out.println(confirmation);

        WebElement menuToggle = driver.findElement(By.id("menu-toggle"));
        menuToggle.click();

        WebElement logout = driver.findElement(By.xpath("//a[@href='authenticate.php?logout']"));
        logout.click();


    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
