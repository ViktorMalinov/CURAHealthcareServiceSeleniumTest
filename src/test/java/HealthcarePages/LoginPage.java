package HealthcarePages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    String pageTitle = "CURA Healthcare Service";

    @FindBy(id = "btn-make-appointment") WebElement btnMakeAppointment;
    @FindBy(id = "txt-username") WebElement inputUserName;
    @FindBy(id = "txt-password") WebElement inputPassword;
    @FindBy(id = "btn-login") WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyPageTitle() {
        Assertions.assertEquals(pageTitle, driver.getTitle());
    }

    public void makeAppointment() {
        btnMakeAppointment.click();
    }

    public void enterUserName(String username) {
        inputUserName.clear();
        inputUserName.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }
}
