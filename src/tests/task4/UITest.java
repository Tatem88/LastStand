package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class UITest extends AbstractTest {

    @Test
    void testGBNotEmailLogin() throws InterruptedException {
        driver.get("https://gb.ru/login");

        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.loginInSystem("login", "password");

        List<WebElement> search = driver.findElements(By.cssSelector("ul#parsley-id-5"));
        Assertions.assertFalse(search.isEmpty());
    }

    @Test
    void testGBWithoutPassword() {
        driver.get("https://gb.ru/login");

        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.loginInSystem("login@login.ru");

        List<WebElement> search = driver.findElements(By.cssSelector("ul#parsley-id-7"));
        Assertions.assertFalse(search.isEmpty());

    }

}