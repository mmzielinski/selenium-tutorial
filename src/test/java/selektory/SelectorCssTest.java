package selektory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SelectorCssTest {

    @Test
    public void findElement(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement cssId = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement cssClass = driver.findElement(By.cssSelector(".topSecret"));
        WebElement cssClass2 = driver.findElement(By.cssSelector("[class='topSecret']"));
        WebElement cssName = driver.findElement(By.cssSelector("[name='fname']"));
        WebElement cssTag = driver.findElement(By.cssSelector("input"));


        WebElement attrTag = driver.findElement(By.cssSelector("input[name='fname']"));
        WebElement attrContain = driver.findElement(By.cssSelector("[name*='name']"));
        WebElement attrStarts = driver.findElement(By.cssSelector("[name^='f']"));
        WebElement attrEnds = driver.findElement(By.cssSelector("[name$='ame']"));


        WebElement firstChild = driver.findElement(By.cssSelector("li:first-child"));
        WebElement lastChild = driver.findElement(By.cssSelector("li:last-child"));
        WebElement thirdChild = driver.findElement(By.cssSelector("li:nth-child(3)"));
    }
}