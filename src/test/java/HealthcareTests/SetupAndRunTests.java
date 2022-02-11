package HealthcareTests;

import HealthcarePages.AppointmentPage;
import HealthcarePages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetupAndRunTests {
    WebDriver driver;
    String url = "https://katalon-demo-cura.herokuapp.com/";


    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void loginTest() {
        LoginPage page = new LoginPage(driver);
        driver.get(url);

        page.verifyPageTitle();
        page.makeAppointment();
        page.enterUserName("John Doe");
        page.enterPassword("ThisIsNotAPassword");
        page.clickLogin();

    }


    @Test
    public void makeAppointmentTest() {
        AppointmentPage appPage = new AppointmentPage(driver);

        loginTest();
        appPage.SelectFacility();
        appPage.ClickReadmissionCheckBox();
        appPage.ClickRadioProgramMedicaid();
        appPage.ClickRadioProgramMedicare();
        appPage.ClickRadioProgramNone();
        appPage.ClickRadioProgramMedicaid();
        appPage.EnterVisitDate();
        appPage.EnterComment();
        appPage.ClickBtnAppointment();
    }

}
