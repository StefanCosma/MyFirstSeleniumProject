package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test

    public void validLoginTest(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
                accountButton.click();

                WebElement loginLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
                loginLink.click();
                driver.findElement(By.cssSelector("email")).

    }
}
