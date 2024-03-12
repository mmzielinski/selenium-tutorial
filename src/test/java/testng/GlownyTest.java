package testng;

import org.testng.annotations.*;

public class GlownyTest {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }
}
