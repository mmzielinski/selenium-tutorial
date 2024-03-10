package dzialania;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WpisywanieNaciskanie {

    @Test
    public void uzupelnieniePola() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement clickOnLink = driver.findElement((By.linkText("Podstawowa strona testowa")));
        clickOnLink.click();

        WebElement firstName = driver.findElement(By.id("fname"));
        firstName.sendKeys("Marcin");

        WebElement userName = driver.findElement(By.name("username"));
        userName.clear();
        userName.sendKeys("admin");
        System.out.println(userName.getAttribute("value"));

        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("admin");
        password.sendKeys(Keys.ENTER);

        Alert alert = driver.switchTo().alert();
        alert.accept(); //ok - 1 alert
        alert.accept(); //ok - 2 alert

    }
}
