package dzialania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Klikanie {

    @Test
    public void klikanieNaElement() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement clickOnLink = driver.findElement((By.linkText("Podstawowa strona testowa")));
        //WebElement clickOnLink = driver.findElement(By.xpath("//a[text()='Podstawowa strona testowa']"));
        clickOnLink.click();

        WebElement clickOnButton = driver.findElement(By.id("clickOnMe"));
        clickOnButton.click();
    }
}