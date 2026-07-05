package org.rachanakore.ex01_SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

  @Test
    public void test_VerifyVWO_Login(){
      //Write the code which will execute and perform UI interactions

      ChromeDriver driver = new ChromeDriver();
      driver.get("https://app.vwo.com");
      System.out.println(driver.getTitle());




  }

}
