package task4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriverWait wait;
    @FindBy(xpath = "//input[@data-testid='login-email']")
    private WebElement loginField;
    @FindBy(css = "input[data-testid='login-password']")
    private WebElement passwordField;
    @FindBy(css = "input[data-testid='login-submit']")
    private WebElement enterButton;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }
    public void loginInSystem(String login, String password) {
        wait.until(ExpectedConditions.visibilityOf(loginField)).sendKeys(login);
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(enterButton)).click();
    }
    public void loginInSystem(String login) {
        wait.until(ExpectedConditions.visibilityOf(loginField)).sendKeys(login);
        wait.until(ExpectedConditions.elementToBeClickable(enterButton)).click();
    }

}
