package selektory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class SelectorByTest {

    @Test
    public void findElement(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement buttonId = driver.findElement(By.id("clickOnMe"));
        //buttonId.click();

        WebElement parHidden = driver.findElement(By.className("topSecret"));

        WebElement linkText = driver.findElement(By.linkText("Visit W3Schools.com!"));
        //WebElement linkText = driver.findElement(By.partialLinkText("Visit"));
        //linkText.click();

        WebElement inputName = driver.findElement(By.name("fname"));
        inputName.sendKeys("TEST");

        WebElement tagName = driver.findElement(By.tagName("input"));
        //tagName.sendKeys("Pierwszy input");

        List<WebElement> tagsName = driver.findElements(By.tagName("input"));
        System.out.println(tagsName.size());
    }
}
