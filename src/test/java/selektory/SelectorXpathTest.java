package selektory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SelectorXpathTest {

    @Test
    public void findElement(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement xpId = driver.findElement(By.xpath("//button[@id='clickOnMe']"));
        WebElement xpClass = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement xpName = driver.findElement(By.xpath("//input[@name='fname']"));
        WebElement xpTag = driver.findElement(By.xpath("//input"));

        WebElement xpText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        WebElement xpText2 = driver.findElement(By.xpath("//a[contains(text(), 'W3Schools')]"));

        WebElement xpAll = driver.findElement(By.xpath("//*"));
        WebElement xpScnd = driver.findElement(By.xpath("(//input)[2]"));
        WebElement xpLast = driver.findElement(By.xpath("(//input)[last()]"));
        WebElement xpElement = driver.findElement(By.xpath("//*[@name]"));

        WebElement AttrEq = driver.findElement(By.xpath("//button[@id='clickOnMe']"));
        WebElement AttrNotEq = driver.findElement(By.xpath("//button[@id!='clickOnMe']"));
        WebElement AttrCont = driver.findElement(By.xpath("//*[contains(@name, 'ame')]"));
        WebElement Starts = driver.findElement(By.xpath("//*[starts-with(@name, 'user')]"));

        WebElement child = driver.findElement(By.xpath("//div/child::ul"));
        WebElement desc = driver.findElement(By.xpath("//div/descendant::ul"));
        WebElement parent = driver.findElement(By.xpath("//div/../.."));
        WebElement asc = driver.findElement(By.xpath("//div/ancestor::*"));
        WebElement foll = driver.findElement(By.xpath("//img/following::*"));
        WebElement follSib = driver.findElement(By.xpath("//img/following-sibling::*"));
        WebElement prec = driver.findElement(By.xpath("//img/preceding::*"));
        WebElement precSib = driver.findElement(By.xpath("//img/preceding-sibling::*"));

        WebElement divsAndLinks = driver.findElement(By.xpath("//a | //div"));
        WebElement andOp = driver.findElement(By.xpath("//input[@name='fname' and @id='fname']"));
        WebElement orOp = driver.findElement(By.xpath("//input[@name='fname' or @id='fnam']"));
    }
}