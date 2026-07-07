package org.rachanakore.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description("Find title in vwo  ")
    @Test
    public void testSelenium02(){

        //open the url
        EdgeDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com/#/login");

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();
    }

}
