package selektory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class SelectorTagTest {

    @Test
    public void findElement(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


        WebElement tagName = driver.findElement(By.tagName("input"));
        tagName.sendKeys("Pierwszy input");

        List<WebElement> tagsName = driver.findElements(By.tagName("input"));
        System.out.println(tagsName.size());
    }
}
