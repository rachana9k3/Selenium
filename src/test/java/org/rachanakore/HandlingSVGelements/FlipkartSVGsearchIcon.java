package org.rachanakore.HandlingSVGelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.rachanakore.ex05_WaitHelpers.WAIT_Helpers_usedInFramework.waitJVM;

public class FlipkartSVGsearchIcon {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void openBrowser(){

        driver.manage().window().maximize();
    }


    @Test
    public void testFlipkartSVG_searchIcon(){

        //1. enter the macmini in search box
        driver.get("https://www.flipkart.com/search");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("macbookz");

        //2. clck on SVG element
        List<WebElement> SVGelements = driver.findElements(By.xpath("//*[name()='svg']"));
        SVGelements.get(0).click();

        waitJVM(3000);

        //3. Get titles of the searched results..
        List<WebElement> titles = driver.findElements(By.xpath("//div[@class=\"RG5Slk\"]"));
        for(WebElement title : titles){
            System.out.println(title.getText());
        }

    }

    @AfterTest
    public void closeBrowser(){
        waitJVM(1000);
        driver.quit();
    }

}
