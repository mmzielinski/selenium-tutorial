package dzialania;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;


public class NoweOkno {

    @Test
    public void newPage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        String currentWindow = driver.getWindowHandle();

        WebElement clickMe = driver.findElement(By.id("newPage"));
        clickMe.click();

       Set<String> windowNames = driver.getWindowHandles();
        for (String window : windowNames) {
            if(!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }


        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        agreeButton.click();

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);

        driver.switchTo().window(currentWindow);
        WebElement firstName = driver.findElement(By.id("fname"));
        firstName.sendKeys("Marcin");
    }
}
